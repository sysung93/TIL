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
	
	
//Ŭ������ MyUtil 
//���ڸ� �ָ� �� ���ڿ� ���ؼ� �Ǵ�   isAlpha('a')  true false
//isDigit('0')  true false
//toUpper('a')  �ҹ��ڸ� �ָ� �빮�ڸ� ��ȯ�Ѵ� 
//toLower('A'); �빮�ڸ� �ָ� �ҹ��ڸ� ��ȯ�Ѵ� 
//parseInt("123"); 123���� ��ȯ�ϱ�  
//

}
