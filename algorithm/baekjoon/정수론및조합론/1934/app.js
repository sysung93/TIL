const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = [];
for (let i = 1; i <= +input[0]; i++) {
  let temp = input[i].split(" ").map((item) => +item);
  testCaseArr.push({ A: temp[0], B: temp[1] });
}
solution(+input[0], testCaseArr);
// 최대공약수 구하기
// 유클리드 호제법
function gcd(a, b) {
  // b가 0이면 a를 return
  if (b === 0) {
    return a;
    //0이 아니라면 a = b, b = a % b를 리턴
  } else {
    return gcd(b, a % b);
  }
}

function solution(T, testCaseArr) {
  for (let i = 0; i < T; i++) {
    // test케이스 중 큰 숫자를 a, 작은 숫자를 b로 정하기
    let a = Math.max(testCaseArr[i].A, testCaseArr[i].B);
    let b = Math.min(testCaseArr[i].A, testCaseArr[i].B);

    // 최소공배수 = a * b / 최대공약수
    let lcm = (a * b) / gcd(a, b);
    console.log(lcm);
  }
}
