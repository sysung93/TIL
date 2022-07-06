const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

// N : 도감에 수록되어있는 포켓몬의 수
// M : 맞춰야 하는 문제의 개수
let NM = input[0].split(" ").map((item) => +item);
let N = NM[0];
let M = NM[1];

// 1번부터 N번까지의 포켓몬
let poketmon = [];
for (let i = 1; i <= N; i++) {
  poketmon.push(input[i].trim());
}

// M개의 문제
// 포켓몬 이름 => 포켓몬 번호 , 번호 => 포켓몬 이름
let checkStr = [];
for (let j = N + 1; j <= N + M; j++) {
  // 문제가 이름인지 번호인지 확인하기
  // 숫자가 아니라면 이름이다
  if (isNaN(+input[j])) {
    checkStr.push(input[j].trim());
  } else {
    checkStr.push(+input[j].trim());
  }
}

solution(N, M, poketmon, checkStr);

function solution(N, M, poketmon, checkStr) {
  const map = new Map();

  // 포켓몬도감을 돌면서
  // 포켓몬 이름과 포켓몬인덱스(1번부터) 저장하기
  [...poketmon].forEach((name, idx) => {
    map.set(name, idx + 1);
  });

  // 문제를 돌면서
  checkStr.forEach((val) => {
    // 문자열인경우 map에 저장한 idx 찾아오기
    if (isNaN(val)) {
      console.log(map.get(val));
    }
    // 숫자인 경우 포켓몬도감 인덱스에 저장되어있는 이름 찾기
    else {
      console.log(poketmon[val - 1]);
    }
  });
}
