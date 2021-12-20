import java.util.Scanner;

//입력한 수를 한 변으로 하는 정사각형을 * 기호로 출력하기
public class Multi99Table_Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j <= n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
