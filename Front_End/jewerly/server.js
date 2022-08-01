//express 라이브러리 사용
const express = require("express");
const app = express();

const bodyParser = require("body-parser");
app.use(bodyParser.urlencoded({ extended: true }));

//html에서 get, post 이외 delete, put 을 사용할 수 있게 해줌
const methodOverride = require("method-override");
const res = require("express/lib/response");
app.use(methodOverride("_method"));

const passport = require("passport");
const LocalStrategy = require("passport-local").Strategy;
const session = require("express-session");
//app.use(미들웨어 : 요청-응답 중간에 뭔가 실행되는 코드)
app.use(
  session({ secret: "secretCode", resave: true, saveUninitialized: false })
);
app.use(passport.initialize());
app.use(passport.session());

app.set("view engine", "ejs");
app.use("/public", express.static("public"));

const MongoClient = require("mongodb").MongoClient;
require("dotenv").config();

var db;
MongoClient.connect(process.env.DB_URL, function (err, client) {
  if (err) return console.log(err);
  db = client.db("todoapp");
  app.listen(process.env.PORT, function () {
    console.log("listening on 8080");
  });
});

app.get("/", function (req, res) {
  res.render(__dirname + "/views/index.ejs");
});

app.get("/account/login", function (req, res) {
  res.render(__dirname + "/views/login.ejs");
});

app.post(
  "account/login",
  //회원인증 실패하면
  passport.authenticate("local", { failureRedirect: "/fail" }),
  function (req, res) {
    //로그인 성공하면
    res.redirect("/");
  }
);

app.get("account/mypage", userLogin, function (req, res) {
  req.user;
  res.render("mypage.ejs", { user: req.user });
});

//마이페이지 접속 전 실행할 미들웨어
function userLogin(req, res, next) {
  if (req.user) {
    next();
  } else {
    res.send("로그인 해주세요");
  }
}

//LocalStrategy 인증하는 방법
passport.use(
  new LocalStrategy(
    {
      //form의 id, pw
      usernameField: "id",
      passwordField: "pw",
      session: true,
      passReqToCallback: false,
    },

    function (inputId, inputPw, done) {
      //console.log(입력한아이디, 입력한비번);
      db.collection("login").findOne({ id: inputId }, function (error, result) {
        if (error) return done(error);
        // done(서버에러, 성공시 사용자 DB데이터, 에러메세지)
        if (!result)
          return done(null, false, { message: "존재하지 않는 아이디입니다" });
        if (inputPw == result.pw) {
          return done(null, result);
        } else {
          return done(null, false, { message: "비밀번호를 확인해주세요" });
        }
      });
    }
  )
);

//id를 통해서 session을 저장 시키는 코드
passport.serializeUser(function (user, done) {
  done(null, user.id);
});

// 세션 데이터를 가진 사람을 DB에서 찾음
passport.deserializeUser(function (id, done) {
  //db에서 user.id로 user를 찾은 다음 user 정보를  넣음
  db.collection("login").findOne({ id: id }, function (error, result) {
    done(null, result);
  });
});

app.post("/register", function (req, res) {
  db.collection("login").insertOne(
    { id: req.body.id, pw: req.body.pw },
    function (error, result) {
      res.redirect("/");
    }
  );
});

app.get("/write", function (req, res) {
  res.render(__dirname + "/views/write.ejs");
});

app.post("/add", function (req, res) {
  res.send("전송완료");
  db.collection("counter").findOne(
    { name: "NumberOfPost" },
    function (error, result) {
      console.log(result.totalPost);
      let postNum = result.totalPost;
      let postInfo = {
        _id: postNum + 1,
        writer: req.user._id,
        title: req.body.title,
        date: req.body.date,
      };

      db.collection("post").insertOne(postInfo, function (error, result) {
        console.log("저장완료");
        db.collection("counter").updateOne(
          { name: "NumberOfPost" },
          { $inc: { totalPost: 1 } },
          function (error, result) {
            if (error) {
              return console.log(error);
            }
          }
        );
      });
    }
  );
});

app.get("/list", function (req, res) {
  db.collection("post")
    .find()
    .toArray(function (error, result) {
      console.log(result);
      res.render("list.ejs", { posts: result });
    });
});

app.get("/search", function (req, res) {
  console.log(req.query);
  var searchCondition = [
    {
      $search: {
        index: "titleSearch",
        text: {
          query: req.query.value,
          path: "title", //['조건1','조건2']
        },
      },
    },
    // {$sort: {_id:1}} 결과 정렬하기
    // {$limit : 10} 개수 limit 주기
  ];
  db.collection("post")
    //mongodb indexing
    // .find({ $text: { $search: req.query.value } })
    .aggregate(searchCondition)
    .toArray((error, result) => {
      console.log(result);
      res.render("search.ejs", { posts: result });
    });
});

app.delete("/delete", function (req, res) {
  req.body._id = parseInt(req.body._id);
  let deletePost = { _id: req.body._id, writer: req.user._id };
  db.collection("post").deleteOne(deletePost, function (error, result) {
    if (error) {
      console.log("삭제실패");
      return console.log(error);
    }
    res.send("삭제완료");
  });
});

app.get("/detail/:id", function (req, res) {
  db.collection("post").findOne(
    { _id: parseInt(req.params.id) },
    function (error, result) {
      console.log(result);
      res.render("detail.ejs", { data: result });
    }
  );
});

app.get("/edit/:id", function (req, res) {
  db.collection("post").findOne(
    { _id: parseInt(req.params.id) },
    function (error, result) {
      console.log(result);
      res.render("edit.ejs", { post: result });
    }
  );
});

app.put("/edit", function (req, res) {
  db.collection("post").updateOne(
    { _id: parseInt(req.body.id) },
    { $set: { title: req.body.title, date: req.body.date } },
    function () {
      console.log("수정완료");
      res.redirect("/list");
    }
  );
});

app.use("/shop", require("./routes/shop.js"));

let multer = require("multer");
var storage = multer.diskStorage({
  destination: function (req, file, cb) {
    cb(null, "./public/images");
  },
  filename: function (req, file, cb) {
    cb(null, file.originalname);
  },
  // filefilter : fucntion(req, file, cb) 파일 거르기
});

var upload = multer({ storage: storage });

app.get("/upload", function (req, res) {
  res.render("upload.ejs");
});

//upload.array : 여러개

//파일 , input도 여러개로 바꿔야함
app.post("/upload", upload.single("profile"), function (req, res) {
  res.send("업로드완료");
});

app.get("/images/:imageName", function (req, res) {
  res.sendFile(__dirname + "/public/images" + req.params.imageName);
});
