import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ٹ��ð�: ");
		int time = sc.nextInt();
		System.out.print("�ñ�: ");
		int pay = sc.nextInt();
		
		int weekpay = time * pay;
		double overweekpay;
		
		/*
		 * if(time < 20) { System.out.println(weekpay); } else {
		 * overweekpay = (((time-20) * pay) * 0.5 );
		 * System.out.println(weekpay+overweekpay); }
		 */
		
		if(time > 20) {
			overweekpay = ((time-20) * pay * 0.5);
		} else {
			overweekpay = 0;
		}	System.out.printf("�ٹ��ð�: %d �ð���޿�:%d �⺻��:%d ����:%f �հ�:%f", time, pay, weekpay,overweekpay, weekpay+overweekpay);	
	}
}
