import java.util.ArrayList;

//부모클래스
class Cars{
	int speed;
	
	//생성자는 클래스 내부의 변수들을 초기화하기 위해 만든다
	//사용자가 클래스를 정의만 하고 생성자를 안만들면 시스템이 기본생성자를
	//만들어서 호출한다(모든 클래스는 생성자가 반듯 ㅣ있다)
	public Cars() {
		// 부모 생성자 호출 -부모가 Object라 Object클래스의 생성자 호출
		super();
		// TODO Auto-generated constructor stub
		System.out.println("parent default constructor");
	}
	//부모 클래스의 생성자를 호출하는 경우는 부모클래스 생성자가 여러개고
	//하는일도 많아서 그 중에서 선택해서 호출하고자 할때
	//반드시 메소드의 첫번째 줄에 와야한다
	public Cars(int speed) {
		this.speed = speed;
		System.out.println("parant parameter constructor");
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int spped) {
		this.speed = spped;
	}
	//equals 함수는 Object 클래스가 정의한 함수이다
	//객체 두개의 값을 비교할때 equals 함수를 사용한다
	//Object o1 = new Object();
	//Object o2 = new Object();
	//if(o1.equals.o2)
	
	//Car c1 = new Car(110);
	//Car c2 = new Car(130);
	//c1.equals(c2)
	
	@Override
	public boolean equals(Object obj) {
		// Car > objec(업캐스팅)
		Car temp = (Cars)obj; // object > Cars(다운캐스팅) 예외적으로 허용
		return this.speed == temp.speed;
	}
}

class SportsCar extends Cars {
	
	boolean turbo;
	//모든 생성자는 특별히 말 없으면 부모의 기본생성자(매개변수 없는 것)를 호출한다.
	//자식 생성자에서 부모생성자를 호출한다
	public SportsCar() {
		// super(); 호출하지 않아도 시스템이 호출함. 반드시 함수에서 첫번째라인에 와야한다
		this.turbo = true;
		System.out.println("child default constructor");
	}
	
	public SportsCar(int speed, boolean turbo) {
		super(200); // 부모 생성자를 골라서 호출
		this.speed = speed;
		this.turbo = turbo;
		System.out.println("child parpameter constructor");
	}

	public boolean isTurbo() {
		return turbo;
	}

	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	
}

public class Ingeritance {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Cars c1 = new Cars();
		c1.setSpeed(100);
		System.out.println(c1.getSpeed());
		
		SportsCar sc1 = new SportsCar();
		sc1.setSpeed(140);
		
		System.out.println(sc1.getSpeed());
		sc1.turbo = true;
		System.out.println(sc1.turbo);
		
		System.out.println("------------------------");
		SportsCar sc2 = new SportsCar(160, true);
		
		System.out.println("------------------------");
		
		//부모객체의 참조로 자식객체를 참조할 수 있다.
		
		c1 = sc1; 
		// Car -> SportsCar 객체를 저장함(자식이 부모의 형태로 전환. 업캐스팅(upcasting)) - 항상 허용
		// 자식클래스에서 추가한 내용은 못 본다
		
		//다운캐스팅
		// 자식 객체 참조로 부모 객체 참조는 원칙적으로 안된다.
		//sc1 입장에서는 turbo변수가 있을줄 알았는데 Cars 객체는 turbo 변수가 없다.
		
		//sc1 = new Cars();
		sc1 = (SportsCar)c1;
		
		//원래 SportsCar > Cars > SportsCar 는 허용해 줘야한다.
		
		//upcasting(자식타입이 부모타입으로 변환) 언제나 허용
		//downcasting(부모타입이 자식타입으로 변환) 예외적으로 허용. 강제형전환이 필요
		
		//제네릭 이전에
		//add 함수 안에서는 Cars 객체가 Object 타입으로 전환되어서 돌아간다. 업캐스팅상황
		
		
		ArrayList list = new ArrayList();
		list.add(new Cars(100));
		list.add(new Cars(110));
		list.add(new Cars(120));
		list.add(new Cars(130));
		list.add(new Cars(140));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getClass());
//			Cars temp = (Cars)list.get(i)
//			System.out.println(temp.getSpeed());
		}
		
		
	}

}
