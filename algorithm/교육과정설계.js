// str1 = 필수과목 str2 = 수업설계
function solution(str1, str2) {
  let answer = "YES";

  // 문자배열로만들기
  let queue = str1.split("");

  for (i of str2) {
    // queue에 필수과목 i가 제일 앞에 존재하는지 확인
    if (queue.includes(i)) {
      // 큐에서 제일 앞에 것을 꺼내서 확인했을때 i와 동일하지 않다면 return NO
      if (i !== queue.shift()) return "NO";
    }
  }
  console.log(queue);

  return answer;
}
let str1 = "CBA";
let str2 = "CBDAGE";
console.log(solution(str1, str2));
