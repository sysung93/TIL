const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let T = +input[0];
let testCaseArray = [];

// [[1, 3], [2, 3]] 2중 배열로 입력받는다.
for (let i = 1; i < T * 2; i = i + 2) {
  k = Number(input[i]);
  n = Number(input[i + 1]);
  testCaseArray.push([k, n]);
}

solution(T, testCaseArray);

function solution(T, arr) {
  for (let i = 0; i < T; i++) {
    // 층
    k = arr[i][0];
    // 호
    n = arr[i][1];

    // 인원 저장할 배열
    const house = Array.from(Array(k + 1), () => Array(n + 1).fill(0));

    // 0층 i호에는 i인원만큼 산다.
    for (let i = 0; i <= n; i++) {
      house[0][i] = i;
    }

    for (let i = 1; i <= k; i++) {
      for (let j = 1; j <= n; j++) {
        // k층 n호에는 k-1층 n호 인원 + k층 n-1호의 인원만큼 산다
        house[i][j] = house[i - 1][j] + house[i][j - 1];
      }
    }
    console.log(house[k][n]);
  }
}

//2층 1(1) 2(4) 3(10) 4(20) 5(35)
//1층 1(1) 2(3) 3(6) 4(10) 5(15)
//0층 1(1) 2(2) 3(3) 4(4) 5(5)
