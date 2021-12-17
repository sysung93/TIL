import java.util.Scanner;

public class count {
    static int count() {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("num의 값을 입력하세요: ");
        num = sc.nextInt();

        int length = (int)(Math.log10(num)+1);
        System.out.printf("그 수는 %d자리 입니다.", length);
        return length;
    }

    public static void main(String[] args) {
        count();
    }
}
