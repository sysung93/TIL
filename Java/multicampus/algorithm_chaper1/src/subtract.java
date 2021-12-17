import java.util.Scanner;

public class subtract {
    static int sub() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        System.out.print("a의 값 : ");
        a = sc.nextInt();
        do{
            System.out.print("b의 값 : ");
            b = sc.nextInt();
        } while(a > b);

        int result = b - a;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sub());
    }
}
