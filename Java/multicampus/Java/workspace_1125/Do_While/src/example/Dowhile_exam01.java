package example;

import java.util.Scanner;

public class Dowhile_exam01 {
	//���� �Է¹޾� ������ ����ϱ�
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" �� : ");
			int a = sc.nextInt(); 
			int i = 1;
			
			do { System.out.printf("%d X %d = %d\n", a, i, a*i);
				i++;
				} while (i < 10);
		}

}
