package chapter9.NestedClass02.exam01;

public class A {
    class B {}
    static class C {}

    //인스턴트 필드
    B field1 = new B();
    C field2 = new C();

    //인스턴트 메소드
    void method1() {
        B var1 = new B();
        C var2 = new C();
    }

    //정적 필드
    // static B field3 = new B();
    static C field4 = new C();

    //정적 메소드
    static void method2(){
        //B var1 = new B();
        C var2 = new C();
    }
}
