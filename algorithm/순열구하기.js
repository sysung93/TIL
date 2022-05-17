function solution(n, arr) {
  let answer = [];
  // 중복을 피하기 위해 체크할 수 있는 배열 만들기
  let ch = Array.from({ length: arr.length }, () => 0);
  // 임시배열 만들어서 순열 저장
  let tmp = Array.from({ length: n }, () => 0);
  function DFS(L) {
    if (L === n) {
      // 임시배열의 순열을 answer에 push하기
      // 그냥 push하게되면 주소값이 같아서 원하던 값이 안나오므로 slice를 통해 복사해서 넣기
      answer.push(tmp.slice());
    } else {
      for (let i = 0; i < arr.length; i++) {
        //만약 체크배열 i번째가 0이면
        if (ch[i] === 0) {
          // 1로 체크해서 중복 피하기
          ch[i] = 1;
          // arr[i]를 tmp[L]에 저장
          tmp[L] = arr[i];
          // 다음 level로 넘어가기
          DFS(L + 1);
          // 체크배열 풀기
          ch[i] = 0;
        }
      }
    }
  }
  DFS(0);
  return answer;
}
let arr = [3, 6, 9];
console.log(solution(2, arr));
