function solution(arr) {
  let answer = 0;
  let cnt = 0;

  for (let i of arr) {
    // 배열을 돌면서 1을 만나면 cnt가 1씩 증가, answer에 cnt를 누적
    if (i === 1) {
      cnt++;
      answer += cnt;
    } else {
      // 0을 만나면 cnt가 0으로 초기화
      cnt = 0;
    }
  }

  return answer;
}

let arr = [1, 0, 1, 1, 1, 0, 0, 1, 1, 0];
console.log(solution(arr));
