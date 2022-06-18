const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0]);

function solution(num) {
  let answer = 0;

  let block = 1;
  let range = 1;

  // 6의 배수로 늘어남
  while (block < num) {
    block += 6 * range;
    range++;
  }
  console.log(range);
}
