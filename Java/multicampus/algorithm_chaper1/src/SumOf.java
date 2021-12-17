import java.util.Scanner;

public class SumOf {
    static int sumof( ){
        Scanner sc = new Scanner(System.in);
        System.out.print("a값 입력: ");
        int a = sc.nextInt();
        System.out.print("b값 입력: ");
        int b = sc.nextInt();
        int sum = 0;

        for(int i = a; i <= b; i++){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumof());
    }
}
