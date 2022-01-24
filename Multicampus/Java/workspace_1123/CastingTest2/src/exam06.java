import java.util.Scanner;

public class exam06 {
	public static void main(String[] args) {
		//1.변수선언
		String name;
		int kor, eng, mat;
		int total;
		double avg;
		
		Scanner sc = new Scanner(System.in);
		
		//2.입력
		System.out.print("이름 : ");
		name = sc.next();
		System.out.print("국어 : ");
		kor = sc.nextInt();
		System.out.print("영어 : ");
		eng = sc.nextInt();
		System.out.print("수학 : ");
		mat = sc.nextInt();
		
		//3.계산하기
		total = kor + eng + mat;
		avg = total/3.0;
		
		System.out.printf("%s의 총점은 %d 이고 평균은 %.2f 이다./n", name, total, avg);
		
	}

}
