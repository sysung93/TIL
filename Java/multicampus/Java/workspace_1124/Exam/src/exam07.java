import java.util.Scanner;

public class exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ�� �����ϼ���");
		System.out.println("1. ���� ����");
		System.out.println("2. �ﰢ���� ����");
		System.out.println("3. �簢���� ����");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("���� ������ ���մϴ�");
			System.out.println("���� �������� �Է��ϼ���");
			int radius = sc.nextInt();
			double round_area = radius * radius * Math.PI;
			System.out.println("���� ���� : " + round_area);
			break;
		case 2:
			System.out.println("�ﰢ�� ������ ���մϴ�");
			System.out.print("�ﰢ���� �غ��� �Է��ϼ���");
			int base = sc.nextInt();
			System.out.print("�ﰢ���� ���̸� �Է��ϼ���");
			int altitude = sc.nextInt();
			double triangle_area = (base * altitude) / 2;
			System.out.println("�ﰢ���� ���� : " + triangle_area);
			break;
		case 3:
			System.out.println("�簢�� ������ ���մϴ�");
			System.out.print("�簢���� ���α��̸� �Է��ϼ���");
			int width = sc.nextInt();
			System.out.print("�簢���� ���α��̸� �Է��ϼ���");
			int height = sc.nextInt();
			double square_area = (width * height);
			System.out.println("�簢���� ���� : " + square_area + "m2");
			break;
		default : System.out.println("���� �޴��Դϴ�.");
		}
		sc.close();
	}

}
