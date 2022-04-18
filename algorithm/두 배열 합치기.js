function solution(arr1, arr2) {
  let answer = [];
  let n = arr1.length;
  let m = arr2.length;
  let p1 = 0;
  let p2 = 0;

  // 둘 중 하나가 끝나면 멈춘다
  while (p1 < n && p2 < m) {
    // arr1[i] <= arr2[i]라면 answer에 arr1[i]를 저장하고 arr[i+1]로 이동
    if (arr1[p1] <= arr2[p2]) {
      answer.push(arr1[p1++]);
      //arr2[i]가 더 크다면 answer에 arr2[i]를 저장하고 arr2[i+1]로 이동
    } else {
      answer.push(arr2[p2++]);
    }
  }

  // 남은 배열을 answer에 순차적으로 추가하기
  while (p1 < n) {
    answer.push(arr1[p1++]);
  }
  while (p2 < m) {
    answer.push(arr2[p2++]);
  }
  return answer;
}
let arr1 = [1, 3, 5];
let arr2 = [2, 3, 6, 7, 9];
console.log(solution(arr1, arr2));
