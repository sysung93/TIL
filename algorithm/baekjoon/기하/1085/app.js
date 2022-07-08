const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

input = input[0].split(" ").map((item) => +item);

solution(input);

function solution(coordinate) {
  const x = coordinate[0];
  const y = coordinate[1];
  const w = coordinate[2];
  const h = coordinate[3];

  let min = 0;

  let left = x - 0;
  let right = w - x;
  let top = h - y;
  let bottom = y - 0;

  min = Math.min(left, right, top, bottom);
  console.log(min);
}
