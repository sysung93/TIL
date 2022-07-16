const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = input[1].split(" ").map((item) => +item);

solution(+input[0], testCaseArr);
// 최대 공약수 구하기
function gcd(a, b) {
  while (a % b !== 0) {
    let r = a % b;
    if (r !== 0) {
      a = b;
      b = r;
    }
  }
  return b;
}

function solution(N, testCaseArr) {
  let M = +testCaseArr[0];

  for (let i = 1; i < N; i++) {
    let T = testCaseArr[i];
    let num = gcd(M, T);
    // 분수로 나타내기
    console.log(`${M / num}/${T / num}`);
  }
}
