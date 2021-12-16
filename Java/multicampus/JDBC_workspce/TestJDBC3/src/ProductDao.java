import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProductDao {

	   public ProductDao() {
	      super();
	      //����̺� ��� �ҷ�����
	      try {
	         Class.forName(DButil.JDBC_DRIVER);
	         System.out.println("����̺� �ε� ����");
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }   
	   }
	   
	   public void selectProduct()
	   {
	      Connection conn=null;  //db����
	      Statement stmt = null; //��������
	      ResultSet rs=null; //����� ��� �ִ� 
	      
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
		   Connection conn=null;  //db����
		   Statement stmt = null; //��������
		   
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

	
