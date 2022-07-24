const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let nArr = [];
for (let i = 1; i <= +input[0]; i++) {
  let temp = input[i].split(" ").map((item) => +item);
  nArr.push(temp);
}

solution(+input[0], nArr);

function solution(N, nArr) {
  let answer = 0;
  // 끝나는 시간이 빠른 순으로 정렬하기
  // 끝나는 시간이 같다면 시작시간이 빠른 순으로 정렬
  nArr.sort((a, b) => {
    if (a[1] === b[1]) return a[0] - b[0];
    else return a[1] - b[1];
  });

  let endTime = 0;
  for (let i of nArr) {
    // 시작시간이 endTime 보다 늦다면
    if (i[0] >= endTime) {
      // 회의실 사용 가능 +1
      answer++;
      // endTime 바꾸기
      endTime = i[1];
    }
  }
  console.log(answer);
}
