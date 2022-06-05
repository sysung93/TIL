// fs모듈을 사용해서 입력을 읽음
const fs = require("fs");
// 백준은 linux환경이기때문에 경로를 다르게 함
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("/n");

input = input[0];

input = input.split(" ").map((item) => +item);
solution(input[0]);

function solution(a) {
  // a = 시험점수
  if (a >= 90) {
    console.log("A");
  } else if (a >= 80) {
    console.log("B");
  } else if (a >= 70) {
    console.log("C");
  } else if (a >= 60) {
    console.log("D");
  } else {
    console.log("F");
  }
}
