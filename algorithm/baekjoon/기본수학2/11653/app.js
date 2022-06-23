const fs = require("fs");
const { parse } = require("path");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0]);

function solution(N) {
  let i = 2;
  let num = N;

  // 소수가 아닌 1을 제외 하고 2부터 나눠보기 시작한다.
  // 반복해서 나누면서 출력하기, 나머지가 0이아니면 1증가하므로
  // 지나온 숫자의 배수들은 건너뛰게 된다.
  while (num !== 1) {
    if (num % i === 0) {
      console.log(i);
      num = num / i;
    } else {
      i++;
    }
  }
}
