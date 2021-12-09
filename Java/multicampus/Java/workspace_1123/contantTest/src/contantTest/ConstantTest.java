package contantTest;

import java.util.Scanner;

public class ConstantTest {
	public static void main(String[] args) {
		
		final double KM_PER_MILE = 1.609344;
		
		Scanner sc = new Scanner(System.in);
		
		double km;
		double mile;
		
		System.out.print("마일 : ");
		mile = sc.nextDouble();
				
		//상수는 값을 변경할 수 없다
		km = mile * KM_PER_MILE;
		System.out.println(mile + "마일은 " + km + "킬로미터 입니다.");
		
		sc.close();
	}

}
