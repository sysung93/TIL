package example;

public class For_exam08 {
	public static void main(String[] args) {
		// (�������� 18) 2000 �� ���� 3000����� ����� ������ �����ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. 
		//���� 4�� ������ �������� 0�� ��� 1�� ���ϴٰ� 100���� ����� ��� ������ �ƴ�
		//400�⿡ �ѹ��� ����
		int cnt = 0;
		
		for(int i = 2000; i <= 3000; i++) {
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				cnt++;
			}
		}
		System.out.println("������ ���� : " + cnt);
	}

}
