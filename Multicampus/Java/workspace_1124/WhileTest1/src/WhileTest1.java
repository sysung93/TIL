
public class WhileTest1 {
	public static void main(String[] args) {
		int i;
		/*
		 * 변수에 초기값을 할당한다
		 * while(조건식) {
		 * 처리코드
		 * 마지막에 조건식의 결과를 거짓으로 만들 수 있는 수식이 따라야 한다}
		 * 조건식의 결과를 거짓으로 만들 수식이 없으면 while문이 종료하지 않는다
		 * 이걸 무한루프라고 한다
		 */
		
		System.out.println("1~5까지 출력하기");
		
		i = 1; //변수초기화
		while( i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("0, 2,4,6,8,10 출력하기");
		
		int e = 0;
		while(e <= 10) {
			System.out.println(e);
			e += 2;
		}
				
		
	}

}
