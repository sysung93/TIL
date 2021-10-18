package Chapter4;

public class Day5_Quiz2 {
    public static void main(String[] args) {
        //문제 4

        Outter: while (true) {
            int a = (int)(Math.random()*6) + 1;
            int b = (int)(Math.random()*6) + 1;
            System.out.println("(" + a + "," + b + ")");
            if ( a + b == 5) {
                break Outter;
            }
        }
    }
}
