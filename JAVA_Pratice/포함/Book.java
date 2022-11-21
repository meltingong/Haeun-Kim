package com.itwill03.포함;

public class Book {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  책번호
	 *  책제목
	 *  책분류
	 *  책설명
	 */ 
	private int no;				// 책번호
	private String title;		// 책제목
	private String category;	// 책분류
	private String des;			// 책설명
	 /* <<기능>>
	 *   책정보출력
	 *   
	 */
	public Book() {
			
	}
	public Book(int no, String title, String category, String des) {
		this.no = no;
		this.title = title;
		this.category = category;
		this.des = des;
	}
	
	public void print() {
		System.out.println(this.no + "\t" + this.title + "\t" + this.category + "\t" + this.des);
	}
	
	
	public int getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	public String getCategory() {
		return category;
	}
	public String getDes() {
		return des;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setDes(String des) {
		this.des = des;
	}
	
}
