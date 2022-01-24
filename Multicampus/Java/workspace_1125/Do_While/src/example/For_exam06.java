package example;

import java.util.Scanner;

public class For_exam06 {
	public static void main(String[] args) {
		//약수구하기
		//숫자를 입력받아서 1~ 그 숫자에 도달할떄까지 나눠보고 나머지가 0인것만 출력
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.print(i + ", ");
			}
		}
	}

}
