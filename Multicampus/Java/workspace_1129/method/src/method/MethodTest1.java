package method;

//Ŭ�������� �޼������ ��ü�� �ȸ���� ��ü�� ��� ȣ���� �ȵ�

public class MethodTest1 {
	//displayLine �̶�� �Լ�
	public void displayLine() {
		System.out.println("========================");		
	}
	
	//�Ű������� Ȱ���� �Լ��� ��� �߰�
	
	public void displayLine2(int line) {
		for(int i = 0; i <= 3; i++) {
			System.out.println("-----------------------");
		}
	}
	
	//���� ����, ����, ���� ����
	// �Ű����� = �Ű�ü�� �Ǵ� ������
	// �Լ� �ܺηκ��� �Լ��� ���� ������ �������� ����ϴ� ����
	//displayLine3(3, 10, '*')
	public void displayLine3(int line, int cnt, char mark) {
		for(int i = 1; i <= line; i++) {
			for(int j = 1; j <= cnt; j++) {
				System.out.print(mark);	
			} System.out.println();
		}		
	}
	
	public static void main(String[] args) {
		//��ü�����
		MethodTest1 t1 = new MethodTest1();
				
		//��ü�� ���� �Լ��� ȣ��
		t1.displayLine();
		t1.displayLine2(3);
		t1.displayLine3(3, 10, '*');
		t1.displayLine3(4, 5, '$');
	}
}
