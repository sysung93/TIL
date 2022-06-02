function solution(arr) {
  let answer = arr;

  for (let i = 0; i < arr.length; i++) {
    // 최소값의 위치를 저장할 변수
    let idx = i;
    for (let j = i + 1; j < arr.length; j++) {
      //작은 값을 발견하면 idx에 작은값의 위치를 저장
      if (arr[j] < arr[idx]) idx = j;
    }
    //arr[i]와 arr[idx]의 위치를 바꿈
    [arr[i], arr[idx]] = [arr[idx], arr[i]];
  }
  return answer;
}

let arr = [13, 5, 11, 7, 23, 15];
console.log(solution(arr));
