import java.util.Scanner;

public class exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade;
		
		System.out.print("�̸� : ");
		String name = sc.next();		
		
		System.out.print("�ʱ� : "); //400
		int write = sc.nextInt();
		while(write > 400 || write < 0) {
			System.out.println("0~400������ ���� �Է��ϼ���");
			System.out.print("�ʱ� : ")
			write =sc.nextInt();
		}
		System.out.print("���� : "); //200
		int word = sc.nextInt();
		while(word > 200 || word < 0) {
			System.out.println("0~200������ ���� �Է��ϼ���");
			System.out.print("���� : ");
			word =sc.nextInt();
		}
		System.out.print("���� : "); // 200
		int excel = sc.nextInt();
		while(excel > 200 || excel < 0) {
			System.out.println("0~200������ ���� �Է��ϼ���");
			System.out.print("���� : ");
			excel =sc.nextInt();
		}
		System.out.print("�Ŀ�����Ʈ : "); //200
		int ppt = sc.nextInt();
		while(ppt > 200 || ppt < 0) {
			System.out.println("0~200������ ���� �Է��ϼ���");
			System.out.print("�Ŀ�����Ʈ : ");
			ppt =sc.nextInt();
		}
		
		int total_score = write + word + excel + ppt;
		
		switch((int)(total_score/200)) {
			case 5:
			case 4: 
				grade = "A" ;
				break;
			case 3:;
				grade = "B" ;
				break;
			case 2:
				grade = "C" ;
				break;
			default:
				grade = "D" ;
		} 
		System.out.println(name +  "���� ������" + total_score + "�����" + grade + "�Դϴ�");
		
	}

}
