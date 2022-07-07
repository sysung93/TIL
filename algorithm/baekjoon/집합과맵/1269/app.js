const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

// A : 집합 A 개수
// B : 집합 B 개수
let AB = input[0].split(" ").map((item) => +item);
let A = AB[0];
let B = AB[1];

// A집합
let A_Sets = input[1].split(" ").map((item) => +item);

// B집합
let B_Sets = input[2].split(" ").map((item) => +item);

solution(A, B, A_Sets, B_Sets);

function solution(A, B, A_Sets, B_Sets) {
  // Set 객체로 만들기
  const setA = new Set([...A_Sets]);
  const setB = new Set([...B_Sets]);

  // 차집합 구현
  Set.prototype.diffrence = function (set) {
    return new Set([...this].filter((v) => !set.has(v)));
  };

  // A - B
  let AB = setA.diffrence(setB);
  // B - A
  let BA = setB.diffrence(setA);

  // 각 차집합의 길이 더하기
  let answer = AB.size + BA.size;
  console.log(answer);
}
