const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

// 첫째줄 상근이가 가지고 있는 숫자 카드의 개수
let N = +input[0];

// 둘째 줄 : 숫자 카드에 적혀있는 정수
let testCaseArr1 = input[1].split(" ").map((item) => +item);

// 셋째 줄 : 확인해야할 숫자 개수
let M = +input[2];

// 넷째 줄 : 확인해야할 카드
let testCaseArr2 = input[3].split(" ").map((item) => +item);

solution(N, testCaseArr1, M, testCaseArr2);

function solution(N, cardArr, M, checkCardArr) {
  // set에 상근이가 갖고있는 카드를 저장
  const set = new Set(cardArr);
  let answer = "";

  // 확인해야할 카드를 돌면서
  checkCardArr.forEach((val) => {
    // 카드를 가지고 있는지 확인하기
    if (set.has(val)) {
      answer += 1 + " ";
    } else {
      answer += 0 + " ";
    }
  });

  console.log(answer);
}
