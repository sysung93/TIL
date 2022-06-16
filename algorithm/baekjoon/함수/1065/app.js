const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0]);
// 등차수열인지 확인하기
function f(num) {
  const strNum = String(num);
  // 2자리수 이하는 모두 한수
  if (strNum.length <= 2) {
    return true;
  }
  // 3자리수 이상
  // 차이 구하기
  const diff = +strNum[1] - +strNum[0];
  const beforeNum = +strNum[1];
  for (let i = 2; i < strNum.length; i++) {
    if (strNum[i] - beforeNum !== diff) {
      return false;
    }
    // 이전 숫자 1늘리기
    beforeNum = +strNum[i];
  }
  return true;
}

function solution(N) {
  let cnt = 0;
  for (let i = 1; i <= N; i++) {
    if (f(i)) {
      cnt++;
    }
  }
  console.log(cnt);
}
