package Do_while;
import java.util.Scanner;

public class Do_while2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month;
		
		do {
			System.out.println("�ùٸ� ���� �Է��ϼ��� [1-12]");
			month = sc.nextInt();
		} while (month < 1 || month > 12);
		System.out.println("����ڰ� �Է��� ���� " + month + "�Դϴ�");
	}

}
