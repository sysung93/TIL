function solution(arr) {
  let answer = [];

  // 깊은 복사 후 정렬하기
  let tmp = [...arr].sort((a, b) => a - b);

  // tmp와 arr을 비교하면서 동일인덱스 / 다른 값 가진 것찾기
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] !== tmp[i]) {
      let idx = i + 1;
      answer.push(idx);
    }
  }

  return answer;
}

let arr1 = [120, 125, 152, 130, 135, 135, 143, 127, 160];
let arr2 = [120, 130, 150, 150, 130, 150];
console.log(solution(arr1));
console.log(solution(arr2));
