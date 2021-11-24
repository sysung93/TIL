import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * int a, b;
		 * 
		 * System.out.print("가로 : "); a = sc.nextInt();
		 * 
		 * System.out.print("세로 : "); b = sc.nextInt();
		 * 
		 * System.out.println("면적 : " + a*b);
		 */
		
		int width, height, surface;
		
		System.out.println("가로 : ");
		width = sc.nextInt();
		System.out.println("세로 : ");
		height = sc.nextInt();
		
		surface = width * height;
		System.out.println("면적 : " + surface);
	}

}
