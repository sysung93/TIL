const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("/n");

solution(input[0]);

function solution(N) {
  // i = 프린트할 행의 개수
  for (let i = 1; i <= N; i++) {
    let star = "";
    // 별 개수는 i가 늘어난 만큼 증가시켜 찍는다
    for (let j = 1; j <= i; j++) {
      star += "*";
    }
    console.log(star);
  }
}
