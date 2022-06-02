function solution(n) {
  let answer = 0;
  function DFS(n) {
    // n === 1이면 1을 리턴하고 DFS함수 종료
    if (n === 1) return 1;
    // n * n-1을 리턴
    else return n * DFS(n - 1);
  }
  answer = DFS(n);
  return answer;
}
console.log(solution(5));
