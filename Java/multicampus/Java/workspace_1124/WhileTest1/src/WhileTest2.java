import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		//이름 10번 출력하기
		/*
		 * int i = 0; while(i < 10) { System.out.println("홍길동"); i++; }
		 */
		int i = 0;
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 : ");
		name = sc.next();
		
		while(i < 10) {
			System.out.println(name);
			i++;
		}
	}

}
