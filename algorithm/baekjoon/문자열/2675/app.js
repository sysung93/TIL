const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let arr = [];

for (let i = 1; i <= +input[0]; ++i) {
  const inputRS = input[i];
  const splitedInputRS = inputRS.split(" ");
  arr.push({
    R: +splitedInputRS[0],
    S: splitedInputRS[1],
  });
}
solution(+input[0], arr);
function solution(N, arr) {
  for (let i = 0; i < N; ++i) {
    let { R, S } = arr[i];
    let P = "";
    for (let j = 0; j < S.length; ++j) {
      for (let k = 0; k < R; ++k) {
        P += S[j];
      }
    }
    console.log(P);
  }
}
