package chapter10.Exception01.exam01;

public class ClassCastExceptionExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        changeDog(dog);

        Cat cat = new Cat();
        //changeDog(Cat);

        // Cat cat = cat animal

    }

    public static void changeDog(Animal animal) {
        if(animal instanceof Dog){
        Dog dog = (Dog) animal;
    } else {
            System.out.println("Dog으로 변환이 어렵습니다");}
    }
}

class Animal{}
class Dog extends Animal {}
class Cat extends Animal {}
