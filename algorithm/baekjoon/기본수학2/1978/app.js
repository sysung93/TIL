const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let N = +input[0];
let arr = input[1].split(" ").map((item) => +item);

solution(N, arr);

// 소수 판별 함수
function isPrime(n) {
  // 2, 3은 소수임
  if (n === 2 || n === 3) {
    return true;
  }

  // n이 1이거나 2로 나눠지면 소수가 아님
  if (n <= 1 || n % 2 === 0) {
    return false;
  }

  // n의 제곱근을 3부터 홀수로 나눠봤을 때 나눠지면 소수가 아님
  for (let i = 3; i <= Math.sqrt(n); i += 2) {
    if (n % i === 0) {
      return false;
    }
  }

  // 위의 조건을 모두 통과하면 소수임
  return true;
}

function solution(N, arr) {
  //약수가 1과 자기 자신만을 약수로 가지는 수
  let cnt = 0;

  for (let i = 0; i < N; i++) {
    if (isPrime(arr[i])) {
      cnt++;
    }
  }
  console.log(cnt);
}
