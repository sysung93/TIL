import java.util.Scanner;

public class SwitchTest {

	public static void main(String[] args) {
		int sel;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1~5까지 중에 선택하세요");
		sel = sc.nextInt();
		
		switch(sel) //수식 또는 변수 그 수행 결과가 정수의 형태이면 가능하다. int, short, long, byte, char
		// 자바 7부터 case "일,이,삼.... " 문자열도 됨
		{
			case 1 : System.out.println("스타벅스 머그잔 당첨");
				break;
			case 2 : System.out.println("스타벅스 텀블러 당첨");
				break;
			case 3 : System.out.println("투썸 딸기케이크 당첨");
				break;
			case 4 : System.out.println("이디야 커피믹스 세트 당첨");
				break;
			case 5 : System.out.println("맥심 화이트 골드믹스 당첨");
				break;
			default : System.out.println("꽝");
		
		}

	}

}
