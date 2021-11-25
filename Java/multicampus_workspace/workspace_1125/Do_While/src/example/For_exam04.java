package example;

public class For_exam04 {

	public static void main(String[] args) {
		// for문을 사용해서 알파벳 대소문자 따로 출력해보기
		
		for(int i = 65; i <=90; i++) {
			System.out.print((char)i);
		} System.out.println();
		
		for(int i = 'A'; i <= 'Z'; i++) {
			System.out.print((char)i + " ");
		} System.out.println();
		
		for(int i = 'a'; i <= 'z'; i++) {
			System.out.print((char)i + " ");
		} System.out.println();
		
		// 'A' > 65
		// "A" ? 'A' + '\0'
	}

}
