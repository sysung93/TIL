import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int number; //�Է°�
		//System.in > Ű���忡�� ���� �޾Ƽ� scanner Ŭ������ ó��
		Scanner sc = new Scanner(System.in);
		//Ű���带 ������ '0', 'A', '6', ----- unicode
		System.out.print("���� : ");
		
		number = sc.nextInt();; // '0' > 0  '9' > 9
		
		//¦�� -2������� �������� 0�� ��
		if(number%2 == 0) { //�������� true �Ǵ� false��� ���� �� �ִ� ����(���ǽ�)
			System.out.println("¦���Դϴ�.");
		} else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}

}
