import java.util.Scanner;

public class InputTest1 {
	public static void main(String[] args) {
		//Ű����κ��� ���� �Է¹�������
		Scanner sc = new Scanner(System.in);
		
		int a, b; //�ΰ��� ���� ����
		
		System.out.print("a = ");
		a = sc.nextInt();
		System.out.print("b = ");
		b = sc.nextInt();
		
		System.out.println(a*b);
		
	}

}