'use strict';

//1. producer 
//새로운 rpomise 가 만들어질때는 전달한 excutor함수가 자동적으로 바로 실행된다.
const promise = new Promise((resolve, reject) => {
    //doing some heavy work(network, read files)
    console.log('doing something...');
    setTimeout(() => {
        resolve('ellie');
        //reject(new Error('no network'));
    }, 2000);
});

//2. consumers: then, catch, finally
promise  
    .then((value) => {
    //resolve 콜백함수를 통해 value로 값이 들어옴
    console.log(value);
    })
    .catch(error => {
        console.log(error);
    })
    .finally(() => {
        console.log('finally')
    });

// 3. Promise chaining
const fetchNumber = new Promise((resolve, reject) => {
    setTimeout(() => resolve(1), 1000);
});

fetchNumber
    .then(num => num * 2)
    .then(num => num * 3)
    .then(num => {
        return new Promise((resolve, reject) => {
            setTimeout(() => resolve(num - 1), 1000);
        });
    })
    .then(num => console.log(num));

//4. Error Handling
const getHen = () =>
    new Promise((resolve, reject) => {
        setTimeout(() => resolve('🐓'), 1000)
    });
const getEgg = hen =>
    new Promise((resolve, reject) => {
        setTimeout(() => reject(new Error(`error! ${hen} => 🐣`)), 1000)
    });
const cook = egg =>
    new Promise((resolve, reject) => {
        setTimeout(() => resolve(`${egg} => 🍗`), 1000)
    });

getHen()
.then(getEgg)
.catch(error => {
    return '🥐'
})
.then(cook)
.then(console.log)
.catch(console.log);