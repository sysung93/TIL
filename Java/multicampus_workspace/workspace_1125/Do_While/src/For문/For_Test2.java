package For문;

public class For_Test2 {
	public static void main(String[] args) {
		//홀수 출력
		System.out.println("1 3 5 7 9 .....");
		for(int i = 1; i < 20; i += 2) {
			System.out.print(i + " ");
		} System.out.println(); //커서를 다음줄로 내리기 위해
		
		//짝수입력
		System.out.println("2 4 6 8 10 .....");
		for(int i = 1; i < 21; i += 2) {
			System.out.print(i + " ");
		} System.out.println();
		
		// 거꾸로
		System.out.println("10 9 8 7 6 5 ...");
		for(int i = 10; i > 0; i -= 1) {
			System.out.print(i + " ");
		} System.out.println();
	}

}
