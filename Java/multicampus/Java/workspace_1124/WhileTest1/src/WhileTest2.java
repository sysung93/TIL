import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		//�̸� 10�� ����ϱ�
		/*
		 * int i = 0; while(i < 10) { System.out.println("ȫ�浿"); i++; }
		 */
		int i = 0;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("�̸� : ");
		name = sc.next();
		
		while(i < 10) {
			System.out.println(name);
			i++;
		}
	}

}
