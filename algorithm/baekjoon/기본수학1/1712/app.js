const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

input = input[0];
input = input.split(" ").map((item) => +item);

solution(input[0], input[1], input[2]);

function solution(A, B, C) {
  // 마진
  let margin = C - B;

  // 최초로 이익이 발생하는 판매량
  let amount = Math.floor(A / margin + 1);

  console.log(margin <= 0 ? -1 : amount);
}
