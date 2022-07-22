const fs = require("fs");
const filePath = process.platform === "linux" ? "/dev/stdin" : "./input.txt";
let input = fs.readFileSync(filePath).toString().split("\n");

let NK = input[0].split(" ").map((item) => +item);
let N = NK[0];
let K = NK[1];

let nArr = input[1].split(" ").map((item) => +item);

solution(N, K, nArr);

function solution(N, K, nArr){
    let max = Number.MIN_SAFE_INTEGER;
    let sum = 0;
    let idx = 0;

    for(let i = 0; i < N; i++){
        sum += nArr[i];
        idx++;
        if(idx === K){
            max = Math.max(max, sum);
            sum -= nArr[i - K + 1];
            idx--
        }
    }
    console.log(max);

}