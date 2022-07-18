const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0]);

function solution(N) {
  let cnt = 0;

  while (N >= 5) {
    cnt += Math.floor(N / 5);

    N = N / 5;
  }
  console.log(cnt);
}
