function solution(n) {
  let answer = [];
  // 0부터 3까지의 체크배열 만들기
  let ch = Array.from({ length: n + 1 }, () => 0);

  function DFS(v) {
    // v가 4가 되어야지 true
    if (v === n + 1) {
      let tmp = "";
      for (let i = 1; i <= n; i++) {
        if (ch[i] === 1) tmp += i + " ";
      }
      // 공집합은 제외
      if (tmp.length > 0) answer.push(tmp.trim());
    } else {
      ch[v] = 1;
      DFS(v + 1);
      ch[v] = 0;
      DFS(v + 1);
    }
  }
  DFS(1);
  return answer;
}

console.log(solution(3));
