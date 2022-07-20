const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

solution(+input[0]);
function solution (n) {
  let DP = Array.from({length: n}, () => 0);
  
  function fib(n) {
    if (n === 1 || n === 2){
      return 1;
    } else {
      return (fib(n - 1) + fib(n - 2));
    }
  }
  console.log(fib(n))
  

  function fibonacci(n) {
    DP[1] = DP[2] = 1
    let cnt = 0;
    for(let i = 3; i <= n; i++){
      DP[i] <= DP[i-1] + DP[i-2];
      cnt++
    }
    return cnt;
  }
  console.log(fibonacci(n));
  
}