
//부모클래스
class Cars{
	int speed;

	public Cars() {
		// 부모 생성자 호출
		super();
		// TODO Auto-generated constructor stub
		System.out.println("parent default constructor");
	}
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
		
	}

}
