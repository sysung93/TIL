function solution(m, prod) {
  let answer = 0;
  let n = prod.length;
  // 총 비용으로 정렬하기
  prod.sort((a, b) => a[0] + a[1] - (b[0] + b[1]));

  for (let i = 0; i < n; i++) {
    // 순서대로 할인받기
    let money = m - (prod[i][0] / 2 + prod[i][1]);
    let cnt = 1;
    for (let j = 0; j < n; j++) {
      // 남아있는 돈보다 상품가격이 크면 break
      if (j !== i && prod[j][0] + prod[j][1] > money) break;
      // 할인받은 것 제외하고, 순서대로 돌면서 남아있는돈보다 작은 것 체크하기
      if (j !== i && prod[j][0] + prod[j][1] <= money) {
        money -= prod[j][0] + prod[j][1];
        cnt++;
      }
    }
    // 가장 큰 수 더하기
    answer = Math.max(answer, cnt);
  }
  return answer;
}
let arr = [
  [6, 6],
  [2, 2],
  [4, 3],
  [4, 5],
  [10, 3],
];
console.log(solution(28, arr));
