package javaProject2;

import java.util.ArrayList;

public class BookTest {
	public static void main(String[] args) {
		ArrayList<Book> booklist = new ArrayList<>();
		ArrayList<Magazine> magazinelist = new ArrayList<>();
		
		Book book1 = new Book("B001", "자바 프로그래밍", "홍길동", 25000, 2021, "멀티출판사");
		Book book2 = new Book("B002", "자바 스크립트", "이몽룡", 30000, 2020, "서울출판사");
		Book book3 = new Book("B003", "HTML/CSS", "성춘향", 18000, 2021, "강남출판사");
		
		booklist.add(book1);
		booklist.add(book2);
		booklist.add(book3);
		
		Magazine magazine1 = new Magazine("M001", "자바 월드", "홍길동", 25000, 2021, "멀티출판사", 5);
		Magazine magazine2 = new Magazine("M002", "웹 월드", "이몽룡", 30000, 2020, "서울출판사", 7);
		Magazine magazine3 = new Magazine("M003", "게임 월드", "성춘향", 18000, 2021, "강남출판사", 9);
		
		magazinelist.add(magazine1);
		magazinelist.add(magazine2);
		magazinelist.add(magazine3);
		
		System.out.println("도서번호\t도서명\t\t저자\t가격\t발행일\t출판사 ");
		System.out.println("----------------------------------------------------");
		for(Book book : booklist) {
			System.out.println(book.toString());
		}
		
		System.out.println();
		
		System.out.println("도서번호\t도서명\t발행인\t가격\t발행일\t출판사\t발행일 ");
		System.out.println("----------------------------------------------------");
		for(Magazine magazine : magazinelist) {
			System.out.println(magazine.toString());
		}
		
		
		
	}
}
