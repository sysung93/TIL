// fs모듈을 사용해서 입력을 읽음
const fs = require("fs");
// 백준은 linux환경이기때문에 경로를 다르게 함
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("/n");

// 문자를 숫자로 변환
solution(+input[0]);

function solution(a) {
  // a = 연도
  // 조건 1 : a가 4의 배수이면서 100의 배수가 아닐 때
  // 조건 2 : 또는 400의 배수일 때
  if ((a % 4 === 0 && a % 100 !== 0) || a % 400 === 0) {
    console.log(1);
  } else {
    console.log(0);
  }
}
