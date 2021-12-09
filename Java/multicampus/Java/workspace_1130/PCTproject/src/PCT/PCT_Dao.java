package PCT;

import java.util.ArrayList;
import java.util.Scanner;

public class PCT_Dao {
	ArrayList<PCT_Data> list = new ArrayList<PCT_Data>();
	Scanner sc = new Scanner(System.in);
	
	public void append() {
		PCT_Data data = new PCT_Data();
		
//		System.out.print("이름 : ");		
//		data.setName(sc.next());
//		
//		System.out.print("필기 : ");		
//		data.setWrite(sc.nextInt());
//		
//		System.out.print("워드 : ");
//		data.setWord(sc.nextInt());
//		
//		System.out.print("스프레드 : ");
//		data.setSpread(sc.nextInt());
//		
//		System.out.print("프리젠트 : ");
//		data.setPpt(sc.nextInt());
		
		data. setWrite(getScore("필기", 400));
		data. setWord(getScore("워드", 200));
		data. setSpread(getScore("스프레드", 200));
		data. setPpt(getScore("프리젠트", 200));
		
		data.calculate();
		
		list.add(data);
	}
	
	int getScore(String subject, int limit) {
		int temp;
		System.out.printf("%s : ", subject);
		temp = sc.nextInt();
		while(temp < 0 || temp > limit) {
			System.out.printf("0 ~ %d 범위의 값만 입력하세요\n", limit);
			System.out.printf("%s : ", subject);
			temp = sc.nextInt();
		}
		return temp;
	}

	public void output() {
		for(PCT_Data pct : list) {
			System.out.printf("%s %d %d %d %d %d %s\n",pct.getName(), pct.getWrite(), pct.getWord(), 
					pct.getPpt(), pct.getSpread(), pct.getTotal(), pct.getGrade());
		}
	}
	public void menuDisplay() {
		System.out.println("---------------------");
		System.out.println("         메뉴         ");
		System.out.println("---------------------");
		System.out.println("1. 추가               ");
		System.out.println("2. 출력               ");
		System.out.println("3. 검색               ");
		System.out.println("0. 종료               ");
		System.out.println("---------------------");
		
	}
	
	public void start(){
		while(true) {
			menuDisplay();
			System.out.print("선택 : ");
			int menu = sc.nextInt();
			switch(menu) {
				case 1: append(); break;
				case 2: append(); break;
				case 3: System.out.println("검색");break;
				case 0: System.out.println("프로그램을 종료합니다.");
						return;
				default: System.out.println("쫌~");
			}
		}		
	}
}
