import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시급 : ");
		int wage = sc.nextInt();
		
		System.out.print("근무시간 : ");
		int time = sc.nextInt();
				
		int weekWage = time * wage;
		
		System.out.println("주급은 : " + weekWage + "원이다");
	}
}
