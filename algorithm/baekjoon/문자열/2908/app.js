const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(input[0]);

function solution(num) {
  // 입력받은 문자열 분리하기
  let numSplit = num.split(" ");
  // 뒤집은 문자열을 저장할 배열만들기
  let newNum = Array(numSplit.length);

  let max = Number.MIN_SAFE_INTEGER;
  // 문자열 뒤집어서 숫자로 저장
  for (let i = 0; i < numSplit.length; i++) {
    newNum[i] = +numSplit[i].split("").reverse().join("");

    // 비교하기
    max = Math.max(max, newNum[i]);
  }
  console.log(max);
}
