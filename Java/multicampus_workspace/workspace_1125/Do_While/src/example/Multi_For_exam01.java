package example;

public class Multi_For_exam01 {
	public static void main(String[] args) {
		int k = 1;
		for(int i = 1; i <= 10; i++) {
			for(int j = 1; j <= 10; j++) {
				System.out.printf("%4d", k);
				k++;
			}
			System.out.println();
		}
	}

}
