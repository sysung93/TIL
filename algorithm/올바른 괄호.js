function solution(str) {
  let answer = "YES";
  let tmp = [];
  for (i of str) {
    if (i === "(") {
      tmp.push("(");
    } else {
      if (tmp.length === 0) return "NO";
      else if (tmp.includes("(")) {
        tmp.pop(")");
      } else {
        return "NO";
      }
    }
    if (tmp.length === 0) {
      answer;
    }
  }
  return answer;
}

let str = "(()(()))(()))";
let str2 = "(())()";
console.log(solution(str));
console.log(solution(str2));
