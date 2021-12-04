import java.util.ArrayList;

//�θ�Ŭ����
class Cars{
	int speed;
	
	//�����ڴ� Ŭ���� ������ �������� �ʱ�ȭ�ϱ� ���� �����
	//����ڰ� Ŭ������ ���Ǹ� �ϰ� �����ڸ� �ȸ���� �ý����� �⺻�����ڸ�
	//���� ȣ���Ѵ�(��� Ŭ������ �����ڰ� �ݵ� ���ִ�)
	public Cars() {
		// �θ� ������ ȣ�� -�θ� Object�� ObjectŬ������ ������ ȣ��
		super();
		// TODO Auto-generated constructor stub
		System.out.println("parent default constructor");
	}
	//�θ� Ŭ������ �����ڸ� ȣ���ϴ� ���� �θ�Ŭ���� �����ڰ� ��������
	//�ϴ��ϵ� ���Ƽ� �� �߿��� �����ؼ� ȣ���ϰ��� �Ҷ�
	//�ݵ�� �޼ҵ��� ù��° �ٿ� �;��Ѵ�
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
	//equals �Լ��� Object Ŭ������ ������ �Լ��̴�
	//��ü �ΰ��� ���� ���Ҷ� equals �Լ��� ����Ѵ�
	//Object o1 = new Object();
	//Object o2 = new Object();
	//if(o1.equals.o2)
	
	//Car c1 = new Car(110);
	//Car c2 = new Car(130);
	//c1.equals(c2)
	
	@Override
	public boolean equals(Object obj) {
		// Car > objec(��ĳ����)
		Car temp = (Cars)obj; // object > Cars(�ٿ�ĳ����) ���������� ���
		return this.speed == temp.speed;
	}
}

class SportsCar extends Cars {
	
	boolean turbo;
	//��� �����ڴ� Ư���� �� ������ �θ��� �⺻������(�Ű����� ���� ��)�� ȣ���Ѵ�.
	//�ڽ� �����ڿ��� �θ�����ڸ� ȣ���Ѵ�
	public SportsCar() {
		// super(); ȣ������ �ʾƵ� �ý����� ȣ����. �ݵ�� �Լ����� ù��°���ο� �;��Ѵ�
		this.turbo = true;
		System.out.println("child default constructor");
	}
	
	public SportsCar(int speed, boolean turbo) {
		super(200); // �θ� �����ڸ� ��� ȣ��
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
		
		//�θ�ü�� ������ �ڽİ�ü�� ������ �� �ִ�.
		
		c1 = sc1; 
		// Car -> SportsCar ��ü�� ������(�ڽ��� �θ��� ���·� ��ȯ. ��ĳ����(upcasting)) - �׻� ���
		// �ڽ�Ŭ�������� �߰��� ������ �� ����
		
		//�ٿ�ĳ����
		// �ڽ� ��ü ������ �θ� ��ü ������ ��Ģ������ �ȵȴ�.
		//sc1 ���忡���� turbo������ ������ �˾Ҵµ� Cars ��ü�� turbo ������ ����.
		
		//sc1 = new Cars();
		sc1 = (SportsCar)c1;
		
		//���� SportsCar > Cars > SportsCar �� ����� ����Ѵ�.
		
		//upcasting(�ڽ�Ÿ���� �θ�Ÿ������ ��ȯ) ������ ���
		//downcasting(�θ�Ÿ���� �ڽ�Ÿ������ ��ȯ) ���������� ���. ��������ȯ�� �ʿ�
		
		//���׸� ������
		//add �Լ� �ȿ����� Cars ��ü�� Object Ÿ������ ��ȯ�Ǿ ���ư���. ��ĳ���û�Ȳ
		
		
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
