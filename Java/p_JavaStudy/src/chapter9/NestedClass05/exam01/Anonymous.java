package chapter9.NestedClass05.exam01;

public class Anonymous {
    Person field = new Person() {
        String studentNO;
        void work() {
            System.out.println("출근합니다.");
        }

        @Override
        void wake() {
            System.out.println("6시에 일어납니다.");
            work();
        }
    };

    void method1() {
        Person localVar = new Person() {
            String studentNO;
            void walk() {
                System.out.println("산책합니다.");
            }

            @Override
            void wake() {
                System.out.println("7시에 일어납니다");
                walk();
            }
        };
        localVar.wake();
    }
    void method2(Person person) {
        person.wake();
    }
}
