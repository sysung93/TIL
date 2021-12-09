import java.util.*;

class Book {
	String title = "";
	String author = "";
	int price = 0;
	
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
	
}
// Comparator - ������ �����.
// Comparable - ���� ����Ÿ Ŭ�������� ��ӹ���
class BookComparator implements Comparator<Book> {

	@Override
	public int compare(Book o1, Book o2) {
		// TODO Auto-generated method stub
		return o1.title.compareTo(o2.title);
	}
	
}


public class Interface2 {
	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<Book>();
		
		bookList.add(new Book("���ǻ����¡��", "J.M �ٽ��ܼ�����", 15000));
		bookList.add(new Book("����", "������", 22000));
		bookList.add(new Book("�����ѵ���", "��û��", 17000));
		bookList.add(new Book("������", "��û��", 27000));
		bookList.add(new Book("Ź��", "ä����", 23000));
		bookList.add(new Book("���", "����", 20000));
		bookList.add(new Book("�ϳ��ڴ¾���", "����", 22000));
		bookList.add(new Book("���ű��ǲ�", "��ó���ũ", 15000));
		bookList.add(new Book("�Ӳ���", "ȫ����", 17000));
		bookList.add(new Book("�¹���", "������", 15000));
		bookList.add(new Book("���⿩���ְŶ�", "��ֿ���", 18000));
		
		bookList.sort(new BookComparator());
		
		for(Book book : bookList) {
			System.out.println(book);
		}
		System.out.println();
		
		//Iterator�� �ý��۳��ο��� ���� �����͵��� ��ġ����̳� ������ ������� Ŭ���� �ۿ��� ���������͸�
		//������� �����ϵ��� �ϴ� �������̽��̴�. �÷��� Ŭ�������� �� �� �������̽��� �����Ѵ�.
		//�������������� enmerable �������̽��� �̿����� �ߴµ� ����� Iterator�� �����
		//�� �������̽��� �����ϴ� Ŭ�������� for each ����ó���� ������
		
		Iterator<Book> it = bookList.iterator();
		while(it.hasNext()) { // ������ҷ� �̵� �����ϸ� true �ƴϸ� false ��ȯ 
			Book book = it.next();
			System.out.println(book);
		}
		System.out.println();
		
		//ArrayList�� get(0), get(1)... Ű��� �Ἥ �������� ������ �˻�
		//get("school"), get("rain")
		Map<String, String> map = new HashMap<String, String>();
		map.put("school", "�б�");
		map.put("hospital", "����");
		map.put("house", "��");
		map.put("company", "ȸ��");
		map.put("assembly", "��ȸ");
		map.put("president", "�����");
		
		System.out.println(map.get("school"));
		System.out.println(map.get("hospital"));
		System.out.println(map.get("house"));
		System.out.println(map.get("company"));
		
		System.out.println();
		
		Iterator<String> it2 = map.keySet().iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println();
		
		for(String key:map.keySet()) {
			System.out.println(key + " " + map.get(key));
		}
	}
}
