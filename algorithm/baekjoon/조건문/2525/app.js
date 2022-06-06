const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let curHour = input[0].split(" ")[0];
let curMin = input[0].split(" ")[1];
let cookTime = input[1];

solution(+curHour, +curMin, +cookTime);

function solution(curHour, curMin, cookTime) {
  curMin += cookTime;

  while (curMin >= 60) {
    curMin -= 60;
    curHour += 1;
  }

  curHour %= 24;
  console.log(curHour, curMin);
}
