package javaProject1;

import java.util.ArrayList;

public class ProductTest {
	public static void main(String[] args) {
		
		ArrayList<Product> prdList = new ArrayList<>();
				
		Product product1 = new Product("001", "��Ʈ��", 1200000, 2021, "�Ｚ");
		Product product2 = new Product("002", "�����", 300000, 2021, "LG");
		Product product3 = new Product("003", "���콺", 30000, 2020, "������");
		
		prdList.add(product1);
		prdList.add(product2);
		prdList.add(product3);
		
		System.out.println("��ǰ��ȣ\t��ǰ��\t����\t����\t������" );
		System.out.println("----------------------------------------");
		
		for(Product prd : prdList) {
			System.out.println(prd.toString());
		}
	}
}
