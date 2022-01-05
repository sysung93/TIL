'use strict'

console.log('1');
console.log('2');
console.log('3');

console.clear();
console.log('1');
setTimeout(function() {
    console.log('2');
}, 1000) //1초가 지난 후 console.log('2')를 실행
console.log('3')

//Synchronous callback 
function printimmediately(print){
    print();
}
printimmediately(() => console.log('hello'));

//Asynchronous callback
function printWithDelay(print, timeout){
    setTimeout(print,timeout);
}
printWithDelay(() => console.log('async callack'), 2000);

//callback Hell example
class UserStorage {
    loginUser(id, password, onSuccess, onError){
        setTimeout(() => {
            if(
                (id === 'ellie' && password === 'dream') ||
                (id === 'coder' && password === 'academy')
            ) {
                onSuccess(id);
            } else {
                onError(new Error('not found'));
            }
        }, 2000);
    }

    getRoles(user, onSuccess, onError){
        setTimeout(() => {
            if(user === 'ellie'){
                onSuccess({name: 'ellie', role: 'admin'});
            } else{
                onError(new Error('no access'));
            }
        }, 1000);
    }
}
//1. 사용자에게 id와 password를 받아오기
//2. 로그인하기
//3. 로그인에 성공하면 로그인한 아이디로 roles를 받아오기
//4. role을 출력하기

const userStorage = new UserStorage();
const id = prompt('enter your id');
const password = prompt('enter your password');
userStorage.loginUser(
    id, 
    password,
    user => {d
        userStorage.getRoles(
            user,
            userWithRole => {
                alert(`Hello ${userWithRole.name}, you have a ${userWithRole.role} role`)
            },
            error => {
                console.log(error)
            }
        );
    },
    error => {console.log(error)}
    );

    //콜백체인의 문제점
    //1.가독성이 떨어짐
    //2. 비즈니스로직을 한눈에 이해하기 어렵다.
    //3. 오류발생시 찾기 어렵다
    //4. 유지보수가 어렵다