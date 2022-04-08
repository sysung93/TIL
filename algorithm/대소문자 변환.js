// function solution(str) {
//   let answer = "";

//   for (let n of str) {
//     let num = n.charCodeAt();
//     if (num >= 65 && num <= 90) {
//       answer += n.toLowerCase();
//     } else {
//       answer += n.toUpperCase();
//     }
//   }
//   return answer;
// }

// let str = "StuDY";
// console.log(solution(str));

function solution(str) {
  let answer = "";

  for (let n of str) {
    let num = n.charCodeAt();
    if (num >= 65 && num <= 90) {
      answer += n.toLowerCase();
    } else {
      answer += n.toUpperCase();
    }
  }
  return answer;
}

let str = "StuDY";
console.log(solution(str));
