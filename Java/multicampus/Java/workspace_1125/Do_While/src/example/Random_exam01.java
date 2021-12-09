package example;

import java.util.Random;

public class Random_exam01 {
	public static void main(String[] args) {
		// 난수구하기 0-99
		Random rand = new Random();
		
		int limit = 50;
		int sum = 0;
		
		for(int i = 1; i <= limit; i++) {
			sum += rand.nextInt(100);
		}
		System.out.println(sum);
	}


}
