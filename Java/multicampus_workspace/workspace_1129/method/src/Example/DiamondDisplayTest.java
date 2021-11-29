package Example;

class DiamondDisplay{
	void DiamondDisplay(int line) {
		if(line % 2 == 0) {
			line = line +1;
		} line = line / 2 + 1;
		
		int i, j;
		for(i = 1; i <= line; i++) {
			for(j = 1; j <= line - i; j++) {
				System.out.print(" ");
			}for(j = 1; j <= 2 * i - 1; j++) {
				System.out.print("*");
			}System.out.println();
		}
		
		for(i = 1; i <= line-1; i++) {
			for(j = 1; j <= i; j++) {
				System.out.print(" ");
			}for(j = 1; j <= 2 * (line-i) - 1; j++) {
				System.out.print("*");
			}System.out.println();
		}	
	}
}	

public class DiamondDisplayTest {

	public static void main(String[] args) {
		DiamondDisplay dd = new DiamondDisplay();
		dd.DiamondDisplay(9);
		
		dd.DiamondDisplay(12);
	}

}
