import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BookDAO {

	   public BookDAO() {
	      super();
	      //드라이브 모듈 불러오기
	      try {
	         Class.forName(BookDTO.JDBC_DRIVER);
	         System.out.println("드라이브 로딩 성공");
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }   
	   }
	   
	   public void selectBook()
	   {
	      Connection conn=null;  //db연결
	      Statement stmt = null; //쿼리실행
	      ResultSet rs=null; //결과를 담고 있다 
	      
	      try {
	         conn = DriverManager.getConnection(BookDTO.DB_URL, BookDTO.USERNAME, BookDTO.PASSWORD);
	         stmt = conn.createStatement();
	         String sql = "select * from book";      
	         rs = stmt.executeQuery(sql);
	         while(rs.next())
	         {
	        	 System.out.printf("%s\t", rs.getString("bookNo"));
	        	 System.out.printf("%s\t", rs.getString("bookTitle"));
	        	 System.out.printf("%s\t", rs.getString("bookAuthor"));
	        	 System.out.printf("%s\t", rs.getString("bookYear"));
	        	 System.out.printf("%s\t", rs.getString("bookPrice"));	    
	        	 System.out.printf("%s\n", rs.getString("bookPublisher"));
	         }
	         
	      }catch (SQLException e) {
	         e.printStackTrace();
	      }catch(Exception e) {
	         e.printStackTrace();
	      }
	      finally {	         
            try {
               if (rs!=null) rs.close();
               if (stmt!=null) stmt.close();
               if (conn!=null) conn.close();
               
            } catch (SQLException e) {
               
               e.printStackTrace();
            }
	      }
	   }
	   public void insertBook(BookDTO dto)
		{
		   Connection conn=null;  //db연결
		   Statement stmt = null; //쿼리실행
		   
		   try {
		      conn = DriverManager.getConnection(BookDTO.DB_URL, BookDTO.USERNAME, BookDTO.PASSWORD);
		      stmt = conn.createStatement();
		      String sql =  "insert into book( bookNo, bookTitle, bookAuthor, bookYear, bookPrice, bookPublisher) ";
		      sql = sql + "values(";
		      sql = sql + " '" + dto.getBookNo()+"' ";
		      sql = sql + " ,'" + dto.getBookTitle()+"' ";
		      sql = sql + " ,'" + dto.getBookAuthor()+"' ";
		      sql = sql + " ,'" + dto.getBookYear()+"' ";
		      sql = sql + " ,'" + dto.getBookPrice()+"' ";
		      sql = sql + " ,'" + dto.getBookPublisher()+"') ";

		      
		      stmt.execute(sql);

		      
		   }catch (SQLException e) {
		      e.printStackTrace();
		   }catch(Exception e) {
		      e.printStackTrace();
		   }
		   finally {	         
		     try {
		        if (stmt!=null) stmt.close();
		        if (conn!=null) conn.close();
		        
		     } catch (SQLException e) {
		        
		        e.printStackTrace();
		     }
		   }
		}

	}	   

	
