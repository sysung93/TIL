import java.util.Scanner;

//km�����ϱ�
//meter�� �Է¹޾� km�� m�� ����ϴ� ���α׷� �ۼ��ϱ�
public class exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		a = sc.nextInt();
		
		double b = (a / 1000.0);
		System.out.printf(b + "km");
	}
}
