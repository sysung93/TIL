package example;

public class For_exam07 {
	public static void main(String[] args) {
		//�����µ��� ȭ���µ��� ȯ���ϴ� ǥ�� ����Ͻÿ�
		//(0~100������)
		//ȭ�� = ���� * 1.8 + 32
		
		int i;
		
		for(i = 0; i <= 100; i++) {
			System.out.printf("%d ====> %.2f\n", i, (i*1.8)+32);
		}
	}
}
