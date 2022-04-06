function solution(arr) {
  let answer;
  //let min = Number.MAX_SAFE_INTEGER;
  let min = arr[0];
  for (i = 0; i < arr.length; i++) {
    if (min > arr[i]) {
      min = arr[i];
    }
  }
  answer = min;
  return answer;
}
let arr = [5, 3, 7, 11, 2, 15, 17];
console.log(solution(arr));
