const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let nArr = [];
for (let i = 1; i <= input[0]; i++) {
  let temp = input[i].split(" ").map((item) => item.trim());
  nArr.push({ cmd: temp[0], value: temp[1] });
}

solution(+input[0], nArr);

function solution(N, nArr) {
  let stack = [];
  let answer = [];

  for (let i = 0; i < N; i++) {
    let cmd = nArr[i].cmd;
    let value = nArr[i].value;

    switch (cmd) {
      case "push":
        stack.push(value);
        break;
      case "pop":
        stack.length !== 0 ? answer.push(stack.pop()) : answer.push(-1);
        break;
      case "size":
        answer.push(stack.length);
        break;
      case "empty":
        stack.length === 0 ? answer.push(1) : answer.push(0);
        break;
      case "top":
        stack.length !== 0
          ? answer.push(stack[stack.length - 1])
          : answer.push(-1);
        break;
    }
  }
  console.log(answer.join("\n"));
}
