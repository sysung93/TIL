package Example;

class plus {
	int sum = 0;
	
	int plus (int num) {
		for(int i = 1; i <= num; i++) {
			sum += i;
		}
		return sum;
	}
}

public class PlusTest {
	public static void main(String[] args) {
		plus pt = new plus();
		System.out.println(pt.plus(10));
		
	}

}
