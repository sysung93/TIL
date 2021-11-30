package PCT;

import java.util.ArrayList;
import java.util.Scanner;

public class PCT_Dao {
	ArrayList<PCT_Data> list = new ArrayList<PCT_Data>();
	Scanner sc = new Scanner(System.in);
	
	public void append() {
		PCT_Data data = new PCT_Data();
		
//		System.out.print("�̸� : ");		
//		data.setName(sc.next());
//		
//		System.out.print("�ʱ� : ");		
//		data.setWrite(sc.nextInt());
//		
//		System.out.print("���� : ");
//		data.setWord(sc.nextInt());
//		
//		System.out.print("�������� : ");
//		data.setSpread(sc.nextInt());
//		
//		System.out.print("������Ʈ : ");
//		data.setPpt(sc.nextInt());
		
		data. setWrite(getScore("�ʱ�", 400));
		data. setWord(getScore("����", 200));
		data. setSpread(getScore("��������", 200));
		data. setPpt(getScore("������Ʈ", 200));
		
		data.calculate();
		
		list.add(data);
	}
	
	int getScore(String subject, int limit) {
		int temp;
		System.out.printf("%s : ", subject);
		temp = sc.nextInt();
		while(temp < 0 || temp > limit) {
			System.out.printf("0 ~ %d ������ ���� �Է��ϼ���\n", limit);
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
		System.out.println("         �޴�         ");
		System.out.println("---------------------");
		System.out.println("1. �߰�               ");
		System.out.println("2. ���               ");
		System.out.println("3. �˻�               ");
		System.out.println("0. ����               ");
		System.out.println("---------------------");
		
	}
	
	public void start(){
		while(true) {
			menuDisplay();
			System.out.print("���� : ");
			int menu = sc.nextInt();
			switch(menu) {
				case 1: append(); break;
				case 2: append(); break;
				case 3: System.out.println("�˻�");break;
				case 0: System.out.println("���α׷��� �����մϴ�.");
						return;
				default: System.out.println("��~");
			}
		}		
	}
}
