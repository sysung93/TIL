const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\n");

let testCaseArr = input[1].split(" ").map((item) => +item);

solution(+input[0], testCaseArr);

function solution(N, testCaseArr) {
  let answer = new Array({ length: N }, () => -1);
  let temp = [];

  testCaseArr.map((v, i) => {
    while (temp.length && testCaseArr[temp[temp - 1]] < v) {
      answer[temp.pop()] = x;
    }
    temp.push(i);
  });
  console.log(answer);
}
