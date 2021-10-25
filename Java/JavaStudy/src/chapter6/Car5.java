package chapter6;

public class Car5 {
    int speed;

    void run() {
        System.out.println(speed + "으로 달립니다.");

    }

    public static void main(String[] args) {
        Car5 myCar = new Car5();
        myCar.speed = 60;
        myCar.run();
    }
}
