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
// 비내림차순으로 정렬(각각의 원소가 바로 앞에 있는 원소보다 크거나 같은 경우)
function solution(N, M) {
  // 1부터 N까지의 배열
  let NArr = [];
  for(let i = 1; i <= N; i++){
    NArr.push(i);
  }

  // 수열을 담을 임시배열
  let temp = Array.from({length: M}, () => 0)
  let answer = [];

  function DFS(L){
    // M개 만큼 뽑았으면 answer에 저장
    if(L === M){
      answer.push(temp.slice().join(" "));
    } else {
      // NArr 배열을 돌면서
      for(let i = 0; i < NArr.length; i++){
        // 제일 첫 번째 숫자를 뽑는경우
        if(L === 0){
          temp[L] = NArr[i];
          DFS(L + 1);
        }
        // 두 번쨰 이후부터의 숫자를 뽑는경우 이전숫자는
        // 현재 뽑은 숫자보다 작거나 같아야 함
        else if(L > 0 && temp[L-1] <= NArr[i]){
          temp[L] = NArr[i];
          DFS(L + 1);
        }
      }
    }
  }

  DFS(0);
  console.log(answer.join("\n"));
}