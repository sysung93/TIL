// 정해진 용량으로 담을 수 있는 갯수 count
function count(songs, capacity) {
  let cnt = 1,
    sum = 0;
  for (let x of songs) {
    // sum에 x 를 더했을 때 더 크면 cnt를 1장 더 늘리고 sum을 x로 교환
    if (sum + x > capacity) {
      cnt++;
      sum = x;
    }
    // sum에 계속 x를 누적하기
    else sum += x;
  }
  return cnt;
}

// 용량정하기
function solution(m, songs) {
  let answer = 0;
  // lt는 arr의 제일 큰값으로 지정
  let lt = Math.max(...songs);
  // rt는 arr의 합으로 지정
  let rt = songs.reduce((a, b) => a + b, 0);

  while (lt <= rt) {
    let mid = parseInt((lt + rt) / 2);
    // count 함수에서 넘겨받은 숫자가 m 보다 작다면 answer에 mid를 저장
    if (count(songs, mid) <= m) {
      answer = mid;
      rt = mid - 1;
    } else lt = mid + 1;
  }
  return answer;
}

let arr = [1, 2, 3, 4, 5, 6, 7, 8, 9];
console.log(solution(3, arr));
