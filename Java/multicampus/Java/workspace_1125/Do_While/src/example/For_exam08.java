package example;

public class For_exam08 {
	public static void main(String[] args) {
		// (연습문제 18) 2000 년 부터 3000년까지 몇번의 윤년이 존재하는지 알아내는 프로그램을 작성하시오. 
		//윤년 4로 나누어 나머지가 0인 경우 1씩 더하다가 100년의 배수일 경우 윤년이 아님
		//400년에 한번씩 윤년
		int cnt = 0;
		
		for(int i = 2000; i <= 3000; i++) {
			if(i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
				cnt++;
			}
		}
		System.out.println("윤년의 개수 : " + cnt);
	}

}
