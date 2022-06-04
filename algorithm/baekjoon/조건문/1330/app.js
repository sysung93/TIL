// fs모듈을 사용해서 입력을 읽음
const fs = require("fs");
// 백준은 linux환경이기때문에 경로를 다르게 함
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("/n");

input = input[0];
input = input.split(" ").map((item) => +item);
solution(input[0], input[1]);

function solution(a, b) {
  if (a > b) {
    console.log(">");
  } else if (a < b) {
    console.log("<");
  } else {
    console.log("==");
  }
}
