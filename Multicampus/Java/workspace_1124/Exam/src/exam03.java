import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int TARGET = 1000;
		int performance = sc.nextInt();
		double performance_pay = (performance - TARGET) * 0.1;
		
		if(performance > TARGET) {
			System.out.println("�������� : " + (int)(performance_pay) + "���� �Դϴ�.");
		} else {
			System.out.println("�������� �����ϴ�.");
		}

	}

}
