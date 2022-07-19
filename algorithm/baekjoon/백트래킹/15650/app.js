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
// 1부터 N까지의 자연수 중에서 중복없이 M개를 고르기
function solution(N, M) {
  const answer = "";
  // 1부터 N까지의 배열
  const NArr = [];
  for (let i = 1; i <= N; i++) {
    NArr.push(i);
  }

  // 체크배열
  let checkArr = Array.from({ length: N }, () => 0);
  // 임시저장배열
  let tempArr = Array.from({ length: M }, () => 0);

  // L = 뽑는 개수, start = 시작인덱스
  function DFS(L, start) {
    if (L === M) {
      // M개 고르면 출력하기
      console.log(tempArr.join(" "));
    } else {
      for (let i = start; i < NArr.length; i++) {
        // 체크배열 확인하기
        if (checkArr[i] === 0) {
          // 체크가 안되어있으면 체크하기
          checkArr[i] = 1;
          // tempArr에 Narr[i] 추가
          tempArr[L] = NArr[i];
          // 다음 뽑기로 넘어가기
          // 오름차순이어야 하므로 전에 뽑은것보다 큰 것을 뽑아야함
          // 시작인덱스를 + 1해줘서 전에 뽑은것보다 더 큰 숫자만 뽑을 수 있게하기
          DFS(L + 1, i + 1);
          // L === 2가 되면 체크배열 0으로 다시 초기화
          checkArr[i] = 0;
        }
      }
    }
  }

  DFS(0, 0);
  console.log(answer);
}
