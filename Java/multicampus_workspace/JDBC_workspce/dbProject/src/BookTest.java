
public class BookTest {
	public static void main(String[] args) {
		BookDAO dao = new BookDAO();
		
		BookDTO dto = new BookDTO();
		dto.setBookNo("B004");
		dto.setBookTitle("�ڹٽ�ũ��Ʈ");
		dto.setBookAuthor("���浿");
		dto.setBookYear("2020");
		dto.setBookPrice("28000");
		dto.setBookPublisher("�������ǻ�");
		
		dao.insertBook(dto);
		
		dao.selectBook();
		
	
	}

}
