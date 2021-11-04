package chapter8.Interface03.exam01;

public class RemoteConrolExample {
    public static void main(String[] args) {
        RemoteControl rc;
        // rc = new RemoteControl(); 생성안됨
        rc = new Television();
        rc = new Audio();

        rc.turnOn();
    }
}
