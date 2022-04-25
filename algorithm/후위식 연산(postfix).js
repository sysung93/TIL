function solution(str) {
  let answer = 0;
  let stack = [];
  for (i of str) {
    // 숫자라면 stack에 push
    if (!isNaN(i)) {
      stack.push(Number(i));
    } else {
      // 먼저 꺼낸 것 rt에 저장, 나중에 꺼낸것 lt에 저장
      let rt = stack.pop();
      let lt = stack.pop();

      if (i === "+") {
        stack.push(lt + rt);
      } else if (i === "-") {
        stack.push(lt - rt);
      } else if (i === "*") {
        stack.push(lt * rt);
      } else if (i === "/") {
        stack.push(lt / rt);
      } else if (i === "%") {
        stack.push(lt % rt);
      }
    }
  }
  answer = stack[0];
  return answer;
}

let str = "352+*9-";

console.log(solution(str));
