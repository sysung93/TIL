function solution(n) {
  let answer = 0;
  let dy = Array.from({ length: n + 2 }, () => 0);
  dy[1] = 1;
  dy[2] = 2;
  // 돌다리를 완전히 건너서 땅에 닿기 위해서는 돌다리 갯수 + 1까지 가야한다.
  for (let i = 3; i <= n + 1; i++) {
    dy[i] = dy[i - 1] + dy[i - 2];
  }
  answer = dy[n + 1];
  return answer;
}
console.log(solution(7));
