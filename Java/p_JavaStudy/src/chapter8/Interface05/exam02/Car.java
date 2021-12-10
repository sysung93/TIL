package chapter8.Interface05.exam02;

public class Car {
    Tire[] tires = {
            new HankookTire(),
            new HankookTire(),
            new HankookTire(),
            new HankookTire()
    };

    void run() {
        for(Tire tire : tires) {
            tire.roll();
        }
    }
}
