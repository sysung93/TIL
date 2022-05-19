// function solution(n, r) {
//   let answer;
//   function DFS(n, r) {
//     if (n === r || r === 0) {
//       return 1;
//     } else {
//       return DFS(n - 1, r - 1) + DFS(n - 1, r);
//     }
//   }
//   answer = DFS(n, r);
//   return answer;
// }
// console.log(solution(5, 3));
// console.log(solution(33, 19));

function solution(n, r) {
  let answer;
  // 3행 5열의 2차원 배열
  let dy = Array.from(Array(35), () => Array(35).fill(0));
  function DFS(n, r) {
    // dy[n][r]에 값이 있다면 이미 구했던 값이므로 return
    if (dy[n][r] > 0) return dy[n][r];
    if (n === r || r === 0) {
      return 1;
    } else {
      // 2차원 배열을 리턴
      return (dy[n][r] = DFS(n - 1, r - 1) + DFS(n - 1, r));
    }
  }
  answer = DFS(n, r);
  return answer;
}
console.log(solution(5, 3));
console.log(solution(33, 19));
