const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

const arrayLength = +input[0];
const items = input[1].split(" ").map((item) => +item);

solution(arrayLength, items);

function solution(N, M) {
  // max에 정수 중 가장 작은 수
  let max = Number.MIN_SAFE_INTEGER;
  // min에 정수 중 가장 큰 수
  let min = Number.MAX_SAFE_INTEGER;

  for (let i of M) {
    if (i > max) {
      max = i;
    }
    if (i < min) {
      min = i;
    }
  }
  console.log(min, max);
}
