const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = [];

for (let i = 1; i <= +input[0]; i++) {
  let temp = input[i].trim().split("/r");

  testCaseArr.push(temp);
}

solution(+input[0], testCaseArr);

function solution(N, testCaseArr) {
  testCaseArr = testCaseArr.flat();

  let answer = "";
  for (let i = 0; i < N; i++) {
    let temp = [];
    for (let j of testCaseArr[i]) {
      // "("인 경우 temp에 push
      if (j === "(") {
        temp.push(j);
      }
      // ")"인 경우
      else {
        // temp가 비어있으면 짝이 맞지 않으므로 NO
        if (temp.length === 0) {
          answer = "NO";
          break;
        }
        // "("가 있으면 temp에서 빼기
        else if (temp.includes("(")) {
          temp.pop();
        }
      }

      // temp에 아무것도 남지 않아야한다.
      if (temp.length === 0) {
        answer = "YES";
      } else {
        answer = "NO";
      }
    }
    console.log(answer);
  }
}
