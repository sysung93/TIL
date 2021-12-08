package javaProject1;

import java.util.ArrayList;

public class ProductTest {
	public static void main(String[] args) {
		
		ArrayList<Product> prdList = new ArrayList<>();
				
		Product product1 = new Product("001", "노트북", 1200000, 2021, "삼성");
		Product product2 = new Product("002", "모니터", 300000, 2021, "LG");
		Product product3 = new Product("003", "마우스", 30000, 2020, "로지텍");
		
		prdList.add(product1);
		prdList.add(product2);
		prdList.add(product3);
		
		System.out.println("상품번호\t상품명\t가격\t연도\t제조사" );
		System.out.println("----------------------------------------");
		
		for(Product prd : prdList) {
			System.out.println(prd.toString());
		}
	}
}
