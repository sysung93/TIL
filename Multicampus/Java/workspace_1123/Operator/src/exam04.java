import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ȭ���µ� : ");
		double F = sc.nextDouble();
		double C = (F - 32) * 0.55;
		System.out.println("�����µ� : " + C);
		
		
	}

}
