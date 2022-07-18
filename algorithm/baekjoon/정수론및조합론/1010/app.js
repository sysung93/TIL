const fs = require("fs");
const { DefaultSerializer } = require("v8");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = [];
for (let i = 1; i <= +input[0]; i++) {
  let temp = input[i].split(" ").map((item) => +item);
  testCaseArr.push({ N: temp[0], M: temp[1] });
}

solution(+input[0], testCaseArr);
function DFS(num) {
  if (num === 0) {
    return 1;
  } else {
    return num * DFS(num - 1);
  }
}

function solution(T, testCaseArr) {
  

  for (let i = 0; i < T; i++) {
    let m = testCaseArr[i].M;
    let n = testCaseArr[i].N;

    let k = m - n;
    let up = DFS(m);
    let down = DFS(k) * DFS(n);
    console.log(Math.round(up / down));
  }
}
