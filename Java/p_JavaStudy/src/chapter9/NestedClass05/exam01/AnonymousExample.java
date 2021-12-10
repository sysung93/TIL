package chapter9.NestedClass05.exam01;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        anony.field.wake();
        System.out.println();

        anony.method1();
        System.out.println();

        anony.method2(new Person() {
            String studentNO;
            void study() {
                System.out.println("공부합니다.");
            }

            @Override
            void wake() {
                System.out.println("8시에 일어납니다");
                study();
            }
        });
    }
}
