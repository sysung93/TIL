
public class Chartest {
	public static void main(String[] args) {
		char c;
		c = 'A';
		System.out.println(c);
		
		String word = "단어";
		System.out.println(word);
		
		System.out.println("문장을\n나누자"); //줄바꿈
		System.out.println("문장을\t나누자"); //탭
		System.out.println("문장을\b나누자"); //앞으로 한칸
		System.out.println("문장을\r\n나누자"); //줄바꿈후 첫글짜
		System.out.println("문장을\\나누자");
		System.out.println("\'문장을\'나누자");
		
		//강제형전환 강제로 char - int로 전환
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'0');
		System.out.println((int)'1');
		
		c = '\u0041';
		System.out.println(c);
		
		boolean b;
		b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);
		
		b = 1 > 2; //비교-관계식 true 또는 false
		System.out.println(b);
		
	}
	

}
