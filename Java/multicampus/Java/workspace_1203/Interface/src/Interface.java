import javax.sound.midi.Soundbank;

//�߻� Ŭ���� �߿��� �߻� �ش�ȭ ��Ų�� �������̽��̴�.
//�������̽��� �ν��Ͻ� ������ �޼��带 ��������
//����� �߻� �޼���θ� �����Ǿ��ִ�
//
//�������̽��� ����� public ������ �߻�޼���θ� �����ȴ�.
//�����������ӿ�ũ�� �������̽��� ����Ǿ��ִ�.
//
//�������̽��� Ű�����
//interface shape{
//	void setsSurface();
//	void setLength();
//}
//
//�������̽��� �������� ��ӹ��� �� �ִ�.
//����� extends�� �ƴ϶� implements�� �޴´�
//�����Ѵ�

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
