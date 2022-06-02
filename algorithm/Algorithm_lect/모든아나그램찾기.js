// // 아나그램인지 확인
// function compareMaps(map1, map2) {
//   // map1과 map2의 길이가 같은지 확인
//   if (map1.size !== map2.size) return false;

//   // map1과 map2의 key와 value값 확인
//   for (let [key, val] of map1) {
//     // map2의 key가 없거나 map2의 val과 map1의 val값이 불일치하는경우를 확인
//     if (!map2.has(key) || map2.get(key) !== val) {
//       return false;
//     }
//     // 위의 경우를 제외하고는 true
//     return true;
//   }
// }

// function solution(str1, str2) {
//   let answer = 0;

//   let str1H = new Map();
//   let str2H = new Map();

//   // str2를 strH2에 세팅
//   for (x of str2) {
//     if (str2H.has(x)) {
//       str2H.set(x, str2H.get(x) + 1);
//     } else {
//       str2H.set(x, 1);
//     }
//   }

//   // 슬라이딩윈도우로 2 + 1개씩 추가하면서 확인해야하니
//   // 제일 먼저 기본 2개를 세팅하기
//   let len = str2.length - 1;
//   for (let i = 0; i < len; i++) {
//     if (str1H.has(str1[i])) {
//       str1H.set(str1[i], str1H.get(str1[i]) + 1);
//     } else {
//       str1H.set(str1[i], 1);
//     }
//   }

//   let lt = 0;
//   for (let rt = len; rt < str1.length; rt++) {
//     // rt한칸 이동해서 str1H에 문자 추가
//     if (str1H.has(str1[rt])) {
//       str1H.set(str1[rt], str1H.get(str1[rt]) + 1);
//     } else {
//       str1H.set(str1[rt], 1);
//     }

//     // str1H와 str2H를 비교하기
//     if (compareMaps(str1H, str2H)) {
//       answer++;
//     }

//     // 비교 후 str1H 제일 앞의 키 삭제하기
//     str1H.set(str1[lt], str1H.get(str1[lt]) - 1);
//     if (str1H.get(str1[lt]) === 0) {
//       str1H.delete(str1[lt]);
//       // 제일 앞의키 삭제후 lt 한 칸 이동
//       lt++;
//     }
//   }
//   return answer;
// }

// let str1 = "bacaAacba";
// let str2 = "abc";

function compareMaps(map1, map2) {
  if (map1.size !== map2.size) return false;
  for (let [key, val] of map1) {
    if (!map2.has(key) || map2.get(key) !== val) return false;
  }
  return true;
}

function solution(s, t) {
  let answer = 0;
  let tH = new Map();
  let sH = new Map();

  for (let x of t) {
    if (tH.has(x)) tH.set(x, tH.get(x) + 1);
    else tH.set(x, 1);
  }

  let len = t.length - 1;
  for (let i = 0; i < len; i++) {
    if (sH.has(s[i])) sH.set(s[i], sH.get(s[i]) + 1);
    else sH.set(s[i], 1);
  }

  let lt = 0;
  for (let rt = len; rt < s.length; rt++) {
    if (sH.has(s[rt])) sH.set(s[rt], sH.get(s[rt]) + 1);
    else sH.set(s[rt], 1);
    if (compareMaps(sH, tH)) answer++;
    sH.set(s[lt], sH.get(s[lt]) - 1);
    if (sH.get(s[lt]) === 0) sH.delete(s[lt]);
    lt++;
  }
  return answer;
}

let a = "bacaAacba";
let b = "abc";
console.log(solution(a, b));
