package example;

import java.util.Scanner;

public class Dowhile_exam02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//두개의 정수 입력받아 최대공약수 구하기
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int x;
		int y;
		int r;
		
		// 두 수 가운데 큰 수 정하기
		if(a > b) { 
			x = a; y = b;
		} else {
			x = b; y = a;
		} 
		// 
		while(y != 0) {
			r = x % y;
			x = y;
			y = r;
		} System.out.println(x);
	}

}
