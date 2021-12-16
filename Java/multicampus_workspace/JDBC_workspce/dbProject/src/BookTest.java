
public class BookTest {
	public static void main(String[] args) {
		BookDAO dao = new BookDAO();
		
		BookDTO dto = new BookDTO();
		dto.setBookNo("B004");
		dto.setBookTitle("자바스크립트");
		dto.setBookAuthor("강길동");
		dto.setBookYear("2020");
		dto.setBookPrice("28000");
		dto.setBookPublisher("서울출판사");
		
		dao.insertBook(dto);
		
		dao.selectBook();
		
	
	}

}
