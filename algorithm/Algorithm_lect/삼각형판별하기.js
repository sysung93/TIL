function solution(a, b, c) {
  let answer;
  let sum = a + b + c;
  let long;

  // 가장 긴 변 찾기
  if (a > b) {
    long = a;
  } else {
    long = b;
  }
  if (c > long) {
    long = c;
  }

  // 삼각형 성립되는지 확인하기
  if (sum - long >= long) {
    answer = "YES";
  } else {
    answer = "NO";
  }

  return answer;
}

console.log(solution(6, 7, 11));
console.log(solution(13, 33, 17));
