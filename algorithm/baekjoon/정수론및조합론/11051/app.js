const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let n = 0;
let k = 0;
for (let i = 0; i < 2; i++) {
  let temp = input[0].split(" ").map((item) => +item);
  n = temp[0];
  k = temp[1];
}

solution(n, k);

function solution(n, k) {
  // 파스칼의 삼각형만들기
  let dy = Array.from({ length: n + 1 }, () => new Array(n + 1).fill(0));
  dy[0][0] = 1;
  dy[1][0] = 1;
  dy[1][1] = 1;

  for (let i = 2; i <= n; i++) {
    for (let j = 0; j <= i; j++) {
      // 파스칼의 삼각형 양쪽 끝은 1이다.
      if (j == 0 || j == i) {
        dy[i][j] = 1;
      } else {
        // 내 위의 숫자를 내려받아 서로 더한다.
        // 숫자가 크기 때문에 미리 10007로 나눠주기
        dy[i][j] = (dy[i - 1][j - 1] + dy[i - 1][j]) % 10007;
      }
    }
  }
  console.log(dy[n][k]);
}
