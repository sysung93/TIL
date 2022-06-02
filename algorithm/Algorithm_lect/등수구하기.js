function solution(num, arr) {
  //길이 5, 초기값 1인 배열 만들기
  let answer = Array.from({ length: num }, () => 1);
  console.log(answer);
  for (let i = 0; i < num; i++) {
    for (let j = 0; j < num; j++) {
      if (arr[j] > arr[i]) answer[i]++;
    }
  }
  return answer;
}

let num = 5;
let arr = [87, 89, 92, 100, 76];
console.log(solution(num, arr));
