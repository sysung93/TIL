const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(input[0]);

function solution(str) {
  let set = new Set();
  for (let i = 0; i <= str.length; i++) {
    for (let j = 0; j <= str.length; j++) {
      let s = "";
      // 입력받은 문자열 자르기
      s += str.slice(j, i);
      // s의 길이가 5를 안넘어 가는 것만 추가
      if (s.length <= str.length) {
        // 중복되는 것은 추가 안됨
        set.add(s);
      }
    }
  }
  // set에는 s 선언시 빈문자열이 들어가있기 때문에
  // set길이 - 1해줘야 한다.
  console.log(set.size - 1);
}
