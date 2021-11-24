import java.util.Scanner;

public class exam05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("변 1: ");
		int a = sc.nextInt();
		System.out.print("변 2: ");
		int b = sc.nextInt();
		
		double c = Math.sqrt(a*a + b*b);
		System.out.println("빗변의길이 : " + c + "입니다");
		
		
		
	}

}
