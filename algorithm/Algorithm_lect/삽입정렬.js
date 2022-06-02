function solution(arr) {
  let answer = arr;
  // i는 1부터 차례대로 증가탐색
  for (let i = 1; i < arr.length; i++) {
    // tmp에 arr[i] 저장
    let tmp = arr[i],
      j;
    // j는 0부터 차례대로 감소탐색
    for (j = i - 1; j >= 0; j--) {
      // j가 tmp보다 크다면 arr[j+1]에다가 j의 값을 복사
      if (arr[j] > tmp) {
        arr[j + 1] = arr[j];
      }
      // arr[j]가 tmp보다 작으면 break
      else break;
    }
    // j가 끝난 지점(arr[j]가 tmp보다 작음) + 1에 tmp 저장
    arr[j + 1] = tmp;
  }
  return answer;
}

let arr = [11, 7, 5, 6, 10, 9];
console.log(solution(arr));
