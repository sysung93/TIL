function solution(n, m) {
  let answer = [];
  let tmp = Array.from({ length: m }, () => 0);
  function DFS(L) {
    if (L === m) {
      // 그냥 push를 하면 주소가 같기 때문에 원하는 결과 값이 안나옴
      answer.push(tmp.slice());
    } else {
      // 깊이가 n인 탐색
      for (let i = 1; i <= n; i++) {
        tmp[L] = i;
        DFS(L + 1);
      }
    }
  }
  DFS(0);
  return answer;
}
console.log(solution(3, 2));
