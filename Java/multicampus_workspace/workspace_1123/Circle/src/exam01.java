import java.util.Scanner;

public class exam01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ñ� : ");
		int wage = sc.nextInt();
		
		System.out.print("�ٹ��ð� : ");
		int time = sc.nextInt();
				
		int weekWage = time * wage;
		
		System.out.println("�ֱ��� : " + weekWage + "���̴�");
	}
}
