const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

const testCaseArray = [];
for (let i = 1; i <= +input[0]; i++) {
  const tempValue = input[i].split(" ").map((item) => +item);
  testCaseArray.push({ H: tempValue[0], W: tempValue[1], N: tempValue[2] });
}
solution(+input[0], testCaseArray);

function solution(T, testCaseArray) {
  for (let i = 0; i < T; i++) {
    const H = testCaseArray[i].H;
    const W = testCaseArray[i].W;
    const N = testCaseArray[i].N;

    let floor = N % H;
    let number = Math.ceil(N / H);

    // floor가 0이면 꼭대기 층
    if (floor === 0) {
      floor = H;
      // 방 호수는 1호부터 시작
    } else if (number === 0) {
      number === 1;
    }

    // 방호수가 10보다 작으면 앞에 0붙이기
    if (number < 10) {
      console.log(`${floor}0${number}`);
    } else {
      console.log(`${floor}${number}`);
    }
  }
}
