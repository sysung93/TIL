import java.util.Scanner;

public class exam03 {
	public static void main(String[] args) {
		int meter;
		int km;
		int m;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ʹ�? ");
		meter = sc.nextInt();
		
		km = meter / 1000; //�Ҽ������ϰ� �߸��鼭 ���� ����
		m = meter % 1000;
		
		System.out.printf("%d ���ʹ� %dkm ų�ι��Ϳ� %dm �Դϴ�\n", meter, km, m);
		
	}

}
