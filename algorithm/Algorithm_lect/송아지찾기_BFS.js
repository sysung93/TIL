function solution(s, e) {
  // 이미 탐색된 것을 체크하기 위한 배열(탐색 : 1 탐색x : 0)
  let ch = Array.from({ length: 10001 }, () => 0);
  // 거리를 구하는 배열
  // dis[nv] = dis[v]+1 부모의 distance 값 + 1
  let dis = Array.from({ length: 10001 }, () => 0);
  let queue = [];
  // 출발지점
  ch[s] = 1;
  queue.push(s);
  // 현수 출발지점
  dis[s] = 0;
  while (queue.length) {
    // 첫 줄발좌표(5)
    let x = queue.shift();
    // nx = x에서 점프해서 갈 수 있는 거리
    for (let nx of [x - 1, x + 1, x + 5]) {
      // 종착지점에 오면 return
      if (nx === e) return dis[x] + 1;
      if (nx > 0 && nx <= 10000 && ch[nx] === 0) {
        // 이미 탐색된것은 1로 체크
        ch[nx] = 1;
        // queue에 push
        queue.push(nx);
        dis[nx] = dis[x] + 1;
      }
    }
  }
}
console.log(solution(5, 14));
console.log(solution(8, 3));
