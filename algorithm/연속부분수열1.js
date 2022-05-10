function solution(num, arr) {
  let answer = 0;
  let lt = 0;
  let sum = 0;
  for (let rt = 0; rt < arr.length; rt++) {
    sum += arr[rt];
    if (sum === num) answer++;
    while (sum >= num) {
      sum -= arr[lt++];
      if (sum === num) {
        answer++;
      }
    }
  }

  return answer;
}

let arr = [1, 2, 1, 3, 1, 1, 1, 2];
console.log(solution(6, arr));
