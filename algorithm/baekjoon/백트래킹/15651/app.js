const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs
  .readFileSync(filePath)
  .toString()
  .split(" ")
  .map((item) => +item);

let N = input[0];
let M = input[1];

solution(N, M);

// 1 <= M <= N <= 7
// 1부터 N까지의 자연수 중에서 중복 상관 없음
function solution(N, M) {
  const answer = [];

  // 임시저장배열
  let tempArr = Array.from({ length: M }, () => 0);

  // L = 뽑는 개수
  function DFS(L) {
    if (L === M) {
      // M개 고르면 저장하기
      answer.push(tempArr.join(" "));
      return;
    } else {
      for (let i = 1; i <= N; i++) {
        // tempArr에 뽑은카드 추가하기
        tempArr[L] = i;
        // 다음 뽑기로 넘어가기
        DFS(L + 1);
      }
    }
  }
  DFS(0);
  // 출력
  console.log(answer.join("\n"));
}
