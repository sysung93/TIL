const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
const input = fs.readFileSync(filePath).toString().split("/n");

solution(input[0]);

function solution(N) {
  // N개 행 출력
  for (let i = 1; i <= N; i++) {
    let star = "";

    // 최종행 - 현재행의 단수 만큼 빈칸 채우기
    for (let j = 0; j < N - i; j++) {
      star += " ";
    }
    // 나머지를 별로 채우기
    for (let k = 1; k <= i; k++) {
      star += "*";
    }
    console.log(star);
  }
}
