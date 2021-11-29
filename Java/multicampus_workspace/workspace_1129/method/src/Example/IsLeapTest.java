package Example;

class IsLeap {
	boolean IsLeap(int year) {
		if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}
}
public class IsLeapTest {
	public static void main(String[] args) {
		IsLeap il = new IsLeap();
		int cnt = 0;
		for(int i = 1; i <= 2021; i++) {
			if(il.IsLeap(i)) {
				cnt++; } 
			}
		System.out.println(cnt);
	}
}
			
			
