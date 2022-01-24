import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

// �߻�Ŭ���� - �߻�޼��带 �ϳ� �̽� �����ִ� Ŭ�����̴�.
// �߻�޼���� �Լ��� ���������� ���� �޼����̴�
// �߻�Ŭ������ ��ü ������ ���Ѵ�
// �߻�Ŭ������ ��ӹ��� Ŭ������ �߻�Ŭ�����̴�.
// ��ӹ��� Ŭ������ �߻�޼��带 ������(overriding)����� �߻�Ŭ������ �ƴϰ� �ȴ�.
// �������: ��ӹ��� �ʿ��� �� �޼��带 �ݵ�� �������̵� �ϱ⸦ �ٶ���

//ArrayList Ŭ���� �ȿ� indexOf�Լ�, �����͸� ã���ش�.
//����ڰ� ���� Ŭ���� ���忡�� indexOf�� �Ἥ �����͸� ���Ϸ���
//equals�� �������̵� �ؾ��Ѵ�.
//Object Ŭ�������� equals�� �߻�޼���� ����ٸ�
//��� Ŭ�������� equals�� �������̵��ؾ��Ѵ�.

//comparable - �������̽�, �߻�Ŭ������ �ص��� �߻�ȭ��
@SuppressWarnings("rawtypes")
class Person implements Comparable{
	String name;
	String phone;
	String address;
	
	public Person(String name, String phone, String address) {		
		this.name = name;
		this.phone = phone;
		this.address = address;
	}

	@Override
	//����
	public int compareTo(Object o) {
		Person temp = (Person)o;
		//this.name ���������� temp.name���� �տ� ������ - ��
		//this.name ���������� temp.name���� �� ������ 0
		//this.name ���������� temp.name���� �ڿ� ������ + ��
		return this.name.compareTo(temp.name);
	}
	
	
}
public class AbstrictClass {
	public static void main(String[] args) {
		//linkedlist ���� ��Ŀ�������� �� �� �߰��� �߰������� Arraylist���� ������
		List<String> list = new LinkedList<String>();
		//List<String> list = new ArrayList<String>();
		list.add("������");
		list.add("���̽�");
		list.add("������");
		list.add("��������Ƽ��");
		list.add("����");
		list.add("�ڰ�ġ");
		list.add("Ȩ����");
		list.add("���ڱ�");
		list.add("�����");
		list.add("�������");
		
		list.sort(null);
		
		for(String s : list) {
			System.out.println(s);
		}
		
		List<Person> personList = new ArrayList<Person>();
		personList.add(new Person("ȫ�浿", "010-0000-0000", "��õ1��"));
		personList.add(new Person("�Ӳ���", "010-0000-0000", "��õ1��"));
		personList.add(new Person("����", "010-0000-0000", "��õ1��"));
		personList.add(new Person("������", "010-0000-0000", "��õ1��"));
		personList.add(new Person("�̼���", "010-0000-0000", "��õ1��"));
		personList.add(new Person("��������", "010-0000-0000", "��õ1��"));
		personList.add(new Person("����â", "010-0000-0000", "��õ1��"));
		personList.add(new Person("����", "010-0000-0000", "��õ1��"));
		personList.add(new Person("������", "010-0000-0000", "��õ1��"));
		personList.add(new Person("��ġ��", "010-0000-0000", "��õ1��"));
		personList.add(new Person("ȫ�浿", "010-0000-0000", "��õ1��"));
		
		personList.sort(null);
		
		for(Person s : personList) {
			System.out.printf("%s %s %s\n", s.name, s.phone, s.address);
		}
	}

}
