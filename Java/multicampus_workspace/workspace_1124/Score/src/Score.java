import java.util.Scanner;

public class Score {

	public static void main(String[] args) {
		int score;
		String grade;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		score = sc.nextInt();
		
		if(score >= 90)
			grade = "A";
		else if(score >= 80)
			grade = "B";
		else if(score >= 70)
			grade = "C";
		else if(score >= 60)
			grade = "D";
		else 
			grade = "F";
		System.out.println("������" + grade + "�Դϴ�.");

	}

}
