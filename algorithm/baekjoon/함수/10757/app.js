const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let arr = input[0].split(" ").map((item) => item);

solution(arr);

function solution(arr) {
  let a = BigInt(arr[0]);
  let b = BigInt(arr[1]);
  let c = BigInt(a + b);

  // BigInt를 출력하면 숫자 끝에 n이 붙어 나오므로
  // toString으로 문자열로 바꿔 출력해야 한다.
  console.log(c.toString());
}
