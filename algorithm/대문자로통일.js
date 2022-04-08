// function solution(str) {
//   let answer = "";

//   for (let n of str) {
//     if (n !== n.toUpperCase()) {
//       answer += n.toUpperCase();
//     } else {
//       answer += n;
//     }
//   }
//   return answer;
// }

// let str = "ItisTimeToStudy";
// console.log(solution(str));

function solution(str) {
  let answer = "";

  for (let n of str) {
    let num = n.charCodeAt();
    if (num >= 97 && num <= 122) {
      answer += String.fromCharCode(num - 32);
    } else {
      answer += n;
    }
  }
  return answer;
}

let str = "ItisTimeToStudy";
console.log(solution(str));
