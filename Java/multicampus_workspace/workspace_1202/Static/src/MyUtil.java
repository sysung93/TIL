import java.util.Scanner;

public class MyUtil {
	static String str;
	static char str2;
	static boolean num;
	static int answer;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		str = sc.nextLine();
		if(str.length() > 1) {
			num = true;
			for(int i = 0; i < str.length(); i++) {
				if(!Character.isDigit(str.charAt(i))){
					num = false;
					break;
				}
			}
			if(num) {
				answer = Integer.parseInt(str);
			}
		}else{
			str2 = str.charAt(0);
			if(Character.isDigit(str2)) {
				System.out.println(true);
			}
		}
	}
	
	
//클래스명 MyUtil 
//문자를 주면 그 문자에 대해서 판단   isAlpha('a')  true false
//isDigit('0')  true false
//toUpper('a')  소문자를 주면 대문자를 반환한다 
//toLower('A'); 대문자를 주면 소문자를 반환한다 
//parseInt("123"); 123으로 반환하기  
//

}
