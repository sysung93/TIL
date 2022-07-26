const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(input[0]);

function solution(str) {
  // 뺄셈을 기준으로 문자열 분리하기
  let numStr = str.split("-");
  let num = [];

  // 분리된 문자열에 더하기 연산자 먼저 계산하기
  for (let i = 0; i < numStr.length; i++) {
    let sum = 0;
    let temp = numStr[i].split("+");
    for (let j = 0; j < temp.length; j++) {
      sum += +temp[j];
    }
    num.push(sum);
  }

  //더하기가 계산된 숫자에 빼기 연산자 계산해주기
  let answer = num[0];
  for (let i = 1; i < num.length; i++) {
    answer -= num[i];
  }
  console.log(answer);
}
