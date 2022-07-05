const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = [];

for (let i = 1; i <= +input[0]; i++) {
  let temp = input[i]
    .trim()
    .split(" ")
    .map((item) => item);

  testCaseArr.push({ age: +temp[0], name: temp[1] });
}

solution(+input[0], testCaseArr);

function solution(N, memberList) {
  memberList.sort((a, b) => {
    // 나이가 같다면 입력된 순으로 정렬
    if (a.age === b.age) {
      a - b;
    } else {
      // 나이 순으로 정렬
      return a.age - b.age;
    }
  });

  // answer에 담아서 출력하기
  let answer = "";
  for (let i = 0; i < N; i++) {
    answer += `${memberList[i].age} ${memberList[i].name}\n`;
  }
  console.log(answer);
}
