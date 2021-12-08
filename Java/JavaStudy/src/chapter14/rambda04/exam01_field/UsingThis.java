package chapter14.rambda04.exam01_field;

public class UsingThis {
    public int outterField = 10;

    class Inner{
        int innerField = 20;

        void method() {
            MyFunctionalInterface fi = () -> {
                System.out.println("outterField: " + outterField);
                System.out.println("outterField: " + UsingThis.this.outterField);
                System.out.println("innerField: " + innerField);
            };
            fi.method();
        }
    }
}
