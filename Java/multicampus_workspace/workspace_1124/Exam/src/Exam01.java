import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("근무시간: ");
		int time = sc.nextInt();
		System.out.print("시급: ");
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
		}	System.out.printf("근무시간: %d 시간당급여:%d 기본급:%d 수당:%f 합계:%f", time, pay, weekpay,overweekpay, weekpay+overweekpay);	
	}
}
