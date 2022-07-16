const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let n = 0;
let k = 0;
for (let i = 0; i < 2; i++) {
  let temp = input[0].split(" ").map((item) => +item);
  n = temp[0];
  k = temp[1];
}

solution(n, k);

function solution(n, k) {
  function DFS(n) {
    if (n === 0) {
      return 1;
    } else {
      return n * DFS(n - 1);
    }
  }

  let m = n - k;

  // 분자
  let N = DFS(n);
  // 분모
  let D = DFS(m) * DFS(k);

  console.log(N / D);
}
