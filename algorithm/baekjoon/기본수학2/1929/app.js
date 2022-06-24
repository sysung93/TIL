const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

items = input[0].split(" ").map((item) => +item);
solution(items[0], items[1]);

function solution(M, N) {
  // N개의 개수를 가진 true 배열 만들기
  // 인덱스번호는 0부터 시작이므로 N + 1
  let isPrimeNumber = Array(N + 1).fill(true);

  // 0과 1은 소수가 아니므로 false처리하기
  isPrimeNumber[0] = isPrimeNumber[1] = false;

  // N의 제곱근까지 반복시키면서
  // i * k에 해당하는 수는 거르기 위한 코드

  for (let i = 2; i <= Math.ceil(Math.sqrt(N)); i++) {
    // isPrimeNumber[i]가 true이면
    if (isPrimeNumber[i]) {
      // i의 k는 배수를 거르기 위해 곱해줄 수
      let k = 2;
      // i * K가 N이 될 때까지 반복
      while (i * k <= N) {
        // i * k 에 해당하는 것은 false
        isPrimeNumber[i * k] = false;
        // k증가
        k++;
      }
    }
  }

  // M ~ N 까지 반복
  for (let i = M; i <= N; i++) {
    // isPrimeNumber가 true인 것의 인덱스 출력
    if (isPrimeNumber[i]) {
      // i 출력
      console.log(i);
    }
  }
}
