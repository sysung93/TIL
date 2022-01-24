package example;

public class For_exam05 {
	public static void main(String[] args) {
		//if, for문 이용
		//1 -10까지 출력
		//11 - 20까지 출력 .... 100까지
		
		for(int i = 1; i <= 100; i++) {
			if(i % 10 == 1) {
				System.out.println();
			} System.out.printf("%4d", i);
		}
	}
}
