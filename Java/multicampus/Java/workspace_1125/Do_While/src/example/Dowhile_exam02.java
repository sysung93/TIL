package example;

import java.util.Scanner;

public class Dowhile_exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//�ΰ��� ���� �Է¹޾� �ִ����� ���ϱ�
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x;
		int y;
		int r;
		
		// �� �� ��� ū �� ���ϱ�
		if(a > b) { 
			x = a; y = b;
		} else {
			x = b; y = a;
		} 
		// 
		while(y != 0) {
			r = x % y;
			x = y;
			y = r;
		} System.out.println(x);
	}

}
