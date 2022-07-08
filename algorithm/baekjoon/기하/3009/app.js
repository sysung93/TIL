const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let coordinate = [];

for (let i = 0; i < 3; i++) {
  let temp = input[i].split(" ").map((item) => +item);
  coordinate.push({ X: temp[0], Y: temp[1] });
}

solution(coordinate);

function solution(coordinate) {
  // X, Y 좌표로 각각 나누기
  const Xpoint = [];
  const Ypoint = [];

  for (let i = 0; i < 3; i++) {
    Xpoint.push(coordinate[i].X);
    Ypoint.push(coordinate[i].Y);
  }

  // 좌표 정렬하기
  Xpoint.sort();
  Ypoint.sort();

  // X,Y 좌표에서 짝이 안맞는 것을 찾으면 됨
  // 0번과 1번이 같다면 2번이 남고, 다르다면 1번과 2번이 같으므로 0번이 남음
  let x = Xpoint[0] === Xpoint[1] ? Xpoint[2] : Xpoint[0];
  let y = Ypoint[0] === Ypoint[1] ? Ypoint[2] : Ypoint[0];

  console.log(x, y);
}
