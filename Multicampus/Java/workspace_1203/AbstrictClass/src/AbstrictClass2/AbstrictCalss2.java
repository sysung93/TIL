package AbstrictClass2;

//자바는 하나의 클래스만 상속받을 수 있다. 다중상속 불가. 추상클래스도 동일
//추상클래스에서 인터페이스가 나온다.
public class AbstrictCalss2 {
	public static void main(String[] args) {
		
		Shape shape1 = new Rectangle(7, 8);
		shape1.setLength();
		shape1.setLength();
		 
		System.out.println(shape1.getSurface());
		System.out.println(shape1.getLength());
		
		Shape shape2 = new Circle(5);
		shape2.setLength();
		shape2.setSurface();
		
		System.out.println(shape2.getSurface());
		System.out.println(shape2.getLength());
		
		Shape shape3 = new Triangle(4, 5);
		shape3.setLength();
		shape3.setSurface();
		
		System.out.println(shape3.getLength());
		System.out.println(shape3.getSurface());
		
		
	}

}
