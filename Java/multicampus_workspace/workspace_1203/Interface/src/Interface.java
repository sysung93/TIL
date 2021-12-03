import javax.sound.midi.Soundbank;

//추상 클래스 중에서 추상만 극대화 시킨게 인터페이스이다.
//인터페이스는 인스턴스 변수나 메서드를 못가진다
//상수랑 추상 메서드로만 구성되어있다
//
//인터페이스는 상수와 public 권한의 추상메서드로만 구성된다.
//스프링프레임워크가 인터페이스로 구축되어있다.
//
//인터페이스는 키워드로
//interface shape{
//	void setsSurface();
//	void setLength();
//}
//
//인터페이스는 여러개를 상속받을 수 있다.
//상속을 extends가 아니라 implements로 받는다
//구현한다

interface Calc {
	int add();
	int sub();
	int mul();
	int div();
}

class CalcImpl implements Calc{
	int x, y;
	
	public CalcImpl(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int add() {
		return x + y;
	}

	@Override
	public int sub() {
		return x - y;
	}

	@Override
	public int mul() {
		return x * y;
	}

	@Override
	public int div() {
		return x / y ;
	}
	
}
public class Interface {
	public static void main(String[] args) {
		Calc data = new CalcImpl(7, 9);
		System.out.println(data.add());
		System.out.println(data.sub());
		System.out.println(data.mul());
		System.out.println(data.div());
	}

}
