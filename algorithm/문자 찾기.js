// function solution(str, char) {
//   let answer = 0;
//   for (let i of str) {
//     if (i === char) {
//       answer++;
//     }
//   }
//   return answer;
// }

// let str = "COMPUTERPROGRAMMING";
// let char = "R";
// console.log(solution(str, char));

function solution(str, char) {
  let answer = str.split(char).length;
  return answer - 1;
}

let str = "COMPUTERPROGRAMMING";
let char = "R";
console.log(solution(str, char));
