package method;

//클래스안의 메서드들은 객체를 안만들어 실체가 없어서 호출이 안됨

public class MethodTest1 {
	//displayLine 이라는 함수
	public void displayLine() {
		System.out.println("========================");		
	}
	
	//매개변수를 활용한 함수에 기능 추가
	
	public void displayLine2(int line) {
		for(int i = 0; i <= 3; i++) {
			System.out.println("-----------------------");
		}
	}
	
	//라인 숫자, 개수, 문자 지정
	// 매개변수 = 매개체가 되는 변수들
	// 함수 외부로부터 함수에 값을 전달할 목적으로 사용하는 변수
	//displayLine3(3, 10, '*')
	public void displayLine3(int line, int cnt, char mark) {
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= cnt; j++) {
				System.out.print(mark);	
			} System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		//객체만들기
		MethodTest1 t1 = new MethodTest1();
				
		//객체를 통한 함수의 호출
		t1.displayLine();
		t1.displayLine2(3);
		t1.displayLine3(3, 10, '*');
		t1.displayLine3(4, 5, '$');
	}
}
