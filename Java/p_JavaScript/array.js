'use strict';

//1. Declaration
const arr1 = new Array();
const arr2 = [1, 2];

//2. Index position
const fruits = ['🍎', '🍌'];
console.log(fruits);
console.log(fruits.length);
console.log(fruits[0]);
console.log(fruits[1]);
console.log(fruits[2]);
console.log(fruits[fruits.length-1])


//3. Looping over an array
//a. for
for(let i = 0; i < fruits.length; i++){
    console.log(fruits[i])
}
//b. for of
for(let fruit of fruits){
    console.log(fruit)
}
//c. forEach
fruits.forEach(function (fruit, index){
    console.log(fruit, index)
})

fruits.forEach((fruit, index) => console.log(fruit, index));



//4. Addtion, deletion, copy
//push
fruits.push('🍓', '🍑');
console.log(fruits);

//pop
fruits.pop();
fruits.pop();
console.log(fruits);

//unshift
fruits.unshift('🍓', '🍋');
console.log(fruits);

//shift
fruits.shift();
fruits.shift();
console.log(fruits);


//splice
fruits.unshift('🍓', '🍑', '🍋');
console.log(fruits);

fruits.splice(1, 1, '🍏', '🍉')
console.log(fruits);


//combine
const fruits2 = ['🍐', '🥥'];
const newFruits = fruits.concat(fruits2);
console.log(newFruits);



//5. Searching
console.log(fruits);

console.log(fruits.indexOf('🍏'));
console.log(fruits.indexOf('🍉'));
console.log(fruits.indexOf('🥥'));
console.log(fruits.includes('🍉'));
console.log(fruits.includes('🥥'));

console.clear();


fruits.push('🍏');
console.log(fruits);

console.log(fruits.indexOf('🍏'));
console.log(fruits.lastIndexOf('🍏'));