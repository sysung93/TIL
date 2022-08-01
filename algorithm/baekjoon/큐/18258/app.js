const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let nArr = [];
for (let i = 1; i <= +input[0]; i++) {
  let temp = input[i].split(" ").map((item) => item);
  nArr.push({ cmd: temp[0], value: +temp[1] });
}

solution(+input[0], nArr);
// 큐 : 먼저 집어넣은 데이터가 먼저나오는 선입선출
function solution(N, nArr) {
  let queue = [];
  let answer = [];

  for (let i = 0; i < N; i++) {
    let cmd = nArr[i].cmd.trim();
    let value = nArr[i].value;

    switch (cmd) {
      case "push":
        queue.push(value);
        break;
      case "pop":
        if (queue.length !== 0) {
          answer.push(queue.shift());
        } else {
          answer.push(-1);
        }
        break;
      case "size":
        answer.push(queue.length);
        break;
      case "empty":
        queue.length === 0 ? answer.push(1) : answer.push(0);
        break;
      case "front":
        queue.length !== 0 ? answer.push(queue[0]) : answer.push(-1);
        break;
      case "back":
        queue.length !== 0
          ? answer.push(queue[queue.length - 1])
          : answer.push(-1);
        break;
    }
  }
  console.log(answer.join("\n"));
}
