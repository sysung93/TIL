// function solution(n, arr) {
//   let answer = Number.MAX_SAFE_INTEGER;

//   // L = 동전개수 sum = 동전누적
//   function DFS(L, sum) {
//     if (sum > n) return;
//     if (sum === n) {
//       answer = Math.min(answer, L);
//     } else {
//       for (let i = 0; i < arr.length; i++) {
//         DFS(L + 1, sum + arr[i]);
//       }
//     }
//   }
//   DFS(0, 0);
//   return answer;
// }
// let arr = [1, 2, 5];
// console.log(solution(15, arr));

function solution(n, arr) {
  let answer = Number.MAX_SAFE_INTEGER;

  // L = 동전개수 sum = 동전누적
  function DFS(L, sum) {
    // sum이 거슬러줄 금액을 넘어가면 return
    if (sum > n) return;

    // 이미 답이 나온경우 다른 경우를 찾지 않도록 막음
    if (L >= answer) return;

    if (sum === n) {
      answer = Math.min(answer, L);
    } else {
      for (let i = 0; i < arr.length; i++) {
        DFS(L + 1, sum + arr[i]);
      }
    }
  }
  DFS(0, 0);
  return answer;
}
let arr = [1, 2, 5];
console.log(solution(15, arr));
