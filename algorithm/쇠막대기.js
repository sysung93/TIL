function solution(str) {
  let answer = 0;
  let stack = [];

  for (let i = 0; i < str.length; i++) {
    if (str[i] === "(") {
      stack.push(str[i]);
    } else {
      stack.pop();
      // 레이저
      if (str[i - 1] === "(") {
        answer += stack.length;
        //막대기의 끝
      } else {
        answer += 1;
      }
    }
  }
  return answer;
}
let str1 = "()(((()())(())()))(())";
let str2 = "(((()(()()))(())()))(()())";
console.log(solution(str1));
console.log(solution(str2));
