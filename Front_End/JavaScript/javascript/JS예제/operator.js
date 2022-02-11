//1. String concatenation
console.log('my' + ' cat');
console.log('1' + 2);
console.log(`string literals: 1 + 2' = ${1 +2}`);

//2.Numeric operators 
console.log(1 + 1); //add 더하기
console.log(1 - 1); //substract 빼기
console.log(1 / 1); //divide 나누기
console.log(1 * 1); //multiply 곱하기
console.log(5 % 2); //remainder 나머지
console.log(2 ** 3); //exponentiation 제곱

//3. Increment and decrement operators
let counter = 2;
const preIncrement = ++counter;
//counter = counter + 1; 
//preIncrement = counter;
console.log(`preIncrement: ${preIncrement}, counter: ${counter}`);
const postIncrement = counter++;
//postIncrement = counter;
//counter = counter + 1;
console.log(`postIncrement: ${postIncrement}, counter: ${counter}`);
const preDecrement = --counter;
console.log(`preDecrement: ${preDecrement}, counter: ${counter}`);
const postDecrement = counter--;
console.log(`postDecrement: ${postDecrement}, counter: ${counter}`); 

//4. Assignment operators
let x = 3;
let y = 6;
x += y; // x = x + y
x -= y; // x = x - y
x *= y; // x = x * y
x /= y; // x = x / y 

//5. Comparison operators

console.log(10 < 6); // less than
console.log(10 <= 6); // less than or equal
consle.log(10 > 6) //greater than
consle.log(10 >= 6) //greater than or equal

//6. Logical operators: ||(or), &&(and), !(not)
const value1 = false;
const value2 = 4 < 2;

//||(or) or 연산자는 처음으로 true가 나오면 거기서 멈춘다
console.log(`or: ${value1 || value2 ||check()}`)

//&&(and) and 연산자는 처음으로 false가 나오면 멈춘다
console.log(`and: ${value1 && value2 && check()}`)

//null값 유효성 검사
// if(nullableObject != null) {
// 	nullalbeObject.something;
// }

function check() {
    for(let i = 0; i < 10; i++){
        //wasting time
        console.log('😱')
    }
    return true;
}

//!(not)
 console.log(!value1);

 //7. Equlity
 const stringFive = '5';
 const numberFive = 5;

 
 //==
 console.log(stringFive == numberFive);
 console.log(stringFive != numberFive);

 //===
 console.log(stringFive === numberFive);
 console.log(stringFive !== numberFive); 

 //object equality by reference

 const ellie1 = {name : 'ellie'};
 const ellie2 = {name : 'ellie'};
 const ellie3 = ellie1;

 console.log(ellie1 == ellie2);
 console.log(ellie1 === ellie2);
 console.log(ellie1 === ellie3); 


//8. Conditional operators: if
//if, else if, else
const name = 'ellie';
if(name === 'ellie') {
    console.log('welcome, Ellie!');
} else if( name = 'coder') {
    console.log('You are amazing coder');
} else{
    console.log('unkwnon')
}

//9. Ternary operator: ?
//condition ? value1 : value2;
console.log(name === 'ellie' ? 'yes' : 'no');


//10. switch statement

const browser = 'chrome';
switch (browser) {
    case 'IE':
        console.log('go away!')
        break;
    case 'Chrome':
    case 'Firefox':
        console.log('love you!')
        break;
    default:
        console.log('same all!')
        break;
}




//11. Loops
let i = 3;
while(i > 0) {
    console.log(`while: ${i}`);
    i--;
}

let i = -1
do{
    console.log(`do while: ${i}`)
    i--
} while(i > 0);



//for loop, for(begin; condition; step)
for(i = 3; i > 0; i--){
    console.log(`for: ${i}`);
}

for(let i = 3; i > 0; i -= 2){
    console.log(`inline variable for: ${i}`)
}

//nested loops

for(let i = 0; i < 10; i++){
    for(let j = 0; j < 10; j++) {
        console.log(`i: ${i}, j: ${j}`)
    }
}

