function solution(str) {
  let answer;
  // Map 객체 생성
  let sH = new Map();

  // 스트링 탐색
  for (let i of str) {
    // i 가 Map에 존재하는지 확인, 있으면 +1 없으면 새로운 key 생성
    if (sH.has(i)) {
      sH.set(i, sH.get(i) + 1);
    } else {
      sH.set(i, 1);
    }
  }
  let max = Number.MIN_SAFE_INTEGER;
  //Map의 key와 value값 탐색
  for (let [key, val] of sH) {
    if (val > max) {
      max = val;
      answer = key;
    }
  }
  return answer;
}
let str = "BACBACCACCBDEDE";
console.log(solution(str));
