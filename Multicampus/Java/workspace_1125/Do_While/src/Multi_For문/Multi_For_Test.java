package Multi_For¹®;

public class Multi_For_Test {
	public static void main(String[] args) {
		int i, j;
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <=5; j++) {
				System.out.printf("i = %d j %d\n", i, j);
			}
		}
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <=5; j++) {
				System.out.printf("*");
			}System.out.println();
		}
	}
}