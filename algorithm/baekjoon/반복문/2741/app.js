// fs모듈을 사용해서 입력을 읽음
const fs = require("fs");
// 백준은 linux환경이기때문에 경로를 다르게 함
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("/n");

solution(+input[0]);

function solution(n) {
  for (let i = 1; i <= n; i++) {
    console.log(i);
  }
}
