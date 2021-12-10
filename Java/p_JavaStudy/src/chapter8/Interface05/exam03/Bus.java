package chapter8.Interface05.exam03;

public class Bus implements Vehicle{

    @Override
    public void run() {
        System.out.println("버스가 달립니다.");
    }
}
