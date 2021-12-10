package chapter8.Interface08.exam02;

public interface ChildInterface3 extends ParentInterface{
    @Override
    default void method2() {
        ParentInterface.super.method2();
    }

    public void method3();
}
