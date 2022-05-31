function solution(arr) {
  let answer = 0;
  let dy = Array.from({ length: arr.length }, () => 0);
  dy[0] = 1;

  for (let i = 1; i < arr.length; i++) {
    let max = 0;
    // 자기자신의 앞의 항을 돌아보면서 작은 게 있는지 확인하기
    for (let j = i - 1; j >= 0; j--) {
      // 자기 자신보다 작거나, max값보다 크면 dy[j]를 max로 교체
      if (arr[j] < arr[i] && dy[j] > max) {
        max = dy[j];
      }
    }
    // max값에 자기자신까지 더하기
    dy[i] = max + 1;
    answer = Math.max(answer, dy[i]);
  }

  return answer;
}
let arr = [5, 3, 7, 8, 6, 2, 9, 4];
console.log(solution(arr));
