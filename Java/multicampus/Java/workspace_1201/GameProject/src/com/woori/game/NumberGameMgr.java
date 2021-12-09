package com.woori.game;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberGameMgr {
	ArrayList<NumberGame> list = new ArrayList<NumberGame>();
	Scanner sc = new Scanner(System.in);

	public void start() {
		do {
			System.out.println("1. 게임시작");
			System.out.println("2. 전적");
			System.out.println("3. 종료");
			
			int menu = sc.nextInt();
			switch(menu) {
			case 1:
				NumberGame ng = new NumberGame();
				list.add(ng);
				ng.start();
				break;
			case 2:
				this.displayHistory();
				break;
			case 3:
				return;
			}
		} while(true);
	}
	
	public void displayHistory() {
		//컴퓨터  사람이말한숫자  맞춤여부  몇번째 맞췄는지
		//총 x번 시도해서 x번 맞췄습니다.
		//for(클래스명 변수명 : 객체배열)
		for(NumberGame game: list) {
			System.out.print("정답: "+ game.computer + "\t");
			System.out.println("사용자추측 정답: ");
			for(int a : game.person) {
				System.out.print(a + "\t");
			}
			System.out.print("정답여부: " + game.match + "\t");
			System.out.println("사용기회횟수: " + game.count);
		}
		
		int cnt = 0;
		for(NumberGame game: list) {
			if(game.match)
				cnt++;
		}
		System.out.printf("총 %d 번 시도해서 %d 번 맞췄습니다.\n", list.size(),cnt);
				
	}
}
