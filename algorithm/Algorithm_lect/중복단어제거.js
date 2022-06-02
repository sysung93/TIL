function solution(n, arr) {
  let answer;
  answer = arr.filter(function (v, i) {
    if (arr.indexOf(v) === i) {
      return true;
    }
  });

  return answer;
}

arr = ["good", "time", "good", "time", "student"];
console.log(solution(5, arr));
