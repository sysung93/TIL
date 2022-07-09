const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseInput = [];

for (let i = 0; i < input.length; i++) {
  let temp = input[i].split(" ").map((item) => +item);
  testCaseInput.push({ X: temp[0], Y: temp[1], Z: temp[2] });
}

solution(testCaseInput);

function solution(triangleSide) {
  // z가 제일 긴 변인 경우
  // x의 제곱 + y의 제곱 = z의 제곱일때 직각삼각형이다.
  for (i = 0; i < triangleSide.length; i++) {
    // 입력값의 제곱을 x, y, z에 저장
    let x = triangleSide[i].X ** 2;
    let y = triangleSide[i].Y ** 2;
    let z = triangleSide[i].Z ** 2;

    // x, y, z가 0이면 종료
    if (x === 0 && y === 0 && z === 0) {
      return;
      // 대각선이 어떤것인지 모르므로 
      // x, y, z 각각이 제일 길다는 가정하에 조건 걸기
    } else if (x === y + z || y === x + z || z === x + y) {
      console.log("right");
    } else {
      console.log("wrong");
    }
  }
}
