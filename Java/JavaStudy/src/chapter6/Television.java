package chapter6;

public class Television {
    static String company = "Samsung";
    static String model = "LCD";
    static String info;
    static int from1to10sum;

    static {
        info = company + "-" + model;

        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        from1to10sum = sum;
    }
}
