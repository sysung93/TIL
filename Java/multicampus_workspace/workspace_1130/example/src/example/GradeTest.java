//package example;
//
//import java.util.Scanner;
//
//public class GradeTest {
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("정답을 입력해주세요:");
//		String answer = sc.nextLine();
//		
//		Grade grade = new Grade();
//		
//		while(true) {
//			System.out.println("학생이름:");
//			String name = sc.nextLine();
//			if(name == "0") break;
//			System.out.println("학생답안:");
//			String s_ans = sc.nextLine();
//			
//			grade.setName(name);
//			grade.setS_answer(s_ans);
//			grade.marking(answer);
//			System.out.println("답안: " + grade.check_answer);
//			System.out.println("정답 개수: " + grade.ans_num);
//			System.out.println("점수: " + grade.score);
//			System.out.println("------------------");
//		}
//	}
//	
//	
//}
