const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = [];
for (let i = 1; i <= +input[0]; i++) {
  testCaseArr.push(+input[i]);
}
solution(+input[0], testCaseArr);
function gcd(a, b) {
  if (b === 0) {
    return a;
  } else {
    return gcd(b, a % b);
  }
}

function solution(N, testCaseArr) {
  // 인접한 수들을 정렬한다.
  // gcd에 들어갈 매개변수가 음수가 되지 않기 위해서
  testCaseArr.sort((a, b) => a - b);

  // gcd에 들어갈 변수 만들기
  let reNum = [];
  for (let i = 0; i < N - 1; i++) {
    reNum.push(testCaseArr[i + 1] - testCaseArr[i]);
  }

  // 최대 공약수 구하기
  let M = 0;
  let temp = reNum[0];
  for (let i = 1; i < reNum.length; i++) {
    M = gcd(temp, reNum[i]);
    temp = M;
  }

  // 최대공약수의 약수 구하기
  let answer = [];
  for (let i = 2; i <= M; i++) {
    if (M % i === 0) answer.push(i);
  }

  // 오름차순으로 정렬 후 출력하기
  answer.sort((a, b) => a - b);
  console.log(answer.join(" "));
}
