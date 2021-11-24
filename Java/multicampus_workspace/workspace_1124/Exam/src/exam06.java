import java.util.Scanner;

public class exam06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade;
		
		System.out.print("이름 : ");
		String name = sc.next();		
		
		System.out.print("필기 : "); //400
		int write = sc.nextInt();
		while(write > 400 || write < 0) {
			System.out.println("0~400사이의 값을 입력하세요");
			System.out.print("필기 : ")
			write =sc.nextInt();
		}
		System.out.print("워드 : "); //200
		int word = sc.nextInt();
		while(word > 200 || word < 0) {
			System.out.println("0~200사이의 값을 입력하세요");
			System.out.print("워드 : ");
			word =sc.nextInt();
		}
		System.out.print("엑셀 : "); // 200
		int excel = sc.nextInt();
		while(excel > 200 || excel < 0) {
			System.out.println("0~200사이의 값을 입력하세요");
			System.out.print("엑셀 : ");
			excel =sc.nextInt();
		}
		System.out.print("파워포인트 : "); //200
		int ppt = sc.nextInt();
		while(ppt > 200 || ppt < 0) {
			System.out.println("0~200사이의 값을 입력하세요");
			System.out.print("파워포인트 : ");
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
		System.out.println(name +  "님의 총점은" + total_score + "등급은" + grade + "입니다");
		
	}

}
