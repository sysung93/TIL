package Chapter4;

public class Day5_Quiz3 {
    public static void main(String[] args) {
        // 문제 5

        for(int x = 1; x <= 10; x++) {
            for(int y = 1; y <= 10; y++) {
                if((4*x+5*y) == 60) {
                    System.out.println("(" + x + "," + y + ")");
                }
            }
        }
    }
}
