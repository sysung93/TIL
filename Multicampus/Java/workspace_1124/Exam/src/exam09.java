import java.util.Scanner;

public class exam09 {

	public static void main(String[] args) {
		//���� 10�� �Է� �޾� ¦�� Ȧ�� ��� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int i = 1;
		
		int even_num = 0;
		int even_cnt = 0;
		int odd_num = 0;
		int odd_cnt = 0;
		
		while(i <= 10) {
			int num = sc.nextInt();
			if(num % 2 == 0) {
				even_num = num + even_num;
				even_cnt++;
			} else {
				odd_num = num + odd_num;
				odd_cnt++;
			}
			i++;
		} 
		if(even_cnt != 0)
			System.out.println("¦���� ��� : " + (even_num/even_cnt));
		if(odd_cnt != 0)
		 System.out.println("Ȧ���� ��� : " + (odd_num/odd_cnt));

	}

}
