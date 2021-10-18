package Chapter4;

public class Day5_Quiz4 {
    public static void main(String[] args) {
        //6번문제
        int sum = 0;

        for(int i = 1; i <= 5; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
                if(j == i) {
                    System.out.println();
                }
            }
        }
    }
}
