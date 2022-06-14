const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

// 테스트 케이스 개수 분리
let inputC = +input[0];

// 각 테스트 케이스별 학생수 & 점수 분리
let inputTestCase = [];
for (let i = 1; i <= inputC; i++) {
  const arr = input[i].split(" ").map((item) => +item);
  const newArr = [];
  for (let i = 1; i <= arr[0]; i++) {
    newArr.push(arr[i]);
  }
  /*
  arr : 5,50,50,70,80,100
  newarr : 50,50,70,80,100
  arr : 7,100,95,90,80,70,60,50
  newarr : 100,95,90,80,70,60,50
  arr : 3,70,90,80
  newarr : 70,90,80
  arr : 3,70,90,81
  newarr : 70,90,81
  arr : 9,100,99,98,97,96,95,94,93,91
  newarr : 100,99,98,97,96,95,94,93,91
  */
  const testCase = {
    N: arr[0],
    arr: newArr,
  };
  inputTestCase.push(testCase);
}

solution(inputC, inputTestCase);

function solution(C, testCase) {
  for (let testCaseIdx = 0; testCaseIdx < C; testCaseIdx++) {
    // 학생 수
    const n = testCase[testCaseIdx].N;
    // 학생 수 별 점수(newArr)
    const arr = testCase[testCaseIdx].arr;

    // 총 합 구하기
    let scoreSum = 0;
    for (let i = 0; i < n; i++) {
      scoreSum += arr[i];
    }
    /*
      350
      545
      240
      241
      863
    */

    // 평균 구하기
    let ave = scoreSum / n;

    // 평균보다 점수가 높은 학생 구하기
    let cnt = 0;
    for (let i = 0; i < n; i++) {
      if (ave < arr[i]) {
        cnt++;
      }
    }

    // 학생 비율 구하기
    let ratio = ((cnt / n) * 100).toFixed(3);
    //console.log(ratio + "%");
  }
}
