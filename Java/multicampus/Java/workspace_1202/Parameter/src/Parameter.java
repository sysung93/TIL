
//parameter, �μ�, argument
//a�޼��忡 ���� ������ �������� ����Ѵ�.
//�������� �����Ҷ��� �������� ���޽� �ٸ� ��Ȳ�� ��������

class MyType {
	int x;
	int y;
	
	//�⺻������
	//��ü ������ 
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
	
	//�Ķ���Ͱ� ��Ÿ���̴�.
	void display(int x, int y) {
		// display.x = main.x
		// display.y = main.y
	
		System.out.printf("x = %d y = %d \n", x, y);
	}
	void add(int x, int y) {
		//�Լ������� �μ��� �������� ���� ���� �������� �ʴ´�.
		x = y * 2;
		y = y * 2;
		
		//return ��ɾ�� ���� �Ⱥ����ų� �ϳ��� ���� �� ����
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
		int x = 10, y =20; //main �̶�� �Լ��� �ִ� ��������
		Parameter obj = new Parameter();
		obj.add(x, y);
		obj.display(x, y); // x, y ������ ���� ����
		
		obj.add2(x, y);
		obj.display(x, y);
		
		//����
		MyType m1 = new MyType(10, 20);
		obj.add(m1);
		System.out.println(m1.x + "  " + m1.y);
		
		MyType m2 = new MyType();
		
	}

}
