package Break_Test;

public class break_test {
	public static void main(String[] args) {
		//break = switch, for, while, do���׸� ������ ��ģ��
		
		int i;
		for(i = 1; i <= 10; i++) {
			if(i == 6) {
				break; //for ���� ã�Ƽ� ����������
			}
			System.out.println(i);
		}
	}

}
