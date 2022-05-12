function solution(arr) {
  let answer = "NO";
  let flag = 0;

  // arr의 합을 구하기
  let total = arr.reduce((a, b) => a + b, 0);
  let n = arr.length;

  function DFS(L, sum) {
    // flag가 1이면 다 종료
    if (flag) return;
    // 6까지 왔을 때 멈추기
    if (L === n) {
      // total - 누적된 값 === 누적된 값이 같으면 두 배열이 동일하다는 뜻
      if (total - sum === sum) answer = "YES";
      flag = 1;
    } else {
      // 다음원소 진행, sum에 누적하기
      DFS(L + 1, sum + arr[L]);

      // 다음원소 진행, sum 누적 안함
      DFS(L + 1, sum);
    }
  }

  DFS(0, 0);
  return answer;
}
let arr = [1, 3, 5, 6, 7, 10];
console.log(solution(arr));
