// function solution(num) {
//   let answer;
//   if(num%12 === 0){
//     answer = num/12;
//   } else {
//     answer = (num/12) + 1;
//   }

//   return answer;
// }

function solution(num) {
  let answer;
  answer = Math.ceil(num / 12);

  return answer;
}

console.log(solution(25));
console.log(solution(178));
