
//�θ�Ŭ����
class Cars{
	int speed;

	public Cars() {
		// �θ� ������ ȣ��
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
