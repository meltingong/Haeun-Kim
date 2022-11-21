package com.itwill03.포함;

public class BookMember {
	/*
	- 캡슐화
	
	<<속성>>
	 회원번호
	 회원이름
	 전화번호
	 빌린책
	*/
	private int no;				// 회원번호
	private String name;			// 회원이름
	private int phoneNumber;	// 회원 전화번호
	private Book rentBook;		// 빌린 책
	/*
	<<기능>>
	  회원정보출력 
	 */
	public BookMember() {
	
	}
	public BookMember(int no, String name, int phoneNumber, Book rentBook) {
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.rentBook = rentBook;
	}
	public void headerPrint() {
		System.out.println("=============================================================================");
		System.out.printf("%6s %6s %6s %6s   %6s    %6s %6s \n", "회원번호","회원이름","회원전화번호","책번호","책제목","책분류","책설명" );
		System.out.println("------------------------------------------------------------------------------");
	}
	public void print() {
		System.out.print("   "+this.no + "\t\t" + this.name + "\t" + this.phoneNumber + "\t\t");
		this.rentBook.print();
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Book getRentBook() {
		return rentBook;
	}
	public void setRentBook(Book rentBook) {
		this.rentBook = rentBook;
	}
	
	
}
