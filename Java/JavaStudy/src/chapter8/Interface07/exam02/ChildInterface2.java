package chapter8.Interface07.exam02;

public interface ChildInterface2 extends ParentInterface{
    @Override
    default void method2() {
        System.out.println("ChildInterface2-method2 실행");
    }
    public void method3();
}
