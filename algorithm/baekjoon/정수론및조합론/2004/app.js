const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs
  .readFileSync(filePath)
  .toString()
  .split(" ")
  .map((item) => +item);

let N = input[0];
let M = input[1];

solution(N, M);
function CNT(num) {
  let two = 0;
  let five = 0;

  // 5의 인자가 몇 개 있는지 확인
  for (let i = 5; i <= num; i *= 5) {
    five += parseInt(num / i);
  }
  // 2의 인자가 몇 개 있는지 확인
  for (let i = 2; i <= num; i *= 2) {
    two += parseInt(num / i);
  }

  return [two, five];
}

function solution(N, M) {
  let K = N - M;

  //분모의 2의 개수, 5의 개수
  let cntN = CNT(N);
  //분자의 2의 개수, 5의 개수
  let cntK = CNT(K);
  let cntM = CNT(M);

  // 2의 개수 구하기
  let cnt2 = cntN[0] - cntK[0] - cntM[0];
  // 5의 개수 구하기
  let cnt5 = cntN[1] - cntK[1] - cntM[1];

  // 더 작은 수를 출력
  console.log(Math.min(cnt2, cnt5));
}
