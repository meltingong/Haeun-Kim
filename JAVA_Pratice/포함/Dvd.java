package com.itwill03.포함;

public class Dvd {
	/*
	 * - 캡슐화하세요
	 * - 생성자를 정의하세요
	 * 
	 * <<속성>>
	 *  번호
		타이틀
		쟝르
	 */
	private int no;		//dvd번호
	private String title; //dvd제목
	private String genre; //dvd장르
	
	public Dvd() {
	
	}
	public Dvd(int no, String title, String genre) {
		this.no = no;
		this.title = title;
		this.genre = genre;
	}
	 /* <<기능>>
		 *   Dvd정보출력
		 *   
	 */
	public void print() {
		System.out.print("\t   " + this.no + "\t" + this.title + "\t" + this.genre);
	}
	
	public int getNo() {
		return no;
	}
	public String getTitle() {
		return title;
	}
	public String getGenre() {
		return genre;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	
}
