function solution(str) {
  let answer = str;
  // 정규표현식 g(전체에서) A를 찾아서 #으로 변환
  answer = answer.replace(/A/g, "#");
  return answer;
}

let str = "BANANA";
console.log(solution(str));
