import java.util.Scanner;

public class gauss {
    static int gausssum(int n){

        int result = 0;

        if(n%2 == 0) {
            result = (1+n)*(n/2);
        } else {
            result = (1+n)*(n/2);
            result += (n/2)+1;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(gausssum(n));
    }
}
