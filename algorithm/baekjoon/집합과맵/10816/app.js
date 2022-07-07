const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

// 첫째줄 상근이가 가지고 있는 숫자 카드의 개수
let N = +input[0];

// 둘째 줄 : 숫자 카드에 적혀있는 정수
let testCaseArr1 = input[1].split(" ").map((item) => +item);

// 셋째 줄 : 확인해야할 카드 개수
let M = +input[2];

// 넷째 줄 : 확인해야할 카드
let testCaseArr2 = input[3].split(" ").map((item) => +item);

solution(N, testCaseArr1, M, testCaseArr2);

function solution(N, cardArr, M, checkCardArr) {
  const map = new Map();

  // 가지고 있는 카드를 map 객체로만들기
  cardArr.forEach((cardnum) => {
    // 이미 있는 카드이면 +1 하기
    if (map.has(cardnum)) {
      map.set(cardnum, map.get(cardnum) + 1);
      // 없는 카드이면 카드번호, 1 저장하기
    } else {
      map.set(cardnum, 1);
    }
  });

  let answer = [];
  // 체크할 카드를 돌면서 map에 있으면 map에 저장된 값을,
  // 아니면 0을 answer에 누적시키기
  checkCardArr.forEach((val) => {
    answer.push(map.get(val) || 0);
  });

  //출력하기
  console.log(answer.join(" "));
}
