function solution(k, arr) {
  let answer = Number.MIN_SAFE_INTEGER;
  let lt = 0;
  let sum = 0;
  // 제일 처음 3개의 합 구하기
  for (let i = 0; i < k; i++) {
    sum += arr[i];
  }
  answer = sum;

  // 한칸씩 밀면서 더하고 빼기
  for (let i = k; i < arr.length; i++) {
    sum += arr[i] - arr[i - k];
    answer = Math.max(answer, sum);
  }
  return answer;
}

let arr = [12, 15, 11, 20, 25, 10, 20, 19, 13, 15];
console.log(solution(3, arr));
