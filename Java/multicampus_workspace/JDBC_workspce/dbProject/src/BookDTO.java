

public class BookDTO {
	
	public static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	   //8.0 이상부터 allowPublicKeyRetrieval=true 필요함 
	public static final String DB_URL = "jdbc:mysql://localhost:3306/myproject?allowPublicKeyRetrieval=true";
	public static final String USERNAME = "root"; 
	public static final String PASSWORD = "1234";

	private String bookNo = "";
	private String bookTitle = "";
	private String bookAuthor = "";
	private String bookYear = "";
	private String bookPrice = "";
	private String bookPublisher = "";
	


	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookTitle() {
		return bookTitle;
	}
	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookYear() {
		return bookYear;
	}
	public void setBookYear(String bookYear) {
		this.bookYear = bookYear;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookPublisher() {
		return bookPublisher;
	}
	public void setBookPublisher(String bookPublisher) {
		this.bookPublisher = bookPublisher;
	}
	

	
	
	
}
