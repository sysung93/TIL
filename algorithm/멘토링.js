function solution(arr) {
  let answer = 0;
  m = arr.length;
  n = arr[0].length;

  // 멘토
  for (let i = 1; i <= n; i++) {
    //멘티
    for (let j = 1; j <= n; j++) {
      // 테스트 들어가기전에 cnt 초기화
      let cnt = 0;
      // 테스트 횟수만큼 돌면서
      for (let k = 0; k < m; k++) {
        let pi = 0;
        let pj = 0;
        // s = 등수 체크하기
        for (s = 0; s < n; s++) {
          // k번째 테스트의 s등 멘토, 멘티에 저장
          if (arr[k][s] === i) pi = s;
          if (arr[k][s] === j) pj = s;
        }
        // 만약 멘토가 멘티보다 등수가 적다면 cnt 증가
        if (pi < pj) cnt++;
      }
      // k번의 테스트를 다 통과했는지 확인
      if (cnt === m) answer++;
    }
  }
  return answer;
}

let arr = [
  [3, 4, 1, 2],
  [4, 3, 2, 1],
  [3, 1, 4, 2],
];
console.log(solution(arr));
