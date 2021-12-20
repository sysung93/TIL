import java.util.Scanner;

// 정수 3개 입력 받아서 최댓값 구하기
public class max1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = a;

        if(max < b) {
            max = b;
        }
        if(max < c) {
            max = c;
        }

        System.out.println("최댓값은 " + max + " 입니다.");
    }
}
