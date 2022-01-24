package example;

import java.util.Scanner;

public class For_exam02 {

	public static void main(String[] args) {
		// 1~n 까지의 합계 구하기(n은 입력값)
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			sum += i;
		} System.out.println(sum);

	}

}
