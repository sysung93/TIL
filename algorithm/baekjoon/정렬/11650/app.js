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
    // 만약 x가 같은 경우에는 y를 비교해서 오름차순으로 정렬
    if (a[0] === b[0]) {
      return a[1] - b[1];
      // x가 다른경우에는 x만 비교해서 오름차순으롲 ㅓㅇ렬
    } else {
      return a[0] - b[0];
    }
  });

  // answer에 정답 누적하기
  let answer = "";
  coordinate.forEach((item) => {
    answer += `${item[0]} ${item[1]}\n`;
  });
  console.log(answer);

  // 시간초과
  // for (let i = 0; i < coordinate.length; i++) {
  //   console.log(`${coordinate[i][0]} ${coordinate[i][1]}`);
  // }
}
