package contantTest;

import java.util.Scanner;

public class ConstantTest {
	public static void main(String[] args) {
		
		final double KM_PER_MILE = 1.609344;
		
		Scanner sc = new Scanner(System.in);
		
		double km;
		double mile;
		
		System.out.print("���� : ");
		mile = sc.nextDouble();
				
		//����� ���� ������ �� ����
		km = mile * KM_PER_MILE;
		System.out.println(mile + "������ " + km + "ų�ι��� �Դϴ�.");
		
		sc.close();
	}

}
