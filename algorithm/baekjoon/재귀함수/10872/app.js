const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0]);

function solution(N) {
  function DFS(N) {
    // N이 0인경우 1을 리턴
    if (N === 0) {
      return 1;
    } else {
      // n * n -1
      return N * DFS(N - 1);
    }
  }
  // DFS(N)을 answer에 누적
  answer = DFS(N);
  console.log(answer);
}
