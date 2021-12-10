package chapter9.NestedClass05.exam02;

import chapter9.NestedClass02.exam01.A;

public class AnonymousExample {
    public static void main(String[] args) {
        Anonymous anony = new Anonymous();

        anony.field.turnOn();
        anony.field.turnOff();

        anony.method1();

        anony.method2(new RemoteControl() {
            @Override
            public void turnOn() {
                System.out.println("SmartTv를 켭니다");
            }

            @Override
            public void turnOff() {
                System.out.println("SmartTv를 끕니다");
            }
        });
    }
}
