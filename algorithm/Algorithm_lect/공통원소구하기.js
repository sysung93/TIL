// function solution(arr1, arr2) {
//   let answer = [];
//   for (i = 0; i < arr1.length; i++) {
//     for (j = 0; j < arr2.length; j++) {
//       if (arr1[i] === arr2[j]) {
//         answer.push(arr1[i]);
//       }
//     }
//   }
//   answer = answer.sort((a, b) => a - b);
//   return answer;
// }
// let arr1 = [1, 3, 9, 5, 2];
// let arr2 = [3, 2, 5, 7, 8];
// console.log(solution(arr1, arr2));

function solution(arr1, arr2) {
  let answer = [];
  let n = arr1.length;
  let m = arr2.length;
  let p1 = 0;
  let p2 = 0;

  // 두배열을 먼저 정렬하기
  // sort()는 문자열로 정렬되기 때문에 사전순으로 정리된다.
  // [1, 3, 10, 5, 2] => [1, 10, 2, 3, 5]
  arr1.sort((a, b) => a - b);
  arr2.sort((a, b) => a - b);

  // 작은 값의 p값을 이동하면서 찾기
  // 두개의 값이 같다면 p를 동시에 이동하기
  while (p1 < n && p2 < m) {
    if (arr1[p1] === arr2[p2]) {
      answer.push(arr1[p1++]);
      p2++;
    } else if (arr1[p1] < arr2[p2]) {
      p1++;
    } else {
      p2++;
    }
  }

  return answer;
}
let arr1 = [1, 3, 9, 5, 2];
let arr2 = [3, 2, 5, 7, 8];
console.log(solution(arr1, arr2));
