
class Counter {
	// �ν��Ͻ� ����, ��ü�� ���� �� �޸𸮰� Ȯ��(��)
	int x = 0; 
	
	// ��������, Ŭ���� ������ �� �޸� Ȯ��(��������), �����޸𸮷� ���
	// �����ڿ��� ���� �ʱ�ȭ �ϸ� �ȵȴ�
	static int count = 0; 
	
	//static �޼���� static�� ���� ���� ������ �Լ��� ��� �� �� ����.
	//�ν��Ͻ� ����, �Լ� ��� �Ұ�
	//this�����ڸ� ����� �� ����. this�� ��ü�� ������ ��� �����ϴ�.
	//this�Լ��� ��ü�� �ּҰ� ���� �Լ�
	//this�����ڸ� ����� �� ����. this�� ��ü�� ������ ��� �����ϴ�
	
	public static void displayCount() {
		//���ȵ�
		//System.out.println(x);
		//System.out.println(this.count);
		
		System.out.println("���� ī��Ʈ : " + count);
	}
}

public class StaticMember {
	public static void main(String[] args) {
		Counter c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		c1 = new Counter();
		c1.x++;
		c1.count++;
		
		System.out.println(c1.x);
		//System.out.println(c1.count); // ��ü�� �����ϴ� ���
		System.out.println(Counter.count); 
	}

}
