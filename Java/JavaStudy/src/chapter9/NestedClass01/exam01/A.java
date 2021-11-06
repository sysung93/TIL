package chapter9.NestedClass01.exam01;

public class A {
    A() {
        System.out.println("A 객체가 생성됨");
    }

    //인스턴트 멤버 클래스
    class B {
        int field1;
        //static int field2;
        B() {
            System.out.println("B 객체가 생성됨");
        }
        void method1() {}
        //static void mehtod1() {};
    }

    //정적 멤버 클래스
    static class C {
        int field1;
        static int field2;
        C() {
            System.out.println("C 객체가 생성된");
        }
        void method1(){};
        static void method2(){};

    }

    //로컬클래스스
   void method() {
        class D {
            int field1;
            D() {
                System.out.println("D 객체가 생성됨");
            }
            void method1() {}
        }
        D d = new D();
        d.field1 = 3;
        d.method1();
    }
}
