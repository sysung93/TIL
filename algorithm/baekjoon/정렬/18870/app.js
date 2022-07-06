const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let testCaseArr = [];
testCaseArr = input[1].split(" ").map((item) => +item);

solution(+input[0], testCaseArr);

// 메모리 초과
// function solution(N, coordinate) {
//   // set 객체
//   let set = new Set();
//   // 정답을 담을 배열
//   let answer = [];

//   for (let i = 0; i < N; i++) {
//     // i 한번 반복할 때마다 set 비워주기
//     set.clear();
//     for (let j = 0; j < N; j++) {
//       // i가 j 보다크면 j를 담기
//       // set은 중복을 허용하지 않으므로 조건을 주지 않아도 됨
//       if (coordinate[i] > coordinate[j]) {
//         set.add(coordinate[j]);
//       }
//     }
//     // answer에 set의 길이 담기
//     answer.push(set.size);
//   }
//   // answer 출력하기
//   console.log(answer.join(" "));
// }

// function solution(N, coordinate) {
//   let answer = [];

//   for (let i = 0; i < N; i++) {
//     let temp = [];
//     for (let j = 0; j < N; j++) {
//       if (coordinate[i] > coordinate[j] && !temp.includes(coordinate[j])) {
//         temp.push(coordinate[j]);
//       }
//     }
//     answer.push(temp.length);
//   }

//   console.log(answer.join(" "));
// }

function solution(N, coordinate) {
  // 원본배열 복사하기
  let temp = [...coordinate];
  // 복사한 배열 정렬하기
  const sortArr = temp.sort((a, b) => a - b);
  // set을 이용해 정렬된 배열 중복 제거하기
  const set = new Set(sortArr);
  // map 객체 만들기
  const map = new Map();

  //set을 돌면서 map에 숫자와 인덱스 저장하기
  [...set].forEach((num, idx) => {
    map.set(num, idx);
  });
  console.log(map);
  let answer = "";

  // 원본배열을 돌면서 map에 저장된 idx 가져오기
  coordinate.forEach((num, idx) => {
    answer += map.get(num) + " ";
  });

  console.log(answer);
}
