function solution(board) {
  let answer = 0;
  let n = board.length;
  let dx = [-1, -1, 0, 1, 1, 1, 0, -1];
  let dy = [0, 1, 1, 1, 0, -1, -1, -1];
  let queue = [];
  for (let i = 0; i < n; i++) {
    for (let j = 0; j < n; j++) {
      // board[i][j]가 섬인경우
      if (board[i][j] === 1) {
        // queue에 시작점을 push
        board[i][j] = 0;
        queue.push([i, j]);
        // queue 돌기전에 answer++
        answer++;
        // queue가 0이되면 멈춤
        while (queue.length) {
          let [x, y] = queue.shift();
          // 8방향 탐색
          for (let k = 0; k < 8; k++) {
            // 행좌표
            let nx = x + dx[k];
            // 열좌표
            let ny = y + dy[k];
            if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] === 1) {
              board[nx][ny] = 0;
              queue.push([nx, ny]);
            }
          }
        }
      }
    }
  }
  return answer;
}

let arr = [
  [1, 1, 0, 0, 0, 1, 0],
  [0, 1, 1, 0, 1, 1, 0],
  [0, 1, 0, 0, 0, 0, 0],
  [0, 0, 0, 1, 0, 1, 1],
  [1, 1, 0, 1, 1, 0, 0],
  [1, 0, 0, 0, 1, 0, 0],
  [1, 0, 1, 0, 1, 0, 0],
];
console.log(solution(arr));
