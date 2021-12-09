package method;

//���� �ִ� �� ���� ����
// Ŭ�������� ù ���ڸ� �빮�ڷ� �ϴ°� ����
class Person {
	//������� �ʵ� �Ӽ�
	
	String name;
	String phone;
	String address;
	int age;
	
	// ������ - method�� �����ε� ��ü ���鶧 �ڵ����� ȣ��
	// �� method�� �̸��� �������ִ�. Ŭ������� �����ؾ� ��
	// �����ڴ� ���ٱ����� .public�̾�� �Ѵ�
	// ���������� ������ �� ���� �ȳ��� �⺻���� �־��ְų� ��Ÿ ����� �غ��۾��� �� �� �ִ�
	// ��ȯ���� ������
	// �����ڸ� ������ ������ �ý����� ������ ȣ���Ѵ�. �� �ϴ��� ����
	// �����ڴ� ������ ����� �ִ�.
	// �ڹٰ� overloading �̶�� �ؼ� �Լ��� �̸��� ���� ���°� �ٸ� �Լ��� ���� �� �ֵ��� �Ǿ��־� ����� �ٸ��� ������ ���� ��
	
	Person() {  // new Person()
		name = "";
		phone = "";
		address = "";
		age = 20;
		System.out.println("�����ڰ� ȣ��Ǿ���");
	}
	
	public Person(String name, int age, String phone, String address) {
		
		//�Ű����� name�� Ŭ�������� name ������ �ȵ�
		//this = ������, ����, ������ �׳� �ᵵ this ������ �ִ°ɷ� �ȴ�
//		name = n;
//		age = ag;
//		phone = p;
//		address = a;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
		System.out.println("�Ű������� �ִ� �����ڰ� ȣ��Ǿ���");
	}
	
	//�Լ��� �����
	void setPerson(String n, String p, String a) {
		name = n;
		phone = p ;
		address = a;
	}
	
	void output() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(phone);
		System.out.println(address);
	}
}

