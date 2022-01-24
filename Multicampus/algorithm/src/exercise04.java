import java.util.Scanner;

public class exercise04 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // 10진수를 2진수로 변환하기
        /*String temp = "";

        while(num > 0) {
            temp += String.valueOf(num % 2);
            num /= 2;
        }

        StringBuffer sb = new StringBuffer(temp);
        String reversetemp = sb.reverse().toString();
        System.out.println(reversetemp);*/

        // 2진수
        String binaryString = Integer.toBinaryString(num);
        // 8진수
        String octalString = Integer.toOctalString(num);
        // 16 진수
        String hexString = Integer.toHexString(num);

        System.out.println(binaryString);
        System.out.println(octalString);
        System.out.println(hexString);


    }
}

