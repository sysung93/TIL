import java.util.Scanner;

public class JudgeSign {
    public static void main(String[] args) {
        //양수인지 음수인지 0인지 판단
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if(num > 0 ) {
            System.out.println("양수입니다");
        }
        else if(num < 0) {
            System.out.println("음수입니다");
        }
        else {
            System.out.println("0입니다.");
        }
    }
}
