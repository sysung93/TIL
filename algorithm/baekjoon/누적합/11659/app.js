const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let NM = input[0].split(" ").map((item) => +item);
// 수의 개수
let N = NM[0];
// 합을 구해야 하는 횟수
let M = NM[1];

// 숫자 배열
let nArr = input[1].split(" ").map((item) => +item);

// 숫자 구간
let testCaseArr = [];
for (let i = 2; i < M + 2; i++) {
  let temp = input[i].split(" ").map((item) => +item);
  testCaseArr.push({ I: temp[0], J: temp[1] });
}

solution(N, M, nArr, testCaseArr);

function solution(N, M, nArr, testCaseArr) {
  let DP = Array.from({ length: N + 1 }, () => 0);
  nArr.forEach((v, i) => {
    DP[i + 1] = DP[i] + v;
  });

  let answer = [];
  for (let i = 0; i < M; i++) {
    let I = testCaseArr[i].I;
    let J = testCaseArr[i].J;

    answer.push(DP[J] - DP[I - 1]);
  }

  console.log(answer.join("\n"));
}
