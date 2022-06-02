function solution(arr) {
  let answer = [];

  for (i = 0; i < arr.length - 1; i++) {
    for (j = 0; j < arr.length - 1; j++) {
      //j가 양수이고 j+1이 음수인경우 자리 교체
      if (arr[j] > 0 && arr[j + 1] < 0) {
        [arr[j], arr[j + 1]] = [arr[j + 1], arr[j]];
      }
    }
  }
  return arr;
}

let arr = [1, 2, 3, -3, -2, 5, 6, -6];
console.log(solution(arr));
