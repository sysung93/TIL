//���� �ִ� �� ���� ����
// Ŭ�������� ù ���ڸ� �빮�ڷ� �ϴ°� ����
class Person {
	//���� �ʵ� �Ӽ�
	String name;
	String phone;
	String address;
}

public class OOP1 {
	public static void main(String[] args) {
		//1. ��ü �����ϱ�
		//��ü �������� ����, null �Ǵ� new Ŭ������()���� �ʱ�ȭ ����
		Person p1;
		//heap ������ ��ü�� ����� ��ü�� �ּҸ� ����
		//���� ��ü�� ���� ������ ���� ��� null���� �ش�
		p1 = new Person();
		
		p1.name = "ȫ�浿";
		p1.phone = "010-0000-0000";
		p1.address = "���ʱ� ���ﵿ";
		
		System.out.println(p1.name);
		System.out.println(p1.phone);
		System.out.println(p1.address);
	}
}