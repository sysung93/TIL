
public class CommonClass {
	public static void main(String[] args) {
		
		
		System.out.println(MyUtilAnswer.isAlpha('a'));
		System.out.println(MyUtilAnswer.isAlpha('&'));
		
		System.out.println(MyUtilAnswer.isDigit('8'));
		System.out.println(MyUtilAnswer.isDigit('a'));
		
		System.out.println(MyUtilAnswer.toUpper('v'));
		System.out.println(MyUtilAnswer.toUpper('$'));
		
		System.out.println(MyUtilAnswer.toLower('A'));
		System.out.println(MyUtilAnswer.toLower('$'));
		
//		MyUtilAnswer util = new MyUtilAnwer();
//		System.out.println(util.toLower('$'));
		
		System.out.println( '1' - '0');
		System.out.println( '2' - '0');
		System.out.println( '3' - '0');
		
		System.out.println(MyUtilAnswer.parseInt("1234") + MyUtilAnswer.parseInt("432"));
	}

}
