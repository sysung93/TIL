
public class WhileTest1 {
	public static void main(String[] args) {
		int i;
		/*
		 * ������ �ʱⰪ�� �Ҵ��Ѵ�
		 * while(���ǽ�) {
		 * ó���ڵ�
		 * �������� ���ǽ��� ����� �������� ���� �� �ִ� ������ ����� �Ѵ�}
		 * ���ǽ��� ����� �������� ���� ������ ������ while���� �������� �ʴ´�
		 * �̰� ���ѷ������ �Ѵ�
		 */
		
		System.out.println("1~5���� ����ϱ�");
		
		i = 1; //�����ʱ�ȭ
		while( i <= 5) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("0, 2,4,6,8,10 ����ϱ�");
		
		int e = 0;
		while(e <= 10) {
			System.out.println(e);
			e += 2;
		}
				
		
	}

}