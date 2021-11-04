package chapter8.Interface07.exam02;

public interface ParentInterface {
    public void method1();
    public default void method2() {
        System.out.println("ParentInterface-method2() 실행");
    }
}
