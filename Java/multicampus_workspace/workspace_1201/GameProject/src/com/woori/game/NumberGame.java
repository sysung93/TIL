package com.woori.game;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//���� �ѹ� �з�
public class NumberGame {
	int computer;
	ArrayList<Integer> person = new ArrayList<Integer>();
	
	// int ��Ÿ�� Wrapper class ��Ÿ�� > ������ ��ȯ��ų �� �ִ� Ŭ����
	// int�� Ŭ���� Integer
	
	boolean match = false; // ������� ����
	int count = 0;
	
	Scanner sc = new Scanner(System.in);
	
	public NumberGame() {
		super();
		Random rand = new Random();
		computer = rand.nextInt(10) + 1;
	}
	
	public void start() {
		
		while(!match && count < 5) {
			System.out.println("���� : ");
			int temp = sc.nextInt();
			person.add(temp);
			
			if(temp == computer) {
				match = true;
			} else if(temp > computer) {
				System.out.println("���ڰ� Ů�ϴ�");
			} else {
				System.out.println("���ڰ� �۽��ϴ�,");
			}
			count++;
		}
		if(match) {
			System.out.printf("%d ������ ������ϴ�.", count);
		} else {
			System.out.println("�ƽ����� ��ȸ�� �� ����߾��");
		}
		
	}

}
