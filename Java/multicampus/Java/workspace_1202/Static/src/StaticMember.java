
class Counter {
	// 인스턴스 변수, 객체를 만들 때 메모리가 확보(힙)
	int x = 0; 
	
	// 정적변수, 클래스 정의할 때 메모리 확보(정적공간), 공유메모리로 사용
	// 생성자에서 값을 초기화 하면 안된다
	static int count = 0; 
	
	//static 메서드는 static이 붙지 않은 변수나 함수는 사용 할 수 없다.
	//인스턴스 변수, 함수 사용 불가
	//this참조자를 사용할 수 없다. this는 객체를 만들어야 사용 가능하다.
	//this함수는 객체의 주소가 들어가는 함수
	//this참조자를 사용할 수 없다. this는 객체를 만들어야 사용 가능하다
	
	public static void displayCount() {
		//사용안됨
		//System.out.println(x);
		//System.out.println(this.count);
		
		System.out.println("현재 카운트 : " + count);
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		System.out.println(c1.x);
		//System.out.println(c1.count); // 객체로 접근하는 방식
		System.out.println(Counter.count); 
	}

}
