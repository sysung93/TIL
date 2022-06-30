const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0]);

function solution(N) {
  let M = 0;
  // 0부터 N보다 작은 숫자를 돌면서 확인
  for (let i = 0; i <= N; i++) {
    //nums에 string으로 i를 저장
    let nums = (i + "").split("");

    // i + nums를 더해보기
    let sum = i + nums.reduce((sum, cur) => sum + Number(cur), 0);

    // sum이 N이되면 M에 i를 저장하고 중단
    if (sum === N) {
      M = i;
      break;
    }
  }
  console.log(M);
}
