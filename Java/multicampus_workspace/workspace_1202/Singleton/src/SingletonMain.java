class Singleton {
	//1. private로 생성자 만들어 객체생성 막기
	private Singleton() {}
	
	//객체 참조를 저장할 변수
	private static Singleton inst = null;
	
	//객체 참조를 반환할 static 메서드
	public static Singleton getInstance() {
		if(inst == null) {
			inst = new Singleton();
		} return inst;
	}
	int x; // 공유자원
	
}
public class SingletonMain {
	public static void main(String[] args) {
		// 오류남
		// Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		s.x = 10;
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.x);
	}

}
