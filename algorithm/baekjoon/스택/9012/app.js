const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = [];
for (let i = 1; i <= input[0]; i++) {
  // let temp = input[i].split("\n");
  // testCaseArr.push(temp);
  let temp = input[i].split("/r");
  testCaseArr.push(temp);
}
solution(+input[0], testCaseArr);

function solution(K, testCaseArr) {
  let answer = [];
}
