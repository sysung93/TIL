function solution(str) {
  let answer = "";
  // 문자열 대소문자 통일하기
  str = str.toLowerCase();
  let n = str.length;
  // 문자열 절반만큼 돌면서 비교하기
  for(i = 0; i < (2/n); i++){
    if(str[i] === str[n-1-i]){
      answer = "YES";
    } else {
      answer = "NO"
    }
  }
  return answer;
}
let str = "gooG"
console.log(solution(str))