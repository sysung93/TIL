import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = (int)(Math.random() * 10 + 1);
		int m; 
		for(int i = 0; i < 5; i++) {
			System.out.println("1-10���� ���� �Է��ϼ��� : ");
			m = sc.nextInt();
			
			System.out.println(num);
			if (num == m) {
				break;
			}
			if(num > m) {
				System.out.println("�� ū ���� �Է��ϼ���");				
			}
			else if(num < m) {
				System.out.println("�� ���� ���� �Է��ϼ���");
			} else {
				System.out.println("�����");
				break;
			}
		} System.out.println("�����");		
	}
}
