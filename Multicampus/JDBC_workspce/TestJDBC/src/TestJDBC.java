import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC {
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver"; 
	   //8.0 이상부터 allowPublicKeyRetrieval=true 필요함 
	   static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?allowPublicKeyRetrieval=true";
	   static final String USERNAME = "user02"; 
	   static final String PASSWORD = "1234"; 
	  
	   public static void main(String[] args) {
		   try {
			   Class.forName(JDBC_DRIVER);
			   System.out.println("드라이브 로딩 성공");
			
		   }
		   catch(ClassNotFoundException e) {
			   e.printStackTrace();
		   }
		   
		   Connection conn = null;
		   Statement stmt = null;
		   ResultSet rs = null;
		   
		   try {
			   conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
			   System.out.println("디비 연결 성공");
			   
			   stmt = conn.createStatement();
			   String sql = "select * from board";
			   rs = stmt.executeQuery(sql);
			   
			   while(rs.next()) {
				   System.out.printf("%s %s %s\n", rs.getString(1), rs.getString(2), rs.getString(3));
			   }
			   
			   
		   } catch(SQLException e) {
			   e.printStackTrace();
			   
		   } catch(Exception e) {
			   e.printStackTrace();
		   }
	} 	
}
