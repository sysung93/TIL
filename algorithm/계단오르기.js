function solution(n) {
  let answer = 0;
  let dy = Array.from({ length: n + 1 }, () => 0);
  // 초기화
  dy[1] = 1;
  dy[2] = 2;
  // 3번째 계단부터 n번째 계단까지
  for (let i = 3; i <= n; i++) {
    dy[i] = dy[i - 2] + dy[i - 1];
  }
  return answer;
}
console.log(solution(7));
