package com.woori.game;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberGameMgr {
	ArrayList<NumberGame> list = new ArrayList<NumberGame>();
	Scanner sc = new Scanner(System.in);

	public void start() {
		do {
			System.out.println("1. ���ӽ���");
			System.out.println("2. ����");
			System.out.println("3. ����");
			
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
		//��ǻ��  ����̸��Ѽ���  ���㿩��  ���° �������
		//�� x�� �õ��ؼ� x�� ������ϴ�.
		//for(Ŭ������ ������ : ��ü�迭)
		for(NumberGame game: list) {
			System.out.print("����: "+ game.computer + "\t");
			System.out.println("��������� ����: ");
			for(int a : game.person) {
				System.out.print(a + "\t");
			}
			System.out.print("���俩��: " + game.match + "\t");
			System.out.println("����ȸȽ��: " + game.count);
		}
		
		int cnt = 0;
		for(NumberGame game: list) {
			if(game.match)
				cnt++;
		}
		System.out.printf("�� %d �� �õ��ؼ� %d �� ������ϴ�.\n", list.size(),cnt);
				
	}
}
