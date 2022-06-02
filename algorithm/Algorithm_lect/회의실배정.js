function solution(arr) {
  let answer = 0;

  // 끝나는 시간이 빠른 순, 끝나는시간이 같다면 시작시간이 빠른순으로 정렬
  arr.sort((a, b) => {
    if (a[1] === b[1]) return a[0] - b[0];
    else return a[1] - b[1];
  });

  // 끝나는시작 설정
  let et = 0;
  for (let x of arr) {
    // 시작시간이 et 보다 크거나 같다면 answer++
    if (x[0] >= et) {
      answer++;
      // 끝나는시간을 et에 대입
      et = x[1];
    }
  }

  return answer;
}

let arr1 = [
  [1, 4],
  [2, 3],
  [3, 5],
  [4, 6],
  [5, 7],
];
let arr2 = [
  [3, 3],
  [1, 3],
  [2, 3],
];
console.log(solution(arr1));
console.log(solution(arr2));
