import java.util.Scanner;

public class exam04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * int a, b;
		 * 
		 * System.out.print("���� : "); a = sc.nextInt();
		 * 
		 * System.out.print("���� : "); b = sc.nextInt();
		 * 
		 * System.out.println("���� : " + a*b);
		 */
		
		int width, height, surface;
		
		System.out.println("���� : ");
		width = sc.nextInt();
		System.out.println("���� : ");
		height = sc.nextInt();
		
		surface = width * height;
		System.out.println("���� : " + surface);
	}

}