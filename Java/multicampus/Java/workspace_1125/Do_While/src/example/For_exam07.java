package example;

public class For_exam07 {
	public static void main(String[] args) {
		//섭씨온도를 화씨온도로 환산하는 표를 출력하시오
		//(0~100도까지)
		//화씨 = 섭씨 * 1.8 + 32
		
		int i;
		
		for(i = 0; i <= 100; i++) {
			System.out.printf("%d ====> %.2f\n", i, (i*1.8)+32);
		}
	}
}
