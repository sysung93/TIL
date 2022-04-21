// function isPrime(num) {
//   // 1은 소수가 아님
//   if (num === 1) return false;
//   // i는 2부터 num의 제곱근까지 반복
//   for (let i = 2; i < parseInt(Math.sqrt(num)); i++) {
//     if (num % i === 0) return false;
//   }
//   return true;
// }
// function solution(arr) {
//   let answer = [];
//   for (let x of arr) {
//     // while문을 돌면서 뒤집기
//     let res = 0;
//     while (x) {
//       let t = x % 10;
//       res = res * 10 + t;
//       x = parseInt(x / 10);
//     }
//     // 소수인지 확인
//     if (isPrime(res)) answer.push(res);
//   }

//   return answer;
// }

// let arr = [32, 55, 62, 20, 250, 370, 200, 30, 100];
// console.log(solution(arr));

function isPrime(num) {
  // 1은 소수가 아님
  if (num === 1) return false;
  // i는 2부터 num의 제곱근까지 반복
  for (let i = 2; i < parseInt(Math.sqrt(num)); i++) {
    if (num % i === 0) return false;
  }
  return true;
}

function solution(arr) {
  let answer = [];
  for (let x of arr) {
    let res = Number(x.toString().split("").reverse().join(""));

    // 소수인지 확인
    if (isPrime(res)) answer.push(res);
  }

  return answer;
}

let arr = [32, 55, 62, 20, 250, 370, 200, 30, 100];
console.log(solution(arr));
