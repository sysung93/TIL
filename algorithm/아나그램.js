function solution(str1, str2) {
  let answer = "YES";

  let sH = new Map();

  // sH에 str1의 key와 value를 저장
  for (let i of str1) {
    if (sH.has(i)) {
      sH.set(i, sH.get(i) + 1);
    } else {
      sH.set(i, 1);
    }
  }

  // str2를 돌면서 sH의 key와 value를 삭제
  for (let i of str2) {
    //sH가 i를 가지고 있지 않거나, 개수가 0개라면 false
    if (!sH.has(i) || sH.get(i) === 0) return "NO";
    // if 조건문을 통과한경우 sH의 key와 value를 1개 삭제
    sH.set(i, sH.get(i) - 1);
  }

  return answer;
}

let str1 = "AbaAeCe";
let str2 = "baeeACA";
console.log(solution(str1, str2));
