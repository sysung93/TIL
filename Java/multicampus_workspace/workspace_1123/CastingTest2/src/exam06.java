import java.util.Scanner;

public class exam06 {
	public static void main(String[] args) {
		//1.��������
		String name;
		int kor, eng, mat;
		int total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		//2.�Է�
		System.out.print("�̸� : ");
		name = sc.next();
		System.out.print("���� : ");
		kor = sc.nextInt();
		System.out.print("���� : ");
		eng = sc.nextInt();
		System.out.print("���� : ");
		mat = sc.nextInt();
		
		//3.����ϱ�
		total = kor + eng + mat;
		avg = total/3.0;
		
		System.out.printf("%s�� ������ %d �̰� ����� %.2f �̴�./n", name, total, avg);
		
	}

}
