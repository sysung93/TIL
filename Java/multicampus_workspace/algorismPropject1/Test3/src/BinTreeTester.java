import java.util.Scanner;
// �����˻�Ʈ�� Ŭ���� BinTree<K,V>�� �̿� ��

class BinTreeTester {
	static Scanner stdIn = new Scanner(System.in);

	// ������ (ȸ����ȣ + �̸�)
	static class Data {
		public static final int NO   = 1;	// ��ȣ�� �о� ���ϱ��?
		public static final int NAME = 2;	// �̸��� �о� ���ϱ��?

		private Integer no;					// ȸ����ȣ (Ű ��)
		private String  name;				// �̸�

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

		private final String message;			// ����� ���ڿ� 

		static Menu MenuAt(int idx) {			// ������ idx�� ���Ÿ� ��ȯ
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) {					// ������
			message = string;
		}

		String getMessage() {					// ����� ���ڿ��� ��ȯ
			return message;
		}
	}

	// �޴� ����
	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m : Menu.values())
				System.out.printf("(%d) %s  ", m.ordinal(), m.getMessage());
			System.out.print("\n�޴����� : ");
			key = stdIn.nextInt();
		} while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());

		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu;								// �޴�
		Data data = null;								// �߰��� ������ ����
		Data ptr;								// �˻��� ������ ����
		Data temp = new Data();					// �Է¿� ������
		BinTree<Integer, Data> tree = new BinTree<Integer, Data>();
		
		
		
		do {
			switch (menu = SelectMenu()) {
			 case ADD :							// ��带 ����
					data = new Data();
			 		data.scanData("��ǰ ���", Data.NO | Data.NAME);
			 		tree.add(data.keyCode(), data);
			 		break;

			 case REMOVE :						// ��带 ����
					temp.scanData("��ǰ ����", Data.NO);
			 		tree.remove(temp.keyCode());
			 		System.out.print("��ǰ ���� �Ϸ�");
			 		break;

			 case SEARCH :						// ��带 �˻�
					temp.scanData("��ǰ �˻�", Data.NO);
			 		ptr = tree.search(temp.keyCode());
			 		if (ptr != null)
						System.out.println("��ǰ�� : " + ptr);
					else
			 			System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
			 		break;
			 case PRINT :						// ��� ��带 Ű ���� ������������ ���				 	
				 	if (data != null)
						tree.print();
					else
				 		System.out.println("��ϵ� ��ǰ�� �����ϴ�.");
				 	break;
//				 	tree.print();
//					break;
			}
		} while (menu != Menu.TERMINATE);
		
		
		
	}
}