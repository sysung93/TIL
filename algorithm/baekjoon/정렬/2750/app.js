const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let items = [];

for (let i = 1; i <= input[0]; i++) {
  items.push(+input[i]);
}

solution(+input[0], items);

function solution(N, arr) {
  // 오름차순으로 정렬
  arr.sort((a, b) => a - b);

  // 내림차순으로 정렬
  //arr.sort((a, b) => b - a);

  for (let i = 0; i < N; i++) {
    console.log(arr[i]);
  }
}
