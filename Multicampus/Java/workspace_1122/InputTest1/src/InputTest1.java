import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
		//키보드로부터 값을 입력받으려면
		Scanner sc = new Scanner(System.in);
		
		int a, b; //두개의 변수 선언
		
		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		b = sc.nextInt();
		
		System.out.println(a*b);
		
	}

}
