function solution(str) {
  let answer = "";
  let tmp = [];

  for (let i of str) {
    // i가 ")"인경우
    if (i === ")") {
      // tmp에 담긴게 "("이거나, 문자인경우 지우기
      while (tmp.pop() !== "(");
    }
    // i가 ")"가 아닌경우에는 push
    else tmp.push(i);
  }
  answer = tmp.join("");
  return answer;
}
let str = "(A(BC)D)EF(G(H)(IJ)K)LM(N)";
console.log(solution(str));
