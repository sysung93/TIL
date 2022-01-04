 'use strict'

const obj1 = {}; //'object literal'
const obj2 = new Object(); //'object  constructor'

//  const name = 'ellie'; //변수 하나당 값 하나
//  const age = 4;

//  //출력
//  print(name, age);
//  //함수
//  function print(name, age) {
//      console.log(name);
//      console.log(age);
//  }

 //object

function print(person) {
    console.log(person.name);
    console.log(person.age);
}

const ellie = {name: 'ellie', age: 4}
//print(ellie)
 
//2. Computed properties
//console.log(ellie.name);
//console.log(ellie['name'])

function printValue(obj, key) {
    console.log(obj [key]);
}
//printValue(ellie, 'name'); 
//printValue(ellie, 'age')

//3. Property value shorthand
const person1 = {name: 'bob', age: 2};
const person2 = {name: 'steve', age: 3};
const person3 = {name: 'dave', age: 4};

//  function makePerson(name, age) {
//     return {
//         name, //key와 value의 이름이 동일하다면 생략해서 작성 가능하다
//         age,
//     };
//  }

function Person(name, age){
    // this = {}
    this.name = name;
    this.age = age;
}
// const person4 = makePerson('ellie', 30);
const person4 = new Person('ellie', 30)
//console.log(person4)

//5. in operator
console.log('name' in ellie);
console.log('age' in ellie);
console.log('random' in ellie);
console.log(ellie.random);

/*6. for...in vs for...of

for(key in ellie) {
    //ellie가 가지고 있는 key들이 for문을 돌때마다 지역변수에 할당 된다.
    console.log(key);
}
//배열리스트
const array = [1, 2 ,3 ,4];
// for(let i = 0; i < array.length; i++){
//     console.log(i);
// }

 for(value of array){
     console.log(value);
}*/

//7. Fun cloning
console.clear();

const user = {name: 'ellie', age: '20'};
const user2 = user;
user2.name = 'coder';

console.log(user2)

//old way
const user3 = {};
for(key in user){
    user3[key] = user[key];
}
console.log(user3);


// const user4 = {};
// Object.assign(user4, user);

const user4 = Object.assign({}, user);
console.log(user4);