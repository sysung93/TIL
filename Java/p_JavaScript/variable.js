//1. 'use strict';

//전역변수

let globalName = 'global name';

{
let name = 'ellie'
console.log(name);
name = 'hello' 
console.log(name)
console.log(globalName);
}

console.log(globalName);

const daysInweek = 7;
const maxNumber = 5;

const count = 17 //integer
const size = 17.1 // decimal number
console.log(`value : ${count}, type: ${typeof count}`);
console.log(`value : ${size}, type: ${typeof size}`);

//number - speical numeric values:infinty, -infinitym Nan
const infinity = 1 / 0;
const negativeInfinity = -1/ 0;
const nAn = 'not a number' / 2;
console.log(infinity);
console.log(negativeInfinity);
console.log(nAn)

//string
const char = 'c';
const bredan = 'brendan';
const greeting = 'hello' + bredan;
console.log(`value: ${greeting}, typeof: ${typeof greeting}`)
const helloBob = `hi ${bredan}!`; //template literals
console.log(`value: ${helloBob}, typeof: ${typeof helloBob}`)

//boolean
const canRead = true;
const test = 3 < 1; //false
console.log(`value: ${canRead}, type: ${typeof canRead}`);
console.log(`value: ${test}, type: ${typeof test}`); 

// //null
// let nothing = null;
// consol.log(`value: ${nothing}, thpe: ${typeof nothing}`);

// //undefined
// let x;
// consol.log(`value: ${x}, thpe: ${typeof x}`);

//symbol > 서로 다른 Symbol이 만들어짐
const symbol1 = Symbol('id');
const symbol2 = Symbol('id');
console.log(symbol1 === symbol2);

//주어진 스트링에 맞는 symbol이 만들어짐
const gsymbol1 = Symbol.for('id');
const gsymbol2 = Symbol.for('id');
console.log(gsymbol1 === gsymbol2);
console.log(`value: ${symbol1.description}, type: ${typeof symbol1}`)

//Dynamic typing: dynamically typed language
let text = 'hello';
console.log(`value: ${text}, type: ${typeof text}`);
text = 1;
console.log(`value: ${text}, type: ${typeof text}`);
text = '7' + 5
console.log(`value: ${text}, type: ${typeof text}`);
text = '8' / '2';
console.log(`value: ${text}, type: ${typeof text}`);

