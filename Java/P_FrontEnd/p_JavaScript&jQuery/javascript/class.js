'use strict';
/*
//1.class declarations
class Person{
    //constructor(생성자를 통해 오브젝트를 만들 때 필요한 데이터 전달)
    constructor(name, age) {
        //fields(전달된 데이터를 할당)
        this.name = name;
        this.age = age;
    }

    //methods
    speak() {
        console.log(`${this.name}: hello!`)
    }
}

//새로운 object를 만들때는 new를 사용한다.
const ellie = new Person('ellie', 20)
console.log(ellie.name);
console.log(ellie.age);
ellie.speak();

//2. getter ans setter
class User {
    constructor(firstName, lastName, age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //값을 리턴
    get age() {
        return this._age;
    }
    //값을 설정
    set age() {
        if(value < 0) {
            throw Error('age can not be negative')
        }
        this._age = value;
    }
}

const user1 = new User('Steve', 'Job', -1)
cnsole.log(user1.age);


//3. Field(public, private)
class Experiment {
    publicField = 2;
    #privateField = 0;
}

const experiment = new Experiment();
console.log(experiment.publicField);
console.log(experiment.privateField);


// 
class Article {
    static publisher = 'Dream Coding';
    constructor(articleNumber){
        this.articleNumber = articleNumber;
    }

    static printPublisher() {
        console.log(Article.publisher);
    }
}

const article1 = new Article(1);
const article2 = new Article(2);
console.log(Article.publisher);
Article.printPublisher();
*/

//5. 상속 & 다양성

class Shape {
    constructor(width, height, color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    draw() {
        console.log(`drawing ${this.color} color !`)
    }

    getArea() {
        return this.width * this.height;
    }
}

class Rectangle extends Shape{}
class Triangle extends Shape{
    draw() {
        super.draw();
        console.log('🔺')
    }
    getArea() {
        return (this.width * this.height) / 2;
    }
}

const rectangle = new Rectangle(20, 20, 'blue');
rectangle.draw();
console.log(rectangle.getArea() );

const triangle = new Triangle(20, 20, 'red');
triangle.draw();
console.log(triangle.getArea() );

//6. Class checing: instanceOf

console.log(rectangle instanceof Rectangle);
console.log(triangle instanceof Rectangle);
console.log(triangle instanceof Triangle);
console.log(triangle instanceof Shape);
console.log(triangle instanceof Object);