package AbstrictClass2;

//�ڹٴ� �ϳ��� Ŭ������ ��ӹ��� �� �ִ�. ���߻�� �Ұ�. �߻�Ŭ������ ����
//�߻�Ŭ�������� �������̽��� ���´�.
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
