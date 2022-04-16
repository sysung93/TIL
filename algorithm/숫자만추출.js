// function solution(str){
//   let answer = "";
//   for(n of str) {
//     num = n.charCodeAt();
//     if(num >= 48 && num <= 57) {
//       answer += n;
//     }
//   }
//   return Number(answer);
// }

// let str = "g0en2T0s8eSoft"
// console.log(solution(str));

function solution(str) {
  let answer = "";
  for (let i of str) {
    if (!isNaN(i)) answer += i;
  }
  return parseInt(answer);
}

let str = "g0en2T0s8eSoft";
console.log(solution(str));
