
public class Operator {
	public static void main(String[] args) {
		int a, b;
		
		a = 7;
		b = 2;
		
		//문자열을 더해서 더하지 않고 숫자 문자 막 섞어서 문장을 만들 때 사용
		System.out.printf("%05d + %05d = %05d\n", a, b, a+b);
		System.out.printf("%d - %d = %d\n", a, b, a-b);
		System.out.printf("%d * %d = %d\n", a, b, a*b);
		System.out.printf("%d / %d = %d\n", a, b, a/b);
		System.out.printf("%d %% %d = %d\n", a, b, a%b);
		
		System.out.printf("%.2f\n", 12.455666);
		
	}

}
