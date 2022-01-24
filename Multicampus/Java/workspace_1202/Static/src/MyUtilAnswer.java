
public class MyUtilAnswer {
	
	//객체럴 못만들게 하고싶으면 생성자를 private로 만들면 객체 생성안됨
	//객체생성 못하게 하려고 생성자를 만들었음
	private MyUtilAnswer() {}
	
	public static boolean isAlpha(char c) {
		if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z') {
			return true;
		}
		return false;
	}
	
	public static boolean isDigit(char c) {
		if(c >= '0' && c <= '9') {
			return true;
		}
		return false;
	}
	
	public static char toUpper(char c) {
		if(c >= 'a' && c <= 'z') {
			return (char)(c-32);
			//retrun(char)(c - ('a' - 'A'))
		}
		return c;
	}
	
	public static char toLower(char c) {
		if(c >= 'A' && c <= 'Z') {
			return (char)(c+32);
			//retrun(char)(c + ('a' - 'A'))
		}
		return c;
	}
	
	public static int parseInt(String s) {
		int sum = 0;
//		"123" > 123
//		'1' - '0' = 49 - 48 = 1
//		sum = sum * 10 + s.charAt(0) - '0';
//		sum = sum * 10 + s.charAt(1) - '0';
//		sum = sum * 10 + s.charAt(2) - '0';
//		
		for(int i = 0; i < s.length(); i++) {
			if(!isDigit(s.charAt(i))) {
				return-1;
			}
		}
		
		for(int i = 0; i < s.length(); i++) {
			sum = sum * 10 + s.charAt(i) - '0';
		}
		return sum;
	}
	
}
