class Singleton {
	//1. private�� ������ ����� ��ü���� ����
	private Singleton() {}
	
	//��ü ������ ������ ����
	private static Singleton inst = null;
	
	//��ü ������ ��ȯ�� static �޼���
	public static Singleton getInstance() {
		if(inst == null) {
			inst = new Singleton();
		} return inst;
	}
	int x; // �����ڿ�
	
}
public class SingletonMain {
	public static void main(String[] args) {
		// ������
		// Singleton s = new Singleton();
		Singleton s = Singleton.getInstance();
		s.x = 10;
		Singleton s2 = Singleton.getInstance();
		System.out.println(s2.x);
	}

}
