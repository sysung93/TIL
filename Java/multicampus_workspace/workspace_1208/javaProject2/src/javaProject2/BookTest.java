package javaProject2;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
		ArrayList<Book> booklist = new ArrayList<>();
		ArrayList<Magazine> magazinelist = new ArrayList<>();
		
		Book book1 = new Book("B001", "�ڹ� ���α׷���", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�");
		Book book2 = new Book("B002", "�ڹ� ��ũ��Ʈ", "�̸���", 30000, 2020, "�������ǻ�");
		Book book3 = new Book("B003", "HTML/CSS", "������", 18000, 2021, "�������ǻ�");
		
		booklist.add(book1);
		booklist.add(book2);
		booklist.add(book3);
		
		Magazine magazine1 = new Magazine("M001", "�ڹ� ����", "ȫ�浿", 25000, 2021, "��Ƽ���ǻ�", 5);
		Magazine magazine2 = new Magazine("M002", "�� ����", "�̸���", 30000, 2020, "�������ǻ�", 7);
		Magazine magazine3 = new Magazine("M003", "���� ����", "������", 18000, 2021, "�������ǻ�", 9);
		
		magazinelist.add(magazine1);
		magazinelist.add(magazine2);
		magazinelist.add(magazine3);
		
		System.out.println("������ȣ\t������\t\t����\t����\t������\t���ǻ� ");
		System.out.println("----------------------------------------------------");
		for(Book book : booklist) {
			System.out.println(book.toString());
		}
		
		System.out.println();
		
		System.out.println("������ȣ\t������\t������\t����\t������\t���ǻ�\t������ ");
		System.out.println("----------------------------------------------------");
		for(Magazine magazine : magazinelist) {
			System.out.println(magazine.toString());
		}
		
		
		
	}
}
