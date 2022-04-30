// function solution(n, arr) {
//   // 1. 0으로 초기화된 길이 5짜리 배열 만들기
//   let answer = Array.from({ length: n }, () => 0);

//   arr.forEach((x) => {
//     // hit 여부 확인
//     let pos = -1;
//     // x가 answer에 존재하면 pos에 hit된 지점의 index를 저장
//     for (let i = 0; i < n; i++) {
//       if (x === answer[i]) {
//         pos = i;
//       }
//     }

//     // miss 상황
//     if (pos === -1) {
//       for (let i = n - 1; i >= 1; i--) {
//         // i - 1을 i에 복사하기. (한칸씩 뒤로 미루기)
//         answer[i] = answer[i - 1];
//       }
//       answer[0] = x;
//     }
//     // hit 상황
//     else {
//       //hit난 지점에서 시작, i-1을 i에 복사하기
//       for (let i = pos; i >= 1; i--) {
//         answer[i] = answer[i - 1];
//       }
//       // 0번 인덱스에 hit난 메모리를 저장
//       answer[0] = x;
//     }
//   });

//   return answer;
// }

// let n = 5;
// let arr = [1, 2, 3, 2, 6, 2, 3, 5, 7];
// console.log(solution(n, arr));

function solution(n, arr) {
  let answer = Array.from({ length: 5 }, () => 0);
  arr.forEach((x) => {
    // hit or miss 인지 판단하기 hit면 pos에 index저장
    let pos = -1;
    for (let i = 0; i < n; i++) if (x === answer[i]) pos = i;
    // miss이면 제일 앞에 삽입
    if (pos === -1) {
      answer.unshift(x);
      // answer의 길이가 n보다 커지면 pop하기
      if (answer.length > n) {
        answer.pop();
      }
      // hit인경우 pos에 저장된 index부터 1개 삭제 후 제일 앞에 삽입
    } else {
      answer.splice(pos, 1);
      answer.unshift(x);
    }
  });
  return answer;
}
let n = 5;
let arr = [1, 2, 3, 2, 6, 2, 3, 5, 7];
console.log(solution(5, arr));
