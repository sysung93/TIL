
public class TestJDBC3 {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		dao.selectProduct();
		
	
		ProductDto dto = new ProductDto();
		dto.setProduct_id("p004");
		dto.setProduct_name("coffee");
		dto.setProduct_model("����ü��");
		dto.setMaker("�ɳ�");
		dto.setPrice("4000");
		
		dao.insertProduct(dto);
		
		dto.setProduct_id("p005");
		dto.setProduct_name("�Һ�");
		dto.setProduct_model("�Һ�1");
		dto.setMaker("��Ÿ����");
		dto.setPrice("24000");
		
		dao.insertProduct(dto);
		
	}

}
