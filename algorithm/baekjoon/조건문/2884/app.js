// fs모듈을 사용해서 입력을 읽음
const fs = require("fs");
// 백준은 linux환경이기때문에 경로를 다르게 함
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("/n");

input = input[0];
input = input.split(" ").map((item) => +item);
solution(input[0], input[1]);

function solution(H, M) {
  M -= 45;
  if (M < 0) {
    M += 60;
    H -= 1;
  }
  if (H < 0) {
    H = 23;
  }
  console.log(H, M);
}
