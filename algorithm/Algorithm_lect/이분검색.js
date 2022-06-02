function solution(n, arr) {
  let answer = 0;
  arr.sort((a, b) => a - b);

  // 배열의 첫번째와 마지막을 정한다.
  let lt = 0;
  let rt = arr.length - 1;

  while (lt <= rt) {
    // 가운데 지점을 정하고
    let mid = parseInt((lt + rt) / 2);

    // 가운데 값이 찾는 값이면
    if (arr[mid] === n) {
      // mid는 인덱스 번호이므로 + 1
      answer = mid + 1;
      break;
      // 만약 중간값이 찾는 값보다 크다면
    } else if (arr[mid] > n) {
      // rt를 중간값보다 1작게 설정해서 mid값 설정
      // 중간값을 기준으로 좌측의 데이터를 다시탐색
      rt = mid - 1;
      // 중간값이 찾는 값보다 작다면
      // lt를 중간값보다 1크게 설정해서 mid값 설정
      // mid값을 기준으로 우측의 데이터를 다시탐색
    } else {
      lt = mid + 1;
    }
  }

  return answer;
}
let arr = [23, 87, 65, 12, 57, 32, 99, 81];
console.log(solution(32, arr));
