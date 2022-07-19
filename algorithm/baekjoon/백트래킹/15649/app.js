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

// 1 <= M <= N <= 8
// 1부터 N까지의 자연수 중에서 중복없이 M개를 고르기
function solution(N, M) {
  // 1부터 N까지 배열
  let NArr = [];
  for (let i = 1; i <= N; i++) {
    NArr.push(i);
  }

  // 체크배열 0으로 초기화
  let checkArr = Array.from({ length: N }, () => 0);
  // 임시저장배열
  let temp = Array.from({ length: M }, () => 0);

  function DFS(L) {
    // M개 뽑으면 출력하기
    if (L === M) {
      console.log(temp.join(" "));
    } else {
      // N배열 돌면서
      for (let i = 0; i < NArr.length; i++) {
        // checkArr[i]가 0이면
        if (checkArr[i] === 0) {
          // 1로 바꿔서 체크하기
          checkArr[i] = 1;
          // tmep[L]에 NArr[i]저장하기
          temp[L] = NArr[i];
          // 다음으로 넘어가기
          DFS(L + 1);
          // 체크 풀기
          checkArr[i] = 0;
        }
      }
    }
  }

  DFS(0);
}
