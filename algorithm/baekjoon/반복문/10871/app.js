const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

const [inputN, inputX] = input[0].split(" ").map((item) => +item);
const arrayA = input[1].split(" ").map((item) => +item);

solution(inputN, inputX, arrayA);

function solution(N, X, A) {
  let answer = [];
  for (let i of A) {
    if (i < X) {
      answer.push(i);
    }
  }
  // 공백으로 묶어주기
  console.log(answer.join(" "));
}
