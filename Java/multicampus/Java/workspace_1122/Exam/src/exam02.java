import java.util.Scanner;

//ȭ�䰳������
/*(�������� 2) ȭ�󰳼� ����
10���� ¥�� ��ǥ�� ���� ���Ǳ⸦ ������� �մϴ�. 
���Ǳ⿡ ��ǥ�� �Է��ϸ� �Ž������� ����Ͽ� ��Ȯ�ϰ� �ʿ��� 
ȭ����� ������ ����Ͽ��� �մϴ�. 
�̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
public class exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int num1000 = (a/10000);
		int num500 = (a%10000)/5000;
		int num100 = (a%5000)/1000;
		int num50 = (a%1000)/500;
		int num10 = (a%500)/100;
		int num5 = (a%100)/50;
		int num1 = (a%50)/10;

		
		
		System.out.println("10000 -------> " + num1000 + "��");
		System.out.println("5000 -------> " + num500 + "��");
		System.out.println("1000 -------> " + num100 + "��");
		System.out.println("500 -------> " + num50 + "��");
		System.out.println("100 -------> " + num10 + "��");
		System.out.println("50 -------> " + num5 + "��");
		System.out.println("10 -------> " + num1 + "��");
	}

}
