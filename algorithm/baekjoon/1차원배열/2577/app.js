const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

const items = input.map((item) => +item);

solution(items);

function solution(arr) {
  let num = arr[0] * arr[1] * arr[2];
  // 배열메소드 사용할 수 있게 String으로 바꾸기
  let strNum = String(num);
  // 0으로 초기화된 길이 10의 배열만들기
  let cnt = Array(10).fill(0);

  for (let i = 0; i < strNum.length; i++) {
    // strNum[i]를 숫자로 바꿔 temp에 저장
    const temp = +strNum[i];
    // cnt[temp]를 증가
    cnt[temp]++;
  }

  for (let i = 0; i < cnt.length; i++) {
    console.log(cnt[i]);
  }
}
