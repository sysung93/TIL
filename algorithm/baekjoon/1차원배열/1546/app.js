const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let N = input[0];
let score = input[1].split(" ").map((item) => +item);

solution(N, score);

function solution(N, score) {
  // 최대값찾기
  let M = Math.max(...score);

  let newScore = [];

  // 새로운 성적 구하기
  for (let i = 0; i < N; i++) {
    let temp = (score[i] / M) * 100;
    newScore.push(temp);
  }

  // 평균 구하기
  // i가 마지막 인덱스인 경우 이전값 + 현재값 / 과목 수 해서 평균구하기
  // 마지막 인덱스가 아닌경우 값 더해서 누적하기
  const ave = newScore.reduce((acc, cur, i) => {
    return i === N - 1 ? (acc + cur) / N : acc + cur;
  });

  console.log(ave);
}
