function solution(n, arr) {
  let answer = 0;
  // 인접행렬을 만들 2차원 배열의 행과 열의 개수는 n+1개
  let graph = Array.from(Array(n + 1), () => Array(n + 1).fill(0));
  let ch = Array.from({ length: n + 1 }, () => 0);

  // 인접행렬을 2차원 배열로 만들기
  for (let [a, b] of arr) {
    graph[a][b] = 1;
  }

  function DFS(v) {
    if (v === n) {
      answer++;
    } else {
      for (let i = 1; i <= n; i++) {
        // graph에 체크되어 있거나 체크배열에 체크가 안된 것만 경로 탐색
        if (graph[v][i] === 1 && ch[i] === 0) {
          ch[i] = 1;
          DFS(i);
          ch[i] = 0;
        }
      }
    }
  }
  // 1에서 시작하므로 1은 먼저 체크하고 시작하기
  ch[1] = 1;
  DFS(1);

  return answer;
}
// 간선정보
let arr = [
  [1, 2],
  [1, 3],
  [1, 4],
  [2, 1],
  [2, 3],
  [2, 5],
  [3, 4],
  [4, 2],
  [4, 5],
];
console.log(solution(5, arr));
