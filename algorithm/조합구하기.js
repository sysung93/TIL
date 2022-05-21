function solution(n, m) {
  let answer = [];
  let tmp = Array.from({ length: m }, () => 0);

  function DFS(L, s) {
    if (L === m) {
      answer.push(tmp.slice());
    } else {
      for (let i = s; i <= n; i++) {
        // i를 뽑았다고 체크
        tmp[L] = i;
        // i는 뽑는 숫자
        DFS(L + 1, i + 1);
      }
    }
  }

  //DFS(level, startNum)
  DFS(0, 1);
  return answer;
}

console.log(solution(4, 2));
