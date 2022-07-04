const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = [];

for (let i = 1; i <= +input[0]; i++) {
  let temp = input[i].split(" ").map((item) => +item);
  testCaseArr.push([temp[0], temp[1]]);
}

solution(+input[0], testCaseArr);

function solution(N, coordinate) {
  coordinate.sort((a, b) => {
    // y좌표가 동일한 경우 x 좌표끼리 비교해서 오름차순 정렬
    if (a[1] === b[1]) {
      return a[0] - b[0];
      // y좌표끼리 비교
    } else {
      return a[1] - b[1];
    }
  });

  // answer에 정답 누적하기
  let answer = "";
  coordinate.forEach((item) => {
    answer += `${item[0]} ${item[1]}\n`;
  });
  console.log(answer);
}
