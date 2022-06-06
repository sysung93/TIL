// fs모듈을 사용해서 입력을 읽음
const fs = require("fs");
// 백준은 linux환경이기때문에 경로를 다르게 함
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("/n");

input = input[0];
input = input.split(" ").map((item) => +item);
solution(input[0], input[1], input[2]);

function solution(a, b, c) {
  let answer = 0;
  // 같은 눈 3개 나오는 경우
  if (a === b && b === c) {
    answer = 10000 + a * 1000;
  }
  // 같은 눈 2개 나오는 경우
  else if (a === b || a === c || b === c) {
    if (a === b || a === c) {
      answer = 1000 + a * 100;
    }
    if (b === c) {
      answer = 1000 + b * 100;
    }
  }
  // 모두 다른 경우
  else {
    let max = Math.max(a, b, c);
    answer = max * 100;
  }

  console.log(answer);
}
