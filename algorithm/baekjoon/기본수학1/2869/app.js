const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

input = input[0];
input = input.split(" ").map((item) => +item);

solution(input[0], input[1], input[2]);

function solution(A, B, V) {
  let days = 0;

  // 정상에 도착하면 미끄러지지 않으니 V - B
  // 하루 올라갈수있는 높이 A - B
  days = Math.ceil((V - B) / (A - B));
  console.log(days);
}
