package chapter9.exam01;

public class A {
    A() {
        System.out.println("A 객체가 생성됨");
    }

    class B {
        int field1;
        //static int field2;
        B() {
            System.out.println("B 객체가 생성됨");
        }
        void method1() {}
        //static void mehtod1() {};
    }
}
