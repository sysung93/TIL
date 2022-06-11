const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

const items = input.map((item) => +item);
solution(items);

function solution(arr) {
  let max = Number.MIN_SAFE_INTEGER;
  let cnt = 0;

  for (let i of arr) {
    if (i > max) {
      max = i;
    }
  }

  // 배열의 인덱스를 반환하는 메서드
  idx = arr.indexOf(max);

  console.log(max);
  console.log(idx + 1);
}
