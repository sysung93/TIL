package chapter6;

public class Car3 {
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    Car3() {
        this(null,null,0);
    }
    Car3(String model) {
        // this.model = model;
        this(model, null, 0);

    }
    Car3(String model, String color){
        /*this.model = model;
        this.color = color;*/
        this(model, color, 0);
    }
    Car3(String model, String color, int maxSpeed) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
