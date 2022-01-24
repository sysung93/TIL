import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDao {

	   public ProductDao() {
	      super();
	      //드라이브 모듈 불러오기
	      try {
	         Class.forName(DButil.JDBC_DRIVER);
	         System.out.println("드라이브 로딩 성공");
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }   
	   }
	   
	   public void selectProduct()
	   {
	      Connection conn=null;  //db연결
	      Statement stmt = null; //쿼리실행
	      ResultSet rs=null; //결과를 담고 있다 
	      
	      try {
	         conn = DriverManager.getConnection(DButil.DB_URL, DButil.USERNAME, DButil.PASSWORD);
	         stmt = conn.createStatement();
	         String sql = "select * from product";      
	         rs = stmt.executeQuery(sql);
	         while(rs.next())
	         {
	        	 System.out.printf("%s\t", rs.getString("product_id"));
	        	 System.out.printf("%s\t", rs.getString("product_name"));
	        	 System.out.printf("%s\t", rs.getString("product_model"));
	        	 System.out.printf("%s\t", rs.getString("maker"));
	        	 System.out.printf("%s\n", rs.getString("price"));
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
	   public void insertProduct(ProductDto dto)
		{
		   Connection conn=null;  //db연결
		   Statement stmt = null; //쿼리실행
		   
		   try {
		      conn = DriverManager.getConnection(DButil.DB_URL, DButil.USERNAME, DButil.PASSWORD);
		      stmt = conn.createStatement();
		      String sql =  "insert into product( product_id, product_name, product_model, maker, price) ";
		      sql = sql + "values(";
		      sql = sql + " '" + dto.getProduct_id()+"' ";
		      sql = sql + " ,'" + dto.getProduct_name()+"' ";
		      sql = sql + " ,'" + dto.getProduct_model()+"' ";
		      sql = sql + " ,'" + dto.getMaker()+"' ";
		      sql = sql + " ,'" + dto.getPrice()+"') ";

		      
		      System.out.println(sql);
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

	
