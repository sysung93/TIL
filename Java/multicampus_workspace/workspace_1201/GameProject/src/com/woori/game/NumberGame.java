package com.woori.game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//게임 한번 분량
public class NumberGame {
	int computer;
	ArrayList<Integer> person = new ArrayList<Integer>();
	
	// int 값타임 Wrapper class 값타입 > 참조로 전환시킬 수 있는 클래스
	// int의 클래스 Integer
	
	boolean match = false; // 맞췄는지 여부
	int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public NumberGame() {
		super();
		Random rand = new Random();
		computer = rand.nextInt(10) + 1;
	}
	
	public void start() {
		
		while(!match && count < 5) {
			System.out.println("숫자 : ");
			int temp = sc.nextInt();
			person.add(temp);
			
			if(temp == computer) {
				match = true;
			} else if(temp > computer) {
				System.out.println("숫자가 큽니다");
			} else {
				System.out.println("숫자가 작습니다,");
			}
			count++;
		}
		if(match) {
			System.out.printf("%d 번만에 맞췄습니다.", count);
		} else {
			System.out.println("아쉽군요 기회를 다 사용했어요");
		}
		
	}

}
