const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let items = [];

for (let i = 1; i <= input[0]; i++) {
  items.push(+input[i]);
}

solution(+input[0], items);

// function solution(N, arr) {
//   arr.sort((a, b) => a - b);

//   let answer = arr.join("\n");
//   console.log(answer);
// }

function quickSort(arr) {
  // arr 요소가 하나이면 arr 그대로 반환
  if (arr.length < 2) {
    return arr;
  }

  // arr 첫번째 요소를 기준으로 잡음
  let pivot = arr[0];
  // 기준보다 작을 경우 저장할 배열
  let left = [];
  // 기준보다 클 경우 저장할 배열
  let right = [];

  // arr[1]부터 시작
  for (let i = 1; i < arr.length; i++) {
    // pivot보다 작은 경우 왼쪽배열에 저장
    if (arr[i] < pivot) {
      left.push(arr[i]);
      // pivot보다 큰 경우 오른쪽 배열에 저장
    } else if (arr[i] > pivot) {
      right.push(arr[i]);
      // 그 외의 경우에는 pivot 교체
    } else {
      pivot = arr[i];
    }
  }
  // 더 이상 정렬되지 않을 때 까지 재귀함수로 반복
  // 즉 left나 right에 남아있는 원소가 1개 이하가 될 때 까지 반복한다.
  return quickSort(left).concat(pivot, quickSort(right));
}

function solution(N, arr) {
  let answer = quickSort(arr);
  console.log(answer);
}
