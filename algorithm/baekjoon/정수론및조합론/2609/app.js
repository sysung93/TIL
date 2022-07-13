const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = input[0].split(" ").map((item) => +item);

solution(testCaseArr);

function solution(numArr) {
  let a = Math.max(numArr[0], numArr[1]);
  let b = Math.min(numArr[0], numArr[1]);

  // 최대공약수 : 두 자연수의 공통된 약수 중 가장 큰 수
  // 나누어 떨어질때까지 반복하기
  // 나누어 떨어진 수가 최대 공약수
  let gcd = 1;
  while (a % b !== 0) {
    // 큰 수를 작은 수로 나눈 나머지 구하기
    let r = a % b;
    // 두 수중 작은 수를 다시 나머지로 나누기
    if (r !== 0) {
      a = b;
      b = r;
    }
  }
  gcd = b;

  // 최소공배수 : 두 자연수의 공통된 배수 중 가장 작은 수
  // 최소공배수 = a * b / 최대 공약수
  let lcm = (numArr[0] * numArr[1]) / gcd;

  console.log(gcd);
  console.log(lcm);
}
