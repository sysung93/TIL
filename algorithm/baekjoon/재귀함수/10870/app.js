const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs
  .readFileSync(filePath)
  .toString()
  .split("\n")
  .map((item) => +item);

solution(input[0]);

function solution(num) {
  function DFS(N) {
    // N이 0일때 0을 리턴
    if (N === 0) {
      return 0;
      // N 이 1이거나 2이면 1를 리턴
    } else if (N === 1 || N === 2) {
      return 1;
    } else {
      // 3이상일때는 N-1 + N -2를 리턴
      return DFS(N - 1) + DFS(N - 2);
    }
  }

  console.log(DFS(num));
}
