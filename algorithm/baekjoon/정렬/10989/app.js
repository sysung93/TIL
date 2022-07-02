const { count } = require("console");
const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let items = [];

for (let i = 1; i <= input[0]; i++) {
  items.push(+input[i]);
}

solution(+input[0], items);

function solution(N, arr) {
  let max = Number.MIN_SAFE_INTEGER;

  // arr에서 가장 큰 숫자 찾아서 max에 저장하기
  for (let i of arr) {
    max = Math.max(max, i);
  }

  // max값보다 +1 긴 배열만들기, 0으로 초기화
  let countArr = Array.from({ length: max + 1 }, () => 0);

  // arr[i]에 해당하는 숫자를 counArr 각 인덱스에 +1하기
  for (let i = 0; i < N; i++) {
    countArr[arr[i]]++;
  }

  // countArr을 돌면서 해당하는 인덱스를 누적한 개수만큼 출력하기
  for (let i = 0; i < countArr.length; i++) {
    if (countArr[i]) {
      for (let j = 0; j < countArr[i]; j++) {
        console.log(i);
      }
    }
  }
}
