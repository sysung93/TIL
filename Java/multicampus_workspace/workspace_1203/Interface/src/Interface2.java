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
// Comparator - 별도로 만든다.
// Comparable - 직접 데이타 클래스에서 상속받음
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
		
		bookList.add(new Book("나의사랑로징냐", "J.M 바스콘셀레스", 15000));
		bookList.add(new Book("광장", "최인훈", 22000));
		bookList.add(new Book("잔인한도시", "이청준", 17000));
		bookList.add(new Book("서편제", "이청준", 27000));
		bookList.add(new Book("탁류", "채만식", 23000));
		bookList.add(new Book("삼대", "영상섭", 20000));
		bookList.add(new Book("하나코는없다", "최윤", 22000));
		bookList.add(new Book("갈매기의꿈", "리처드바크", 15000));
		bookList.add(new Book("임꺽정", "홍명희", 17000));
		bookList.add(new Book("태백산맥", "조정래", 15000));
		bookList.add(new Book("무기여잘있거라", "헤밍웨이", 18000));
		
		bookList.sort(new BookComparator());
		
		for(Book book : bookList) {
			System.out.println(book);
		}
		System.out.println();
		
		//Iterator는 시스템내부에서 실제 데이터들의 배치모습이나 순서와 상관없이 클래스 밖에서 내부테이터를
		//순서대로 접근하도록 하는 인터페이스이다. 컬렉션 클래스들은 다 이 인터페이스를 지원한다.
		//이전버전에서는 enmerable 인터페이스가 이역할을 했는데 현재는 Iterator로 변경됨
		//이 인터페이스를 지원하는 클래스들은 for each 구문처리가 가능함
		
		Iterator<Book> it = bookList.iterator();
		while(it.hasNext()) { // 다음요소로 이동 가능하면 true 아니면 false 반환 
			Book book = it.next();
			System.out.println(book);
		}
		System.out.println();
		
		//ArrayList는 get(0), get(1)... 키라는 써서 내용으로 데이터 검색
		//get("school"), get("rain")
		Map<String, String> map = new HashMap<String, String>();
		map.put("school", "학교");
		map.put("hospital", "병원");
		map.put("house", "집");
		map.put("company", "회사");
		map.put("assembly", "국회");
		map.put("president", "대통령");
		
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
