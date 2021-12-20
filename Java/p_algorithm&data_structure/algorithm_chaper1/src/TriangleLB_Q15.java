import java.util.Scanner;

//왼쪽 아래가 직각인 이등변 삼각형을 출력(단수 입력)
public class TriangleLB_Q15 {
    static void triangleLB(int n){
        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleLU(int n){
        System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다");
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void triangleRU(int n){
        System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다");
        for(int i = 1; i <= n; i++){
            for(int k = 0; k < i - 1; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= n - i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void triangleRB(int n){
        System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다");
        for(int i = 1; i <= n; i++){
            for(int k = 0; k < n - i; k++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        triangleLB(5);
        System.out.println();
        triangleLU(5);
        System.out.println();
        triangleRU(5);
        System.out.println();
        triangleRB(5);
    }
}
