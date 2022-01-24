package example;

import java.util.Scanner;

public class Dowhile_exam01 {
	//단을 입력받아 구구단 출력하기
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print(" 단 : ");
			int a = sc.nextInt(); 
			int i = 1;
			
			do { System.out.printf("%d X %d = %d\n", a, i, a*i);
				i++;
				} while (i < 10);
		}

}
