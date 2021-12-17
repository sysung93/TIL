import java.util.Scanner;

public class SumFor {
    public static void main(String[] args) {
        // 1부터 num까지 정수 합 구하기
        Scanner sc = new Scanner(System.in);

        System.out.println("1부터 num까지의 값을 구합니다.");
        System.out.print("num의 값 : ");
        int num = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= num; i++){
            sum += i;
        }
        System.out.printf("1부터 %d 까지의 합은 %d 입니다.",num, sum);
    }
}
