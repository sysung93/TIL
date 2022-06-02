function solution(m, coin) {
  let answer = 0;
  // 거슬러줄 동전의 값만큼의 길이, 큰 숫자로 초기화된 배열 만들기
  // dy[i]는 i 금액을 거슬러 주는데 사용되는 최소 동전의 개수
  let dy = Array.from({ length: m + 1 }, () => 1000);
  dy[0] = 0;

  for (let i = 0; i < coin.length; i++) {
    for (let j = coin[i]; j <= m; j++) {
      dy[j] = Math.min(dy[j], dy[j - coin[i]] + 1);
    }
  }
  answer = dy[m];
  return answer;
}
let arr = [1, 2, 5];
console.log(solution(15, arr));
