const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let NK = input[0].split(" ").map((item) => +item);
let N = NK[0];
let K = NK[1];

let nArr = [];
for (let i = 1; i <= 10; i++) {
  nArr.push(+input[i]);
}

solution(N, K, nArr);

function solution(N, K, nArr) {
  let price = K;
  let cnt = 0;

  // 큰 수 부터 확인하기 위해 내림차순 정렬하기
  nArr.sort((a, b) => b - a);

  for (let i = 0; i < N; i++) {
    // price보다 동전의가치가 크다면 다음으로 넘어가기
    if (price < nArr[i]) continue;
    // pirce가 동전의 가치보다 작다면
    else {
      // 동전의 개수 저장하기
      let temp = Math.floor(price / nArr[i]);
      cnt += temp;
      // 나누고 남은 나머지 price에 다시 저장
      price = price % nArr[i];
      // price가 0이라면 멈추기
      if (price === 0) break;
    }
  }
  console.log(cnt);
}
