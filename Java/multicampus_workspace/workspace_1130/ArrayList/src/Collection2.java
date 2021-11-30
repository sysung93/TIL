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

	//생성자만들기
	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	//변수들에 접근할 수 있는 함수를 getter / setter 라고 한다.
	
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
	//toString() 자바의 모든 클래스는 Object 라는 클래스의 자손
	//Object로부터 상속바든 toString 메서드를 오버라이딩 하자
	public String toString() {
		return title + " " + author + " " + price;
	}
	
	//임시적으로 copy함수추가
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
		// book.title = "쌍갑포차";
		book.setTitle("쌍갑포차");
		System.out.println(book.getTitle());
		
		ArrayList<Book> list = new ArrayList<Book>();
		
		book = new Book();
		book.setTitle("쌍갑포차");
		book.setAuthor("배혜수");
		book.setPrice(14000);
		list.add(book);
		
		book = new Book();
		book.setTitle("관촌수필");
		book.setAuthor("이문구");
		book.setPrice(20000);
		list.add(book);
		
		book = new Book();
		book.setTitle("잔인한도시");
		book.setAuthor("이청춘");
		book.setPrice(21000);
		list.add(book);
		
		//생성자
		list.add(new Book("뽀짜툰", "채유리", 17000));
		
		
		//list 데이터 출력하기
		for(Book b : list) {
			System.out.println(b.getTitle() + " " + b.getAuthor() + " " + b.getPrice());
			System.out.println(b.toString());
			System.out.println(b);
		}
		
		int pos = list.indexOf(new Book("뽀짜툰", "채유리", 17000));
		System.out.println(pos);
		
		//참조변수의 복사와 둘의 값비교
		book = new Book("고수", "문정후", 100000);
		Book book2;
		
		//book의 값을 book2로
		
		//참조변수를 복사할 때 참조를 복사한다. 같은 데이터 공간을 이용 book,boo2 데이터 동일
		book2 = book; //얕은 복사
		
		//깊은복사 > cloneble 이란 인터페이스를 상속받아야함
//		book2 = new Book();
//		book2.setTitle(book.getTitle());
//		book2.setAuthor(book.getAuthor());
//		book2.setPrice(book.getPrice());
		
		book2 = book.copy();
		
		book.setTitle("용비불패");
		
		System.out.println(book);
		System.out.println(book2);
		
		//둘이 같은 메모리 공간을 갖고 있는지? 내용은 안봄
		System.out.println(book == book);
		
		
		String s1 = "school"; //heap 공간에 객체를 만들고 거기에 school을 넣는다
		String s2 = "school";
		
		String s3 = new String("school");
		String s4 = new String("school");
		
		System.out.println(s1 == s2); // 같은메모리
		System.out.println(s3 == s4); // 다른메로리
		
		//참조형변수는 equals 메서드를 사용
		System.out.println(s1.equals(s2));
		System.out.println(s3.equals(s4));
		
		book = new Book("자바의정석", "남궁성", 35000);
		book2 = new Book("자바의정석", "남궁성", 35000);
		
		System.out.println(book.equals(book2));
		
	}
}
