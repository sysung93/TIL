import java.util.Scanner;

public class exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		int i = 1;
			
		while(i <= 10) {
			int num = sc.nextInt();
			sum = sum + num;
			i++;
		} System.out.println(sum);
				
	}

}
