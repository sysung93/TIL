// fs모듈을 사용해서 입력을 읽음
const fs = require("fs");
// 백준은 linux환경이기때문에 경로를 다르게 함
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
//한줄씩 읽기
let input = fs.readFileSync(filePath).toString().split("/n");

input = input[0];

// 띄어쓰기를 기준으로 나누기
input = input.split("\n").map((item) => +item);
solution(input[0], input[1]);

function solution(A, B) {
  // 472 * 5
  let a = A * (B % 10);
  // 472 * 8
  let b = A * (Math.floor(B / 10) % 10);
  // 472 * 3
  let c = A * Math.floor(B / 100);

  console.log(a);
  console.log(b);
  console.log(c);
  console.log(a + b * 10 + c * 100);
}
