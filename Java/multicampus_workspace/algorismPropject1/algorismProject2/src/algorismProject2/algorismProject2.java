package algorismProject2;

import java.util.Scanner;

public class algorismProject2 {
	static Scanner sc = new Scanner(Sytem.in);
	
	// 상품등록(상품번호+상품명)
	static class Data{
		public static final int NO = 1;
		public static final int NAME = 2;
		
		private Integer no; //상품번호
		private String name; //상품명
		
		Integer keyCode() {
			return no;
		}
		
		public String toString() {
			return name;
		}
		
		void scanData(String guide, int sw) {
			System.out.println(guide + "을(를) 입력하세요");
			
			if((sw & NO) == NO) {
				System.out.print("상품번호 : ");
				no = sc.nextInt();
			}
			if((sw & NAME) == NAME) {
				System.out.print("이름 : ");
				name = sc.next();
			}
		}
		
	}
	
	enum Memu{
		ADD("상품 등록"),
		REMOVE("상품 삭제"),
		SEARCH("상품 검색"),
		PRINT("전체 상품 조회"),
		TERMINATE("종료");
		
		private final String message
		
	}
	// 상품삭제
	
	
	// 상품검색
	// 전체 상품 조회
	// 종료

}
