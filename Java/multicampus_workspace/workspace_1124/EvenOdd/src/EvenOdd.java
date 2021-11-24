import java.util.Scanner;

public class EvenOdd {
	public static void main(String[] args) {
		int number; //입력값
		//System.in > 키보드에서 값을 받아서 scanner 클래스가 처리
		Scanner sc = new Scanner(System.in);
		//키보드를 누르면 '0', 'A', '6', ----- unicode
		System.out.print("정수 : ");
		
		number = sc.nextInt();; // '0' > 0  '9' > 9
		
		//짝수 -2ㅇ나누어서 나머지가 0일 때
		if(number%2 == 0) { //실행결과가 true 또는 false라고 말할 수 있는 수식(조건식)
			System.out.println("짝수입니다.");
		} else {
			System.out.println("홀수입니다.");
		}
	}

}
