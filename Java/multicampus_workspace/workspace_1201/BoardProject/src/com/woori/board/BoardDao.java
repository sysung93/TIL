package com.woori.board;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardDao {
	Scanner sc = new Scanner(System.in);
	List<BoardDto> boardList = new ArrayList<BoardDto>();
	
	public BoardDao() {
		boardList.add(new BoardDto(1, "����1", "����1", "�ۼ���1"));
		boardList.add(new BoardDto(2, "����2", "����2", "�ۼ���2"));
		boardList.add(new BoardDto(3, "����3", "����3", "�ۼ���3"));
		boardList.add(new BoardDto(4, "����4", "����4", "�ۼ���4"));
		boardList.add(new BoardDto(5, "����5", "����5", "�ۼ���5"));	
	}
	
	void output() {
		for(BoardDto board : boardList) {
			System.out.printf("%d\t",board.getId());
			System.out.printf("%s\t",board.getTitle());
			System.out.printf("%s\t",board.getContents());
			System.out.printf("%s\t",board.getWriter());
			System.out.printf("%d\t",board.getHit());
			System.out.printf("%s\n",board.getWdate());
			
		}
	}
	
	public void append() {
		int id = boardList.size() + 1;
		
		String title = "";
		String contents ="";
		String writer = "";
		sc.nextLine(); // ���ۿ� ���� �������� \n ����� 
		
		System.out.print("����");
		title = sc.nextLine();
		System.out.print("����");
		contents = sc.nextLine();
		System.out.print("�ۼ���");
		writer = sc.nextLine();
		
		BoardDto dto = new BoardDto(id, title, contents, writer);
		// dto ������ ������� ��ü �ּҴ� boardList �ȿ� �����Ѵ�
		boardList.add(dto);
	}
	
	public void menuDisplay() {
		System.out.println("-----------");
		System.out.println("----�޴�----");
		System.out.println("-----------");
		System.out.println("1. �߰�     ");
		System.out.println("2. ���     ");
		System.out.println("3. �˻�     ");
		System.out.println("0. ����     ");
		System.out.println("-----------");
	}
	public void search() {
		String name = "";
		System.out.print("�̸� : ");
		name = sc.next();
		boolean found = false;
		BoardDto findDto = null;
		for(BoardDto dto : boardList) {
			if(dto.getWriter().equals(name)) {
				found = true; //���� �ٲ�鼭 break ������ �߰��� �������Դٴ°� �� ������ ���� �� �� �ִ�.
				findDto = dto;
				break;
			}
		}
		
		if(found) {
			System.out.printf("%d\t",findDto.getId());
			System.out.printf("%s\t",findDto.getTitle());
			System.out.printf("%s\t",findDto.getContents());
			System.out.printf("%s\t",findDto.getWriter());
			System.out.printf("%d\t",findDto.getHit());
			System.out.printf("%s\n",findDto.getWdate());
		} else {
			System.out.printf("%s is not found\n", name);
		}
		
	}
	public void start() {
		while(true) {
			menuDisplay();
			System.out.print("����: ");
			int menu = sc.nextInt();
			switch(menu) {
				case 1 : append(); break;
				case 2 : output(); break;
				case 3 : search(); break;
				case 0 : System.out.println("���α׷��� �����մϴ�.");
						return;
				default : System.out.println("��");
			}
		}
	}
}
