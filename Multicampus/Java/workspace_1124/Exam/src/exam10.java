import java.util.Scanner;

public class exam10 {
	public static void main(String[] args) {
		//1 ~ n������ ������ �ջ��� 1000�� �Ѵ� ������ n�� ��
		Scanner sc = new Scanner(System.in);
		
		int i = 1;
		int sum = 0;
		
		while ( sum < 1000) {
			sum += i;
			i++;
		} System.out.println(i-1);
	}

}