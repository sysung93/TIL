package chapter9.NestedClass03.exam01;

public class Outter {
    //자바7 이전
    public void method1(final int arg) {
        final int localVariable = 1;
        class Inner {
            void method() {
                /*int arg = 10;
                int localVariable = 1;*/ //복사
                int result = arg + localVariable;
            }
        }
    }
    //자바8 이후
    public void method2(int arg) {
        int localVariable = 1;
        class Inner {
            /*int arg = 10;
              int localVariable = 1;*/ //복사
            void method() {
                int result = arg + localVariable;
            }
        }
    }
}
