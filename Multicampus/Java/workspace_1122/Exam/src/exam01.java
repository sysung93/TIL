import java.util.Scanner;

//km변경하기
//meter를 입력받아 km와 m로 출력하는 프로그램 작성하기
public class exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		
		double b = (a / 1000.0);
		System.out.printf(b + "km");
	}
}
