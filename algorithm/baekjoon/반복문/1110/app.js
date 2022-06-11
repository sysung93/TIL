const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0]);

function solution(N) {
  let makeNum = N;
  let cnt = 0;

  while (makeNum !== N || cnt === 0) {
    let ten;
    let one;

    if (makeNum >= 10) {
      ten = +String(makeNum)[0];
      one = +String(makeNum)[1];
    } else {
      ten = 0;
      one = +String(makeNum)[0];
    }

    makeNum = ten + one;

    let makeNumOne;

    // 다음 숫자의 일의자리 만들기
    // 만든 숫자가 10보다 크면 1의 자리에 있는 숫자를
    // 다음에 만들어질 숫자 1의 자리로 만들기
    if (makeNum >= 10) {
      makeNumOne = +String(makeNum)[1];
    } else {
      makeNumOne = +String(makeNum)[0];
    }
    makeNum = +(String(one) + String(makeNumOne));

    cnt++;
  }
  console.log(cnt);
}
