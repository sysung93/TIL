import java.util.Scanner;

public class exam06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��ġ�? ");
		int a = sc.nextInt();
		
		System.out.print("�����? ");
		int b = sc.nextInt();
		
		System.out.print("��������? ");
		int c = sc.nextInt();
		
		int payment = ((a * 5000) + (b * 4000) + (c * 6000))/5;
		
		System.out.println("�Ѹ�� �����ؾ� �ϴ� �ݾ� : " + payment);
		
	}

}
