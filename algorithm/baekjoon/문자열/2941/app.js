const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync.toString().split("\n");

solution(input[0]);

function solution(str) {
  let alpha = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="];
  let cnt = 0;
  for (let i = 0; i < alpha.length; i++) {
    if (str.includes(alpha[i])) {
      console.log("YES");
    }
  }
}
