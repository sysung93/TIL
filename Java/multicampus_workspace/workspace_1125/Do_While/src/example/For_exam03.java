package example;

import java.util.Scanner;

public class For_exam03 {

	public static void main(String[] args) {
		// n�� ����� 10�� ���
		// n�� 3�̸� 3�� ��� 10��, 7�̸� 7�ǹ�� 10�� ���
		// n�� �Է°�
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 1; i < 11; i++) {
			System.out.printf("%d X %d = %d\n", n, i, n*i);
		}
	}

}
