function solution(n, arr) {
  let longStr = arr[0].length;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i].length > longStr) {
      longStr = arr[i];
    }
  }
  return longStr;
}

// let n;
// let arr = new Array(n);
let arr = ["teacher", "time", "student", "beautiful", "good"];
console.log(solution(5, arr));
