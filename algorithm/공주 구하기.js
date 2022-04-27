// n = 왕자 수, k = 주어진 숫자
function solution(n, k) {
  let answer;

  // 길이가 n 개인 유사배열 생성
  // v: 배열의 value, i: 배열의 index
  // 1부터 8까지의 배열 생성
  let queue = Array.from({ length: n }, (v, i) => i + 1);

  // 1명만 남을때까지 반복, 0이되면 거짓이니 멈춤
  while (queue.length) {
    // 1, 2번 왕자 제일 첫번째 값을 맨뒤에 push하기
    for (let i = 1; i < k; i++) queue.push(queue.shift());
    // 3번왕자는 제외
    queue.shift();
    if (queue.length === 1) {
      answer = queue.shift();
    }
  }

  return answer;
}
console.log(solution(8, 3));
