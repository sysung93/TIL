const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(input[0]);

function solution(str) {
  let answer = 0;
  for (let i = 0; i < str.length; i++) {
    let char = str[i];

    if (char >= "W") {
      answer += 10;
    } else if (char >= "T") {
      answer += 9;
    } else if (char >= "P") {
      answer += 8;
    } else if (char >= "M") {
      answer += 7;
    } else if (char >= "J") {
      answer += 6;
    } else if (char >= "G") {
      answer += 5;
    } else if (char >= "D") {
      answer += 4;
    } else if (char >= "A") {
      answer += 3;
    } else {
      answer += 2;
    }
  }
  console.log(answer);
}
