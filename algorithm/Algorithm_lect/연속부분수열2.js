function solution(num, arr) {
  let answer = 0;
  let lt = 0;
  let sum = 0;

  // 수열 오른쪽으로 이동하면서 확인
  for (let rt = 0; rt < arr.length; rt++) {
    sum += arr[rt];
    // sum이 num보다 커지면 lt를 오른쪽으로 이동하면서 확인
    while (sum > num) {
      sum -= arr[lt++];
    }
    // 경우의 수 누적
    answer += rt - lt + 1;
  }
  return answer;
}

let arr = [1, 3, 1, 2, 3];
console.log(solution(5, arr));
