package example;

import java.util.Scanner;

public class For_exam03 {

	public static void main(String[] args) {
		// n의 배수를 10개 출력
		// n이 3이면 3의 배수 10개, 7이면 7의배수 10개 출력
		// n은 입력값
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i = 1; i < 11; i++) {
			System.out.printf("%d X %d = %d\n", n, i, n*i);
		}
	}

}
