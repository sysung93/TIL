function solution(arr) {
  let answer = 0;
  // time을 2개의 이벤트로 쪼개기
  let TimeLine = [];
  // s는 온 시간, e는 간 시간
  for (let x of arr) {
    TimeLine.push([x[0], "s"]);
    TimeLine.push([x[1], "e"]);
  }

  TimeLine.sort((a, b) => {
    // 시간이 같다면 e가 먼저 앞으로 오게 정렬
    // 아스키 코드상으로 e가 더 빠르다
    if (a[0] === b[0]) return a[1].charCodeAt() - b[1].charCodeAt();
    else return a[0] - b[0];
  });

  let cnt = 0;
  // s를 만나면 cnt++ e를 만나면 cnt--
  for (let x of TimeLine) {
    if (x[1] === "s") cnt++;
    else cnt--;
    // answer와 cnt를 비교해 더 큰 값을 answer로 교체
    answer = Math.max(answer, cnt);
  }

  return answer;
}

arr = [
  [14, 18],
  [12, 15],
  [15, 20],
  [20, 30],
  [5, 14],
];
console.log(solution(arr));
