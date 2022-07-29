const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().trim().split("\r\n");

solution(input);
function solution(testCaseArr) {
  let last = testCaseArr.indexOf(".");
  let answer = "";

  for (let i = 0; i < last; i++) {
    let temp = [];
    for (let j of testCaseArr[i]) {
      if (j === "(" || j === "[") {
        temp.push(j);
      } else if (j === ")" || j === "]") {
        if (temp.length === 0) {
          answer = "no";
          break;
        } else if (j === ")") {
          if (temp.includes("(")) temp.pop();
        } else if (j === "]") {
          if (temp.includes("[")) temp.pop();
        } else {
          answer = "no";
        }
      } else {
        continue;
      }

      if (temp.length === 0) {
        answer = "yes";
      } else {
        answer = "no";
      }
    }
    console.log(answer);
  }
}
