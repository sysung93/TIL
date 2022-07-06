const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

// N : 주어지는 문자열 개수
// M : 검사대상 문자열 개수
let NM = input[0].split(" ").map((item) => +item);
let N = NM[0];
let M = NM[1];

// 집합 S
let S = [];
for (let i = 1; i <= N; i++) {
  S.push(input[i].trim());
}

// 검사대상 문자열
let checkStr = [];
for (let j = N + 1; j <= N + M; j++) {
  checkStr.push(input[j].trim());
}

solution(N, M, S, checkStr);

function solution(N, M, S, checkStr) {
  // 집합 S를 set에 저장
  const set = new Set(S);
  let cnt = 0;

  // 검사대상문자열을 돌면서 set에 있는지 확인
  checkStr.forEach((val) => {
    if (set.has(val)) {
      cnt++;
    }
  });

  console.log(cnt);
}
