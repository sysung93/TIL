const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");
solution(input[0]);

function solution(str) {
  let obj = {};
  for (let i = 0; i < str.length; ++i) {
    // 문자열 대문자로 바꾸기
    let nowChar = str[i].toUpperCase();
    // obj에 key와 value로 저장
    if (obj[nowChar]) {
      obj[nowChar]++;
    } else {
      obj[nowChar] = 1;
    }
  }
  let maxValue = -1;
  let maxChar = "";
  let isDuplicated = false;
  for (const el in obj) {
    //obj vlaue가 max보다 크면 max와 key 교체하기
    if (obj[el] > maxValue) {
      maxValue = obj[el];
      maxChar = el;
      isDuplicated = false;
      // 같으면 duplicated true로 바꾸기
    } else if (obj[el] === maxValue) {
      isDuplicated = true;
    }
  }
  if (isDuplicated) {
    console.log("?");
  } else {
    console.log(maxChar);
  }
}
