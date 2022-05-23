function solution(num, arr) {
  let answer = Number.MIN_SAFE_INTEGER;
  let n = arr.length;
  function DFS(L, sum) {
    // sum이 num보다 커지면 멈추기
    if (sum > num) return;
    // L === n이되면 부분집합 1개가 완성된다
    if (L === n) {
      // answer와 sum중 더 큰 것으로 교체
      answer = Math.max(answer, sum);
    } else {
      // 배열 이동하면서 sum에 누적할지 안할지 판단
      DFS(L + 1, sum + arr[L]);
      DFS(L + 1, sum);
    }
  }
  DFS(0, 0);
  return answer;
}
let arr = [81, 58, 42, 33, 61];
console.log(solution(259, arr));
