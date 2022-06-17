const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

const S = input[0];

solution(S);

function solution(S) {
  let alpha = [
    "a",
    "b",
    "c",
    "d",
    "e",
    "f",
    "g",
    "h",
    "i",
    "j",
    "k",
    "l",
    "m",
    "n",
    "o",
    "p",
    "q",
    "r",
    "s",
    "t",
    "u",
    "v",
    "w",
    "x",
    "y",
    "z",
  ];

  // 체크할 배열만들기
  let check = Array(26).fill(0);

  // 알파벳 순서대로 돌면서
  for (let i = 0; i < alpha.length; i++) {
    // 알파벳 인덱스 저장하기
    let alpha_idx = alpha.indexOf(alpha[i]);

    // 알파벳이 문자열에 있는지 확인
    if (S.includes(alpha[i])) {
      // 문자열의 인덱스 저장하기
      let S_idx = S.indexOf(alpha[i]);
      // 알파벳 인덱스 위치에 문자열 인덱스 저장하기
      check[alpha_idx] = S_idx;
    } else {
      // 문자열에 없으면 알파벳 인덱스 위치에 -1 저장하기
      check[alpha_idx] = -1;
    }
  }

  // 문자열로 변환
  let answer = "";
  for (let i = 0; i < check.length; i++) {
    answer += check[i] + " ";
  }
  console.log(answer);
}
