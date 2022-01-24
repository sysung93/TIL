package method_Test2;

class MyMethod {
	//메소드만들기 연습
	int add(int x, int y) {
		return x+y;
	}
	
	//void는 println 함수에서 호출 불가능함
	void sub(int x, int y) {
		System.out.println(x-y);
	}
	
	void displaygugu(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
	int sigma(int limit) {
		int i, sum = 0; //함수안에 변수를 만들면 함수안에만 존재한다.
		for(i = 1; i <= limit; i++) {
			sum += i;
		}
		return sum;
	}
}

public class methodTest2 {
	public static void main(String[] args) {
		MyMethod mm = new MyMethod();
		
		System.out.println(mm.add(1, 5));
		
//		void 출력할 수 없음
//		System.out.println(mm.sub(1, 5));
		
		mm.sub(1, 5);
		mm.displaygugu(4);
		System.out.println(mm.sigma(10));
	}

}
