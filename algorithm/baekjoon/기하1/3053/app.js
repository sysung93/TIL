const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0]);

function solution(radius) {
  // 유클리드
  // 원의 넓이 : 반지름 * 반지름 * 파이
  let euclid = Math.pow(radius, 2) * Math.PI;
  console.log(euclid);

  // 비유클리드 : 택시기하학
  // 원의 넓이 : 2 * 반지름 * 반지름
  let nonEuclid = 2 * Math.pow(radius, 2);
  console.log(nonEuclid);
}
