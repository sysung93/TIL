package chapter8.Interface08.exam01;

public interface MyInterface {
    public void method1();
    public default void method2() {
        System.out.println("MyInterface_method2 실행");
    }

}
