package chapter11.API_Class11.exam01;

public class AutoBoxingUnBoxingExample {
    public static void main(String[] args) {
        // AutoBoxing
        Integer obj = 100;
        System.out.println("value: " + obj.intValue());

        //대입시 AutoUnBoxing
        int value= obj;
        System.out.println("value: " + value);

        //연산시 AutoUnBoxing
        int result = obj + 100;
        System.out.println("result: " + result);

    }
}
