/* unction printHello() {
    console.log('Hello');
}

printHello()


function log(message) {
    console.log(message);
}

log('Hello@')
log('안녕하세요')
log(1234) 



//2.parameters

function changeName(obj){
    obj.name = 'coder';
}

const ellie = {name: 'ellie'};
changeName(ellie);
console.log(ellie);



//3.Default parameters(added in ES6)
function showMessage(message, from = 'unknown'){
    console.log(`${message} by ${from}`)
}
showMessage('Hi!')


//4. Rest parameters(added in Es6)

function printAll(...args){
    for(let i = 0; i < args.length; i++){
        console.log(args[i]);
    }
}

function printAll(...args){
    for(const arg of args){
        console.log(arg);
    }
}

function printAll(...args){
    args.forEach((arg) => console.log(arg));
}
printAll('dream', 'coding', 'ellie');


//5. local scope
let globalMessage = 'global'; // global variable
function printMessage() {
    let message = 'hello';
    console.log(message); //local variable
    console.log(globalMessage)
}

printMessage()


//6. Return a value
function sum(a, b){
    return a + b;
}
const result = sum(1, 2)
// console.log(`sum: ${sum(1,2)}`)

// 7.Early return, early exit
//bad

function upgradeuser(user){
    if(user.point > 10){
        //long upgrade logic
    }
}

//good
function upgradeuser(user){
    if(user.point <= 10){
        return;
    }

    //long upgrade logic
}

//8.funtion expression
const print = function() {
    //anonymous function
    console.log('print');
};
print();
const printAgain = print;
printAgain();
const sumAgain = sum;
console.log(sumAgain(1, 3));

//9. callback
function randomQuiz(answer, printYes, printNo) {
    if(answer === 'love you') {
        printYes();
    } else {
        printNo();
    }
}
//anonymous function
const printYes = function () {
    console.log('yes!');
}

//named funtion
const printNo = function print() {
    console.log('no!');
}
randomQuiz('wrong', printYes, printNo);
randomQuiz('love you', printYes, printNo);


10. Arrow funciton
const simplePrint = function() {
    console.log('simplePrint!');
}

const simplePrint = () => console.log ('simplePrint!');

const add = function(a, b) {
    console.log(a+b)
}
 
const add = (a, b) => a + b;

*/

//11. IIFE : Immediately Invoked Funciton Expression
// function hello() {
//     console.log('IIEF')
// }

// hello();
(function hello() {
    console.log('IIEF')
}) ();