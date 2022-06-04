// fs모듈을 사용해서 입력을 읽음
const fs = require("fs");
// 백준은 linux환경이기때문에 경로를 다르게 함
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
//한줄씩 읽기
let input = fs.readFileSync(filePath).toString().split("/n");

input = input[0];

// 띄어쓰기를 기준으로 나누기
input = input.split(" ").map((item) => +item);
solution(input[0], input[1], input[2]);

function solution(A, B, C) {
  console.log((A + B) % C);
  console.log(((A % C) + (B % C)) % C);
  console.log((A * B) % C);
  console.log(((A % C) * (B % C)) % C);
}
