package example;

public class Multi_For_exam4 {
	public static void main(String[] args) {
		//A-Z���� ������� ������ �� �� ��ĭ�� �ڷ� �̷�� abc... bcd....cde... zab...
		int a = 65; 
		for(int i = 0; i < 26; i++) {
			for(int j = 0; j < 26; j++) {
				//���� ���� ���ĺ�
				int alpa = a + i + j;
				if(alpa > 'Z') {
					alpa -= 26;
				} System.out.print((char)alpa);
			} System.out.println();
		}
	}

}
