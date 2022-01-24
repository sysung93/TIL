import java.util.Random;

class Lotto {
	int count = 0;
	int[] nums = new int[6];
	
	//중복값 확인 함수 있으면 true
	boolean isDuplicate(int temp) {
		for(int i = 0; i < count; i++) {
			if(temp == nums[i]) {
				return true;
			}
		}
		return false;
	}
	
	public void createLotto() {
		Random rand = new Random();
		int count = 0;
		
		while(count < 6) {
			int temp = rand.nextInt(60) + 3;
			if(! isDuplicate(temp)) {
				nums[count] = temp;
				count++;
			}
		}
	}
	
	void display() {
		for(int n : nums) {
			System.out.print(n + " ");
		}
	}
}


public class LottoGameMain {
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		lotto.createLotto();
		lotto.display();
	}

}
