function solution(arr) {
  let answer = arr;
  // sort를 이용해서 정렬
  arr.sort((a, b) => {
    // x좌표가 같다면 b의 좌표로 오름차순 정렬
    if (a[0] === b[0]) return a[1] - b[1];
    // x좌표에서 오름차순 정렬
    else return a[0] - b[0];
  });
  return answer;
}

let arr = [
  [2, 7],
  [1, 3],
  [1, 2],
  [2, 5],
  [3, 6],
];
console.log(solution(arr));
