package algorismProject2;

import java.util.Scanner;

public class algorismProject2 {
	static Scanner sc = new Scanner(Sytem.in);
	
	// ��ǰ���(��ǰ��ȣ+��ǰ��)
	static class Data{
		public static final int NO = 1;
		public static final int NAME = 2;
		
		private Integer no; //��ǰ��ȣ
		private String name; //��ǰ��
		
		Integer keyCode() {
			return no;
		}
		
		public String toString() {
			return name;
		}
		
		void scanData(String guide, int sw) {
			System.out.println(guide + "��(��) �Է��ϼ���");
			
			if((sw & NO) == NO) {
				System.out.print("��ǰ��ȣ : ");
				no = sc.nextInt();
			}
			if((sw & NAME) == NAME) {
				System.out.print("�̸� : ");
				name = sc.next();
			}
		}
		
	}
	
	enum Memu{
		ADD("��ǰ ���"),
		REMOVE("��ǰ ����"),
		SEARCH("��ǰ �˻�"),
		PRINT("��ü ��ǰ ��ȸ"),
		TERMINATE("����");
		
		private final String message
		
	}
	// ��ǰ����
	
	
	// ��ǰ�˻�
	// ��ü ��ǰ ��ȸ
	// ����

}
