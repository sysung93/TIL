package Chapter4;

public class Day5_Quiz1 {
    public static void main(String[] args) {
        //3번 문제

        int sum = 0;

        for(int i = 1; i <= 100 ; i++) {
            if (i % 3 == 0) {
            sum += i;
            }
        }
        System.out.println(sum);
    }
}
