import java.util.Scanner;

public class Random {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		num = (int)(Math.random() * 10 + 1);
		int m; 
		for(int i = 0; i < 5; i++) {
			System.out.println("1-10까지 값을 입력하세요 : ");
			m = sc.nextInt();
			
			System.out.println(num);
			if (num == m) {
				break;
			}
			if(num > m) {
				System.out.println("더 큰 수를 입력하세요");				
			}
			else if(num < m) {
				System.out.println("더 작은 수를 입력하세요");
			} else {
				System.out.println("맞췄다");
				break;
			}
		} System.out.println("맞췄다");		
	}
}
