import java.util.Scanner;

//왼쪽 아래가 직각인 이등변 삼각형을 출력(단수 입력)
public class TriangleLB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        int n;
        do{
            System.out.print("몇 단 삼각형입니까?");
            n = sc.nextInt();
        }while(n <= 0);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
