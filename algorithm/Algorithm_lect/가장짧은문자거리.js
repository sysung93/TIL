function solution(str, t) {
  let answer = [];
  // 문자열 길이보다 긴 숫자를 만들기
  p = 1000;

  // 왼쪽의 e로부터 떨어진 거리
  for (i = 0; i < str.length; i++) {
    if (str[i] === t) {
      p = 0;
      answer.push(p);
    } else {
      p++;
      answer.push(p);
    }
  }

  // p를 초기화
  p = 1000;

  // 오른쪽의 e로부터 떨어진 거리
  for (i = str.length - 1; i >= 0; i--) {
    if (str[i] === t) {
      p = 0;
    } else {
      p++;
      // 기존의 i값과 현재 p값 중 작은 값으로 교체하기
      answer[i] = Math.min(answer[i], p);
    }
  }

  return answer;
}

let t = "e";
let str = "teachermode";

console.log(solution(str, t));
