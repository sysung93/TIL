const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = [];

for (let i = 1; i <= +input[0]; i++) {
  testCaseArr.push(input[i].trim());
}

solution(+input[0], testCaseArr);

function solution(N, strArr) {
  // 중복 제거해서 새로운 배열 만들기
  let answer = Array.from(new Set(strArr))
    // sort는 기본적으로 조건을 주지 않으면 사전순 정렬된다.
    .sort()
    // 짧은 길이 순으로 정렬 조건 주기
    .sort((a, b) => a.length - b.length)
    // 출력하기
    .forEach((word) => console.log(word));
}
