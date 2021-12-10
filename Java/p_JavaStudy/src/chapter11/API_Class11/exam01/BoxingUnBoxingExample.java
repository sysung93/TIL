package chapter11.API_Class11.exam01;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {

        //Boxing
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("100");
        Integer obj3 = Integer.valueOf(100);
        Integer obj4 = Integer.valueOf("100");

        //UnBoxing
        int value1 = obj1.intValue();
        int value2 = obj1.intValue();
        int value3 = obj1.intValue();
        int value4 = obj1.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
    }
}
