package example;

import java.util.Scanner;

public class For_exam06 {
	public static void main(String[] args) {
		//������ϱ�
		//���ڸ� �Է¹޾Ƽ� 1~ �� ���ڿ� �����ҋ����� �������� �������� 0�ΰ͸� ���
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
