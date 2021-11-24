
public class CastingTest2 {

	public static void main(String[] args) {
		
		String s1 = "12";
		String s2 = "34";
		
		String result;
		
		/*result = s1 + s2;*/
		result = Integer.parseInt(s1) + Integer.parseInt(s2) + "";
		System.out.println(result);
		
		System.out.println(String.valueOf(123));
		System.out.println(String.valueOf(3.5));
		System.out.println(String.valueOf('a'));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(3.5f));

	}

}
