import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		final float PI = 3.141592f; 
		//final을 붙이면 상수, 값을 변경할 수 없다.
		//프로그램 수행 도중 값을 못바꾼다
		float radius;
		float surface;
		
		Scanner sc = new Scanner(System.in);
		//참조형변수 - 사용이 끝나면 끝났다고 알려줘야함
		System.out.println("반지름 : ");
		radius = sc.nextInt();
		
		surface = radius * radius * PI;
			
		System.out.println(surface);
		
		sc.close(); //
	
}
}
