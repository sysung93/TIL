const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs
  .readFileSync(filePath)
  .toString()
  .split("\n")
  .map((item) => +item);

solution(input);

function solution(testCaseArray) {
  // 제한 1 <= n <= 123456이므로 123456 * 2만큼이 max
  let max = 123456 * 2;
  // max만큼의 배열만들기 (0 ~ 1234567)
  let isPrimeArr = Array(max + 1).fill(true);
  // 0과 1은 소수가 아니므로 제외
  isPrimeArr[0] = isPrimeArr[1] = false;

  // 에라토스테네스의체 만들기
  // max의 제곱근까지 반복
  for (let i = 2; i <= Math.ceil(Math.sqrt(max)); i++) {
    // isPrimeArr이 true이면
    if (isPrimeArr[i]) {
      let k = 2;
      // [i * k]배수에 해당하는 인덱스 false로 바꾸기
      while (i * k <= max) {
        isPrimeArr[i * k] = false;
        k++;
      }
    }
  }

  for (let i = 0; i < testCaseArray.length; i++) {
    // testCaseArray[i]가 0이면 멈춘다
    if (testCaseArray[i] === 0) {
      break;
    }

    // n = n , dn = n * 2
    let n = testCaseArray[i];
    let dn = testCaseArray[i] * 2;
    let cnt = 0;

    // n + 1부터 dn까지 true가 몇개있는지 개수세기
    for (let i = n + 1; i <= dn; i++) {
      if (isPrimeArr[i]) {
        cnt++;
      }
    }
    console.log(cnt);
  }
}

// function solution(testCaseArray) {
//   let n = 0;
//   let dn = 0;

//   for (let i = 0; i < testCaseArray.length; i++) {
//     // n
//     n = testCaseArray[i];
//     // n * 2
//     dn = testCaseArray[i] * 2;

//     // dn만큼의 배열 만들기
//     let isPrimeArr = Array(dn + 1).fill(true);

//     // 0과 1은 소수 아님
//     isPrimeArr[0] = isPrimeArr[1] = false;

//     // i * k의 배수는 제외
//     for (let i = 0; i <= Math.ceil(Math.sqrt(dn)); i++) {
//       if (isPrimeArr[i]) {
//         let k = 2;
//         while (i * k <= dn) {
//           isPrimeArr[i * k] = false;
//           k++;
//         }
//       }
//     }

//     // 개수 세기
//     let cnt = 0;
//     for (let i = n + 1; i <= dn; i++) {
//       if (isPrimeArr[i]) {
//         cnt += 1;
//       }
//     }
//     console.log(cnt);
//   }
// }
