import java.util.ArrayList;

public class Collection {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ŀ��");
		list.add("�����ֽ�");
		list.add("�������ֽ�");
		list.add("�ڸ����̵�");
		list.add("ī��ḶŰ�ƶ�");
		
		System.out.println("������ ī��Ʈ : " + list.size());
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		//�����͸� ã�� �Լ�
		int pos = list.indexOf("�����ֽ�");
		System.out.println(pos);
		
		pos = list.indexOf("�����ֽ�");
		System.out.println(pos); // �ڹٴ� �Լ��� ������ ������ -1��ȯ, �����϶� null
		
		//----------------------------------------
		
		list.sort(null);
		//abc�� �����ٶ�������� �����̶��Ѵ�.
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("���� ��----------");
		list.remove(1); //��ġ������ ����
		list.remove("ī��Ḷ���ƶ�"); //�̸����� ����
		
		for(String s : list) {
			System.out.println(s);
		}
		
		System.out.println("��ü���� ��-----------");
		list.clear();
		
		for(String s : list) {
			System.out.println(s);
		}
		
	}
}
