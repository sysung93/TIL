function solution(arr) {
  let answer = arr;
  let sum = answer.reduce((a, b) => a + b, 0);
  console.log(sum);

  for (let i = 0; i < answer.length; i++) {
    for (let j = 1; j < answer.length + 1; j++) {
      if (sum - (answer[i] + answer[j]) === 100) {
        answer.splice(j, 1);
        answer.splice(i, 1);
      }
    }
  }
  return answer;
}

let arr = [20, 7, 23, 19, 10, 15, 25, 8, 13];
console.log(solution(arr));
