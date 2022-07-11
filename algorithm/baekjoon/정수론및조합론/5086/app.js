const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = [];
for (let i = 0; i < input.length; i++) {
  let tmp = input[i].split(" ").map((item) => +item);
  testCaseArr.push({ A: tmp[0], B: tmp[1] });
}

solution(testCaseArr);

function solution(testCaseArr) {
  for (let i = 0; i < testCaseArr.length; i++) {
    let a = testCaseArr[i].A;
    let b = testCaseArr[i].B;
    if (a === 0 && b === 0) {
      return;
    }
    if (b % a === 0) {
      console.log("factor");
    } else if (a % b === 0) {
      console.log("multiple");
    } else {
      console.log("neither");
    }
  }
}
