
public class MyUtilAnswer {
	
	//��ü�� ������� �ϰ������ �����ڸ� private�� ����� ��ü �����ȵ�
	//��ü���� ���ϰ� �Ϸ��� �����ڸ� �������
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
