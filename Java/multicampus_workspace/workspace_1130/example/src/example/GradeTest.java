//package example;
//
//import java.util.Scanner;
//
//public class GradeTest {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������ �Է����ּ���:");
//		String answer = sc.nextLine();
//		
//		Grade grade = new Grade();
//		
//		while(true) {
//			System.out.println("�л��̸�:");
//			String name = sc.nextLine();
//			if(name == "0") break;
//			System.out.println("�л����:");
//			String s_ans = sc.nextLine();
//			
//			grade.setName(name);
//			grade.setS_answer(s_ans);
//			grade.marking(answer);
//			System.out.println("���: " + grade.check_answer);
//			System.out.println("���� ����: " + grade.ans_num);
//			System.out.println("����: " + grade.score);
//			System.out.println("------------------");
//		}
//	}
//	
//	
//}
