package chapter6;

public class computerExample {
    public static void main(String[] args) {

        computer myCom = new computer();

        int[] values1 = {1, 2, 3};
        int result1 = myCom.sum1(values1);
        System.out.println(result1);


        int result2 = myCom.sum2(1, 2, 3);
        System.out.println(result2);

        int result3 = myCom.sum2(1, 2, 3, 4, 5);
        System.out.println(result3);
    }
}
