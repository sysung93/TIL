const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

// 도로의 길이
let road = input[1].split(" ").map((item) => +item);
// 기름 가격
let oilPrice = input[2].split(" ").map((item) => +item);

solution(+input[0], road, oilPrice);

function solution(N, road, oilPrice) {
  // 처음 출발할 때 기름 무조건 넣어야함
  // 기름통의 크기는 무제한임
  // 1km마다 1리터의 기름 사용
  // N개의 도시

  let totalCost = 0;
  let lowestPrice = oilPrice[0];
  // 마지막 주유소의 기름 값은 의미 없음
  for (let i = 0; i < N - 1; i++) {
    // 도시이동거리 * 최저가
    totalCost += road[i] * lowestPrice;
    // 다음도시의 주유비가 현재가보다 더 싼지 확인하기
    if (oilPrice[i + 1] < lowestPrice) {
      lowestPrice = oilPrice[i + 1];
    }
  }
  console.log(totalCost);
}
