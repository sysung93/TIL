package Break_Test;

public class break_test2 {
	public static void main(String[] args) {
		//break = switch, for, while, do���׸� ������ ��ģ��
		
		int i,j;
		for(i = 1; i <= 10; i++) {
			for(j =1; j <= 10; j++) {
				if(i == 6) {
					break; //for ���� ã�Ƽ� ����������
				} System.out.print(j + " ");
			} System.out.println();
		}
		
		for(i = 1; i <= 10; i++) {
			for(j =1; j <= 10; j++) {
				if(i == 6) {
					continue; // continue ���� ���� �ǳ� �پ ���������� ����
				}System.out.println(i);
			} 
		}
	}

}
