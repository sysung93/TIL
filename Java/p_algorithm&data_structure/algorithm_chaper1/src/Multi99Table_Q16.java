import java.util.Scanner;

//n단의 피라미드를 출력하는 메서드를 작성하세요
public class Multi99Table_Q16 {
    static void spira(int n){
        for(int i = 1 ; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print(' ');
            }
            for(int k = 1; k <= (i-1) * 2 + 1; k ++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        spira(n);
    }
}
