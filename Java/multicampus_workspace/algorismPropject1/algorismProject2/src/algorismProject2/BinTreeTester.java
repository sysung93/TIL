package algorismProject2;
import java.util.Scanner;


class BinTreeTester {
	static Scanner stdIn = new Scanner(System.in);

	// 데이터 (회원번호 + 이름)
	static class Data {
		public static final int NO   = 1;	
		public static final int NAME = 2;	

		private Integer no;					
		private String  name;				

		// 키 값
		Integer keyCode() {
			return no;
		}

		// 문자열을 반환합니다.
		public String toString() {
			return name;
		}

		// 데이터를 입력합니다.
		void scanData(String guide, int sw) {
			
			if ((sw & NO) == NO) {
				System.out.print("상품 번호：");
				no = stdIn.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.print("상품명：");
				name = stdIn.next();
			}
		}
	}

	// 메뉴 열거형
	enum Menu {
		ADD(      "상품 등록"),
		REMOVE(   "상품 삭제"),
		SEARCH(   "상품 검색"),
		PRINT(    "전체 상품 조회"),
		TERMINATE("종료");

		private final String message;			 

		static Menu MenuAt(int idx) {			
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) {					
			message = string;
		}

		String getMessage() {					
			return message;
		}
	}

	// 메뉴 선택
	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m : Menu.values())
				System.out.printf("(%d) %s  ", m.ordinal()+1, m.getMessage());
			System.out.print("\n메뉴선택 : ");
			key = stdIn.nextInt()-1;
		} while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu;								
		Data data = null;						
		Data ptr;								
		Data temp = new Data();					
		BinTree<Integer, Data> tree = new BinTree<Integer, Data>();
		
		
		
		do {
			switch (menu = SelectMenu()) {
			 case ADD :							
					data = new Data();
			 		data.scanData("상품 등록", Data.NO | Data.NAME);
			 		tree.add(data.keyCode(), data);
			 		break;

			 case REMOVE :						
					temp.scanData("상품 삭제", Data.NO);
			 		tree.remove(temp.keyCode());
			 		System.out.println("상품 삭제 완료");
			 		break;

			 case SEARCH :						
					temp.scanData("상품 검색", Data.NO);
			 		ptr = tree.search(temp.keyCode());
			 		if (ptr != null)
						System.out.println("상품명 : " + ptr);
					else
			 			System.out.println("등록된 상품이 없습니다.");
			 		break;
			 case PRINT :										 	
				 	if (data != null)
						tree.print();
					else
				 		System.out.println("등록된 상품이 없습니다.");
				 	break;

			}
		} while (menu != Menu.TERMINATE);
		
		
		
	}
}