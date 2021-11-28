package homework;

import java.util.Scanner;

public class homework_PCT {
	public static void main(String[] args) {
		
//		이름, 필기, 워드, 파워포인트, 스프레드 까지 입력받아서 총점과 등급을 구한다 
//
//		등급은 800이상  A등급, 600이상 B 등급 400이상 C 등급 , D 등급 재시험 요망 
//
//		구조는 아래 소스 참고하고 마지막에  A 등급이 몇명이었는지 B,C,D 등급이 각각 몇명이었는지 세어서 
//
//		출력할것 

				final int COUNT=3;
				
				//1.입력변수와 출력변수 선언하기 
				String[] name = new String[COUNT];
				int[] write_score = new int[COUNT];
				int[] word_score = new int[COUNT];
				int[] ppt_score = new int[COUNT];
				int[] spread_score = new int[COUNT];
				int[] total_score = new int[COUNT];
				
				int[] grades = new int[COUNT];
				int A = 0;
				int B = 0;
				int C = 0;
				int D = 0;
				
				
				int i;
				Scanner sc = new Scanner(System.in); 
				
				//2. 입력을 받는다 
				for(i=0; i < COUNT; i++)
				{
					System.out.print("이름 : ");
					name[i] = sc.next();
					
					System.out.print("필기 점수를 입력하세요(0 ~ 400점) : ");
					write_score[i] = sc.nextInt();
			
					System.out.print("워드 점수를 입력하세요(0 ~ 250점) : ");
					word_score[i] = sc.nextInt();
					
					System.out.print("프레젠테이션 점수를 입력하세요(0 ~ 150점) : ");
					ppt_score[i] = sc.nextInt();		
					
					System.out.print("스프레드시트 점수를 입력하세요(0 ~ 200점) : ");
					spread_score[i] = sc.nextInt();		
				}
				
				//3.계산을 한다 
				for(i = 0; i < COUNT; i++)
				{
					total_score[i] = write_score[i] + word_score[i] + ppt_score[i] + spread_score[i]; 
				}
				
				for(i = 0; i < COUNT; i++) {
					if(total_score[i] >= 800) {
						grades[i] = 'A';
						A++;
					} else if(total_score[i] >= 600) {
						grades[i] = 'B';
						B++;
					} else if(total_score[i] >= 400) {
						grades[i] = 'C';
						C++;
					} else {
						grades[i] = 'D';
						D++;
					}
					
				}
				
				System.out.println("--------------------------------------------------------------");
				System.out.printf("이름\t필기점수\t워드점수\t프레젠테이션점수\t스프레드시트점수\t총점\n");
				System.out.println("--------------------------------------------------------------");
				
				//4.출력하기
				for(i=0; i<COUNT; i++)
				{
					System.out.printf("%s\t", name[i]);
					System.out.printf("%d\t", write_score[i]);
					System.out.printf("%d\t", word_score[i]);
					System.out.printf("%d\t", ppt_score[i]);
					System.out.printf("%d\t", spread_score[i]);
					System.out.printf("%d\n", total_score[i]);
				}
				
				System.out.printf("A등급은 %d명 입니다. \n", A);
				System.out.printf("B등급은 %d명 입니다.\n", B);
				System.out.printf("C등급은 %d명 입니다.\n", C);
				System.out.printf("D등급은  %d명 입니다.\n", D);
		}
	
}
	



