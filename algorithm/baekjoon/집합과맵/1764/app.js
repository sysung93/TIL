const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

// N : 듣도 못한 사람의 수
// M : 보도 못한 사람의 수
let NM = input[0].split(" ").map((item) => +item);
let N = NM[0];
let M = NM[1];

// 1 ~ N 듣도 못한 사람의 이름
let NPerson = [];
for (let i = 1; i <= N; i++) {
  NPerson.push(input[i].trim());
}

// N + 1 ~ N + M : 보도 못한 사람의 이름
let MPerson = [];
for (let j = N + 1; j <= N + M; j++) {
  MPerson.push(input[j].trim());
}

solution(N, M, NPerson, MPerson);

function solution(N, M, NPerson, MPerson) {
  // 사전순으로 정렬하기
  NPerson.sort();
  MPerson.sort();

  // set 객체로 만들기
  const setA = new Set([...NPerson]);
  const setB = new Set([...MPerson]);

  // 교집합 구현 함수
  Set.prototype.intersection = function (set) {
    // set : setB MPerson 보도 못한 사람
    // this : setA NPerson 듣도 못한사람
    return new Set([...this].filter((v) => set.has(v)));
  };

  // NPerson.intersection(MPerson);
  let NM = setA.intersection(setB);
  // 듣보잡 명수 출력
  console.log(NM.size);
  // 듣보잡 이름 출력
  NM.forEach((v) => {
    console.log(v);
  });
}
