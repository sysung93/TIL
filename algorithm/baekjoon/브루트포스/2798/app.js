const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let NM = input[0].split(" ").map((item) => +item);
let N = NM[0];
let M = NM[1];

let cardNum = input[1].split(" ").map((item) => +item);

solution(N, M, cardNum);

function solution(N, M, cardNum) {
  let answer = 0;

  function DFS(L, S, sum) {
    // 카드를 3장 뽑으면 조건 확인하기
    if (L === 3) {
      // sum이 M보다 작은경우 answer 바꾸기, 더 큰게 나타나면 바꾸기
      if (sum <= M) {
        answer = Math.max(answer, sum);
      }
    } else {
      // i는 carNum 배열을 돌기위한 인덱스
      // cardNum[i] = S = cardNum[0]
      for (let i = S; i < N; i++) {
        // level + 1, cardNum[i+1], sum에 카드번호 누적
        DFS(L + 1, i + 1, sum + cardNum[i]);
        console.log(L, i, sum);
      }
    }
  }

  // Level , startNum, sum
  DFS(0, 0, 0);
  console.log(answer);
}

// function solution(N, M, cardNum) {
//   let answer = 0;
//   // 1번 카드
//   for (let i = 0; i < N; i++) {
//     // 2번 카드
//     for (let j = i + 1; j < N; j++) {
//       // 3번 카드
//       for (let k = j + 1; k < N; k++) {
//         // 3장 뽑아서 더하기
//         sum = cardNum[i] + cardNum[j] + cardNum[k];
//         // sum이 M보다 작거나 같을 경우
//         // answer와 비교하기
//         if (sum <= M) {
//           answer = Math.max(sum, answer);
//         }
//       }
//     }
//   }
//   console.log(answer);
// }
