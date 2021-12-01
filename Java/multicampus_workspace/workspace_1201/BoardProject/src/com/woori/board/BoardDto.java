package com.woori.board;

import java.time.LocalDate;

// 데이터 1회분을 저장할 클래스를 만든다.
// 1. 필요로 하는 요소를 주고 private 변수로 선언한다.
public class BoardDto {
	private int id = 0;
	private String title = "";
	private String writer = "";
	private String contents = "";
	private String wdate = "";
	private int hit = 0;

	
	// 2. getter setter를 만든다
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public int getHit() {
		return hit;
	}
	public void setHit(int hit) {
		this.hit = hit;
	}
	
	// 3. 데이터 베이스에서 읽고 쓰기 가능하면 생성자 안만들어도 되지만
	// 기본생성자와 매개변수 생성자를 만들어준다.
	public BoardDto(int id, String title, String writer, String contents) {
		super();
		this.id = id;
		this.title = title;
		this.writer = writer;
		this.contents = contents;
		
		LocalDate localDate = LocalDate.now(); //현재날짜
		this.wdate = localDate.toString(); //모든 클래스는 toString 함수가 다 있다. 그래서 문자열로 변환 가능
		
	}
	public BoardDto() {
		super();
		LocalDate localDate = LocalDate.now(); 
		this.wdate = localDate.toString();
		// TODO Auto-generated constructor stub
	}
	
}
