const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0], +input[1]);

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

function solution(M, N) {
  // 약수란 1과 자기 자신만을 약수로 가지는 수
  let prime = [];
  let sum = 0;
  for (let i = M; i <= N; i++) {
    if (isPrime(i)) {
      prime.push(i);
      sum += i;
    }
  }

  if (prime.length === 0) {
    console.log(-1);
  } else {
    console.log(sum);
    console.log(Math.min(...prime));
  }
}
