
public class Operator {
	public static void main(String[] args) {
		int a, b;
		
		a = 7;
		b = 2;
		
		//���ڿ��� ���ؼ� ������ �ʰ� ���� ���� �� ��� ������ ���� �� ���
		System.out.printf("%05d + %05d = %05d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		
		System.out.printf("%.2f\n", 12.455666);
		
	}

}
