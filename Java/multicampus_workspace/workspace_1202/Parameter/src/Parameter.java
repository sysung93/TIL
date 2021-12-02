
//parameter, 인수, argument
//a메서드에 값을 전달할 목적으로 사용한다.
//값변수를 전달할때와 참조변수 전달시 다른 상황이 벌어진다

class MyType {
	int x;
	int y;
	
	//기본생성자
	//객체 생성시 
	public MyType() {
		this.x = 0;
		this.y = 0;
	}
	
	public MyType(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Parameter {
	
	//파라미터가 값타입이다.
	void display(int x, int y) {
		// display.x = main.x
		// display.y = main.y
	
		System.out.printf("x = %d y = %d \n", x, y);
	}
	void add(int x, int y) {
		//함수에서의 인수는 값복사해 오는 거지 보내지는 않는다.
		x = y * 2;
		y = y * 2;
		
		//return 명령어는 값을 안보내거나 하나만 보낼 수 있음
	}
	
	void add2(Integer x, Integer y) {
		x = x * 2;
		y = y * 2;
		
	}
	public void add(MyType m) {
		m.x *= 2;
		m.y *= 2;
	}
	
	public static void main(String[] args) {
		int x = 10, y =20; //main 이라는 함수에 있는 지역변수
		Parameter obj = new Parameter();
		obj.add(x, y);
		obj.display(x, y); // x, y 변수의 값을 전달
		
		obj.add2(x, y);
		obj.display(x, y);
		
		//참조
		MyType m1 = new MyType(10, 20);
		obj.add(m1);
		System.out.println(m1.x + "  " + m1.y);
		
		MyType m2 = new MyType();
		
	}

}
