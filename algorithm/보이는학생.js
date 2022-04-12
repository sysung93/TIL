// function solution(arr) {
//   let answer = 0;
//   for (let i = 0; i < arr.length; i++) {
//     if (arr[i] <= arr[i + 1]) {
//       answer++;
//     } else {
//       answer;
//     }
//   }
//   return answer;
// }

function solution(arr) {
  let answer = 1;
  let max = arr[0];

  for (let i = 1; i < arr.length; i++) {
    if (arr[i] > max) {
      answer++;
      max = arr[i];
    }
  }
  return answer;
}

let arr = [130, 135, 148, 145, 150, 150, 153];
console.log(solution(arr));
