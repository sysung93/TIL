const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");
solution(input[0]);

function solution(str) {
  // 문자열을 아스키코드로 변환
  let answer = str.charCodeAt();
  console.log(answer);
}
