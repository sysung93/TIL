import java.util.Scanner;

public class exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("번호를 선택하세요");
		System.out.println("1. 원의 면적");
		System.out.println("2. 삼각형의 면적");
		System.out.println("3. 사각형의 면적");
		
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("원의 면적을 구합니다");
			System.out.println("원의 반지름을 입력하세요");
			int radius = sc.nextInt();
			double round_area = radius * radius * Math.PI;
			System.out.println("원의 면적 : " + round_area);
			break;
		case 2:
			System.out.println("삼각형 면적을 구합니다");
			System.out.print("삼각형의 밑변을 입력하세요");
			int base = sc.nextInt();
			System.out.print("삼각형의 높이를 입력하세요");
			int altitude = sc.nextInt();
			double triangle_area = (base * altitude) / 2;
			System.out.println("삼각형의 넓이 : " + triangle_area);
			break;
		case 3:
			System.out.println("사각형 면적을 구합니다");
			System.out.print("사각형의 가로길이를 입력하세요");
			int width = sc.nextInt();
			System.out.print("사각형의 세로길이를 입력하세요");
			int height = sc.nextInt();
			double square_area = (width * height);
			System.out.println("사각형의 넓이 : " + square_area + "m2");
			break;
		default : System.out.println("없는 메뉴입니다.");
		}
		sc.close();
	}

}
