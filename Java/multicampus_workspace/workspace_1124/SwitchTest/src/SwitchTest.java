import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		int sel;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~5���� �߿� �����ϼ���");
		sel = sc.nextInt();
		
		switch(sel) //���� �Ǵ� ���� �� ���� ����� ������ �����̸� �����ϴ�. int, short, long, byte, char
		// �ڹ� 7���� case "��,��,��.... " ���ڿ��� ��
		{
			case 1 : System.out.println("��Ÿ���� �ӱ��� ��÷");
				break;
			case 2 : System.out.println("��Ÿ���� �Һ� ��÷");
				break;
			case 3 : System.out.println("���� ��������ũ ��÷");
				break;
			case 4 : System.out.println("�̵�� Ŀ�ǹͽ� ��Ʈ ��÷");
				break;
			case 5 : System.out.println("�ƽ� ȭ��Ʈ ���ͽ� ��÷");
				break;
			default : System.out.println("��");
		
		}

	}

}
