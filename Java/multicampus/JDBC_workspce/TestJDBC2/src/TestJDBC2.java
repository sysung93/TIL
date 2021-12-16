import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJDBC2 {
	public static void main(String[] args) {
		
		try {
			Class.forName(DButil.JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
//		customerNumber int PK 
//		customerName varchar(50) 
//		contactLastName varchar(50) 
//		contactFirstName varchar(50) 
//		phone varchar(50) 
//		addressLine1 varchar(50) 
//		addressLine2 varchar(50) 
//		city varchar(50) 
//		state varchar(50) 
//		postalCode varchar(15) 
//		country
		try {
			conn = DriverManager.getConnection(DButil.DB_URL, DButil.USERNAME, DButil.PASSWORD);
			stmt = conn.createStatement();
			String sql = "select * from customers";
			
			rs = stmt.executeQuery(sql);
			while(rs.next()){ 
				System.out.printf("%s\t", rs.getString("customerNumber"));
				System.out.printf("%s\t", rs.getString("customerName"));
				System.out.printf("%s\t", rs.getString("contactLastName"));
				System.out.printf("%s\t", rs.getString("contactFirstName"));
				System.out.printf("%s\t", rs.getString("phone"));
				System.out.printf("%s\t", rs.getString("addressLine1"));
				System.out.printf("%s\t", rs.getString("addressLine2"));
				System.out.printf("%s\t", rs.getString("city"));
				System.out.printf("%s\t", rs.getString("state"));
				System.out.printf("%s\t", rs.getString("postalCode"));
				System.out.printf("%s\n", rs.getString("country"));				
				}
	
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		finally {
				try {
					if(rs != null) rs.close();
					if(stmt != null) stmt.close();
					if(conn != null) conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
