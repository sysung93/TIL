const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let nArr = [];
for (let i = 1; i <= input[0]; i++) {
  nArr.push(+input[i]);
}

solution(+input[0], nArr);

function solution(K, nArr) {
  let board = [];
  // i가 0이면 가장 최근에 저장된 수 빼기
  for (i of nArr) {
    if (i === 0) {
      board.pop();
    } else {
      // 0이아니면 board에 저장하기
      board.push(i);
    }
  }
  // answer에 있는 숫자들의 합 구하기
  let answer = 0;
  for (let i of board) {
    answer += i;
  }
  console.log(answer);
}
