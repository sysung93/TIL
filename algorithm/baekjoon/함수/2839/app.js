const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0]);

function solution(N) {
  let s = 3;
  let m = 5;
  let cnt = 0;

  while (true) {
    // 5kg 으로 나눌 수 있으면 나눈만큼 cnt 누적
    if (N % m === 0) {
      cnt += N / m;
      break;
    }

    // N-3kg 후 cnt 1누적
    N -= s;
    cnt += 1;

    // N이 0보다 작은 경우 -1 반환
    if (N < 0) {
      cnt = -1;
      break;
    }
  }

  console.log(cnt);
}
