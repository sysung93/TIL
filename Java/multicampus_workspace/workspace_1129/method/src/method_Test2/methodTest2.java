package method_Test2;

class MyMethod {
	//�޼ҵ常��� ����
	int add(int x, int y) {
		return x+y;
	}
	
	//void�� println �Լ����� ȣ�� �Ұ�����
	void sub(int x, int y) {
		System.out.println(x-y);
	}
	
	void displaygugu(int dan) {
		for(int i = 1; i <= 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
	int sigma(int limit) {
		int i, sum = 0; //�Լ��ȿ� ������ ����� �Լ��ȿ��� �����Ѵ�.
		for(i = 1; i <= limit; i++) {
			sum += i;
		}
		return sum;
	}
}

public class methodTest2 {
	public static void main(String[] args) {
		MyMethod mm = new MyMethod();
		
		System.out.println(mm.add(1, 5));
		
//		void ����� �� ����
//		System.out.println(mm.sub(1, 5));
		
		mm.sub(1, 5);
		mm.displaygugu(4);
		System.out.println(mm.sigma(10));
	}

}
