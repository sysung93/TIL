function solution(board, moves) {
  let answer = 0;
  let stack = [];
  // moves를 돌면서
  moves.forEach((pos) => {
    // board를 하나씩 체크하기
    for (let i = 0; i < board.length; i++) {
      // board[i][pos-1]이 0이 아니면
      if (board[i][pos - 1] !== 0) {
        // 값을 tmp에 저장하기
        let tmp = board[i][pos - 1];
        // board[i][pos - 1]을 0으로 만들기
        board[i][pos - 1] = 0;
        // tmp에 저장한 값이 stack의 제일 상단의 값과 같은지 확인
        if (tmp === stack[stack.length - 1]) {
          stack.pop();
          answer += 2;
          // 다르면 stack에 push
        } else stack.push(tmp);
        // 브레이크 하지않으면 열에 있는 인형을 다꺼내버림
        break;
      }
    }
  });
  return answer;
}

let board = [
  [0, 0, 0, 0, 0],
  [0, 0, 1, 0, 3],
  [0, 2, 5, 0, 1],
  [4, 2, 4, 4, 2],
  [3, 5, 1, 3, 1],
];
let moves = [1, 5, 3, 5, 1, 2, 4];
console.log(solution(board, moves));
