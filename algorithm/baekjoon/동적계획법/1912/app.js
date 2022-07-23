const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");
let NArr = input[1].split(" ").map((item) => +item);
solution(+input[0], NArr);
function solution(n, nArr) {
  // 첫번째 값을 max값으로 정하기
  let max = nArr[0];

  for (let i = 1; i < n; i++) {
    // 이전값이 양수이고, 현재값과 이전값을 더했을때 양수일 때
    if (nArr[i - 1] > 0 && nArr[i] + nArr[i - 1] > 0) {
      // 현재값에 이전값을 더한다
      nArr[i] += nArr[i - 1];
    }
    // max값이 현재값보다 작으면 교체하기
    if (max < nArr[i]) {
      max = nArr[i];
    }
  }
  console.log(max);
}
