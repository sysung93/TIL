import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		final float PI = 3.141592f; 
		//final�� ���̸� ���, ���� ������ �� ����.
		//���α׷� ���� ���� ���� ���ٲ۴�
		float radius;
		float surface;
		
		Scanner sc = new Scanner(System.in);
		//���������� - ����� ������ �����ٰ� �˷������
		System.out.println("������ : ");
		radius = sc.nextInt();
		
		surface = radius * radius * PI;
			
		System.out.println(surface);
		
		sc.close(); //
	
}
}
