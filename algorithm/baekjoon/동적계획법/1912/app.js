const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");
let NArr = input[1].split(" ").map((item) => +item);
solution(+input[0], NArr);
function solution (n, nArr) {
    let max = nArr[0];
    for(let i = 1; i < n; i++){
        if(nArr[i-1] > 0 && nArr[i] + nArr[i-1] > 0){
            nArr[i] += nArr[i-1];
        }
        if (max < nArr[i]){
            max = nArr[i];
        }
    }
    console.log(max);
}