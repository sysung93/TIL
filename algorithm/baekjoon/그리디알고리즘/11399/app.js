const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let nArr = input[1].split(" ").map((item) => +item);

solution(+input[0], nArr);

function solution(N, nArr) {
  let answer = 0;
  nArr.sort((a, b) => a - b);

  let sumArr = Array.from({ length: N + 1 }, () => 0);
  sumArr[0] = 0;
  nArr.forEach((v, i) => {
    sumArr[i + 1] = sumArr[i] + v;
  });

  for (let i of sumArr) {
    answer += i;
  }
  console.log(answer);
}
