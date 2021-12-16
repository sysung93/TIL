
public class TestJDBC3 {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		dao.selectProduct();
		
	
		ProductDto dto = new ProductDto();
		dto.setProduct_id("p004");
		dto.setProduct_name("coffee");
		dto.setProduct_model("예가체프");
		dto.setMaker("케냐");
		dto.setPrice("4000");
		
		dao.insertProduct(dto);
		
		dto.setProduct_id("p005");
		dto.setProduct_name("텀블러");
		dto.setProduct_model("텀블러1");
		dto.setMaker("스타벅스");
		dto.setPrice("24000");
		
		dao.insertProduct(dto);
		
	}

}
