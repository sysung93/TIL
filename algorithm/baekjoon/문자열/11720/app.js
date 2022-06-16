const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(input[0], input[1]);

function solution(N, arr) {
  let answer = 0;
  // 공백없이 주어진 숫자를 문자열로 받은 뒤 
  // for문을 통해 한 개씩 숫자로 변환하면서 더하기
  for (let i = 0; i < N; i++) {
    answer += +arr[i];
  }
  console.log(answer);
}
