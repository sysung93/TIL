package method;

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
		
		//�迭 - ����, ��ü - ����
		//��ü�迭 -������ ����
		
		//��ü 3�� ���� �迭�� �ۼ�
		Person[] persons = new Person[3];
		//��ü����
		persons[0] = new Person();
		
		System.out.println(persons[0].name);
		System.out.println(persons[0].phone);
		System.out.println(persons[0].address);
		
		persons[1] = new Person();
		persons[1].setPerson("�ڻ���", "010-9999-9999", "���ı�");
		persons[1].output();
		
		//Ŭ������ ���� ����� ������ ������ �Ѵ�
		persons[2] = new Person();
		persons[2].output();
		
		p1 = new Person("ȫ�浿", 23, "010-2222-3333", "����");
		p1.output();
	}
}

