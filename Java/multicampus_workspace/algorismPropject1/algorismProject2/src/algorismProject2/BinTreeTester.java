package algorismProject2;
import java.util.Scanner;


class BinTreeTester {
	static Scanner stdIn = new Scanner(System.in);

	// ������ (ȸ����ȣ + �̸�)
	static class Data {
		public static final int NO   = 1;	
		public static final int NAME = 2;	

		private Integer no;					
		private String  name;				

		// Ű ��
		Integer keyCode() {
			return no;
		}

		// ���ڿ��� ��ȯ�մϴ�.
		public String toString() {
			return name;
		}

		// �����͸� �Է��մϴ�.
		void scanData(String guide, int sw) {
			
			if ((sw & NO) == NO) {
				System.out.print("��ǰ ��ȣ��");
				no = stdIn.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.print("��ǰ��");
				name = stdIn.next();
			}
		}
	}

	// �޴� ������
	enum Menu {
		ADD(      "��ǰ ���"),
		REMOVE(   "��ǰ ����"),
		SEARCH(   "��ǰ �˻�"),
		PRINT(    "��ü ��ǰ ��ȸ"),
		TERMINATE("����");

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

	// �޴� ����
	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m : Menu.values())
				System.out.printf("(%d) %s  ", m.ordinal()+1, m.getMessage());
			System.out.print("\n�޴����� : ");
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
			 		data.scanData("��ǰ ���", Data.NO | Data.NAME);
			 		tree.add(data.keyCode(), data);
			 		break;

			 case REMOVE :						
					temp.scanData("��ǰ ����", Data.NO);
			 		tree.remove(temp.keyCode());
			 		System.out.println("��ǰ ���� �Ϸ�");
			 		break;

			 case SEARCH :						
					temp.scanData("��ǰ �˻�", Data.NO);
			 		ptr = tree.search(temp.keyCode());
			 		if (ptr != null)
						System.out.println("��ǰ�� : " + ptr);
					else
			 			System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
			 		break;
			 case PRINT :										 	
				 	if (data != null)
						tree.print();
					else
				 		System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
				 	break;

			}
		} while (menu != Menu.TERMINATE);
		
		
		
	}
}