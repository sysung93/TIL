import java.util.ArrayList;

class Book {
	String title;
	String author;
	int price;
	
	
	public Book() {
		this.title = "";
		this.author = "";
		this.price = 0;
	}

	//�����ڸ����
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//�����鿡 ������ �� �ִ� �Լ��� getter / setter ��� �Ѵ�.
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	//toString() �ڹ��� ��� Ŭ������ Object ��� Ŭ������ �ڼ�
	//Object�κ��� ��ӹٵ� toString �޼��带 �������̵� ����
	public String toString() {
		return title + " " + author + " " + price;
	}
	
	//�ӽ������� copy�Լ��߰�
	public Book copy() {
		Book temp = new Book();
		temp.title = this.title;
		temp.author = this.author;
		temp.price = this.price;
		
		return temp;
	}
	@Override
	public boolean equals(Object obj) {
		Book book = (Book)obj;
		return this.title.equals(book.title) && this.author.equals(book.author);
	}
}


public class Collection2 {
	public static void main(String[] args) {
		Book book = new Book();
		// book.title = "�ְ�����";
		book.setTitle("�ְ�����");
		System.out.println(book.getTitle());
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		book = new Book();
		book.setTitle("�ְ�����");
		book.setAuthor("������");
		book.setPrice(14000);
		list.add(book);
		
		book = new Book();
		book.setTitle("���̼���");
		book.setAuthor("�̹���");
		book.setPrice(20000);
		list.add(book);
		
		book = new Book();
		book.setTitle("�����ѵ���");
		book.setAuthor("��û��");
		book.setPrice(21000);
		list.add(book);
		
		//������
		list.add(new Book("��¥��", "ä����", 17000));
		
		
		//list ������ ����ϱ�
		for(Book b : list) {
			System.out.println(b.getTitle() + " " + b.getAuthor() + " " + b.getPrice());
			System.out.println(b.toString());
			System.out.println(b);
		}
		
		int pos = list.indexOf(new Book("��¥��", "ä����", 17000));
		System.out.println(pos);
		
		//���������� ����� ���� ����
		book = new Book("���", "������", 100000);
		Book book2;
		
		//book�� ���� book2��
		
		//���������� ������ �� ������ �����Ѵ�. ���� ������ ������ �̿� book,boo2 ������ ����
		book2 = book; //���� ����
		
		//�������� > cloneble �̶� �������̽��� ��ӹ޾ƾ���
//		book2 = new Book();
//		book2.setTitle(book.getTitle());
//		book2.setAuthor(book.getAuthor());
//		book2.setPrice(book.getPrice());
		
		book2 = book.copy();
		
		book.setTitle("������");
		
		System.out.println(book);
		System.out.println(book2);
		
		//���� ���� �޸� ������ ���� �ִ���? ������ �Ⱥ�
		System.out.println(book == book);
		
		
		String s1 = "school"; //heap ������ ��ü�� ����� �ű⿡ school�� �ִ´�
		String s2 = "school";
		
		String s3 = new String("school");
		String s4 = new String("school");
		
		System.out.println(s1 == s2); // �����޸�
		System.out.println(s3 == s4); // �ٸ��޷θ�
		
		//������������ equals �޼��带 ���
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		
		book = new Book("�ڹ�������", "���ü�", 35000);
		book2 = new Book("�ڹ�������", "���ü�", 35000);
		
		System.out.println(book.equals(book2));
		
	}
}
