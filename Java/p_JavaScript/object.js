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
console.log(person4)

//5. in operator
console.log('name' in ellie)

