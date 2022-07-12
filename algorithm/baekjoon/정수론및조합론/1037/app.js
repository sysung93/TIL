const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = input[1].split(" ").map((item) => +item);

solution(+input[0], testCaseArr);

function solution(N, factorArr) {
  // 약수 정렬하기
  factorArr.sort((a, b) => a - b);
  let answer = 0;

  // 약수가 1개라면 1개의 약수끼리 곱하기
  if (factorArr.length === 1) {
    answer = factorArr[0] * factorArr[0];
    // 약수가 1개 이상이라면 가장 작은 약수 * 가장 큰 약수
  } else {
    answer = factorArr[0] * factorArr[factorArr.length - 1];
  }

  console.log(answer);
}
