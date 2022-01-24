package Random_Test;
import java.util.Random;

public class RandomTest {
	public static void main(String[] args) {
		Random rand = new Random();
		int i;
		for(i = 1; i <= 20; i++) {
			System.out.println(rand.nextInt(3)); // 0,1,2 중 하나가 랜덤으로 출력
		}
	}

}
