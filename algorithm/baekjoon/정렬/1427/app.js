const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(input[0]);

function solution(N) {
  let answer = [];
  // N을 배열로 만들어 저장하기
  for (let i of N) {
    answer.push(i);
  }

  // 내림차순으로 정렬하기
  answer.sort((a, b) => b - a);

  // 출력
  console.log(answer.join(""));
}
