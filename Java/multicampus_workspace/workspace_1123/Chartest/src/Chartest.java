
public class Chartest {
	public static void main(String[] args) {
		char c;
		c = 'A';
		System.out.println(c);
		
		String word = "�ܾ�";
		System.out.println(word);
		
		System.out.println("������\n������"); //�ٹٲ�
		System.out.println("������\t������"); //��
		System.out.println("������\b������"); //������ ��ĭ
		System.out.println("������\r\n������"); //�ٹٲ��� ù��¥
		System.out.println("������\\������");
		System.out.println("\'������\'������");
		
		//��������ȯ ������ char - int�� ��ȯ
		System.out.println((int)'A');
		System.out.println((int)'a');
		System.out.println((int)'0');
		System.out.println((int)'1');
		
		c = '\u0041';
		System.out.println(c);
		
		boolean b;
		b = true;
		System.out.println(b);
		b = false;
		System.out.println(b);
		
		b = 1 > 2; //��-����� true �Ǵ� false
		System.out.println(b);
		
	}
	

}
