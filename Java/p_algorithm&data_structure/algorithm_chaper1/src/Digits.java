import java.util.Scanner;

public class Digits {
    public static void main(String[] args) {
        //입력한 값을 2자리 양수로 제한하는 프로그램

        Scanner sc = new Scanner(System.in);
        int no;

        System.out.println("2자리의 정수를 입력하세요");
        do{
            System.out.print("입력: ");
            no = sc.nextInt();
        }while(no < 10 || no > 99);
        System.out.printf("변수 no의 값은 %d가(이) 되었습니다", no);
    }
}
