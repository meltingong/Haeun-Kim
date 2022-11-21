package com.itwill03.포함;

public class DvdMember {
	/*
	- 캡슐화
	<<속성>>
	회원번호
	회원이름
	전화번호
	빌린dvd
	 */
	private int no;				//회원번호
	private String name;			//회원이름
	private String phoneNumber;	//회원전화번호
	private Dvd rentDvd;	//빌린dvd
	/*
	<<기능>>
	  회원정보출력 
	 */
	public DvdMember() {
		
	}
	public DvdMember(int no, String name, String phoneNumber, Dvd rentDvd) {
		this.no = no;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.rentDvd = rentDvd;
	}
	
	public void headerPrint() {
		System.out.println("=============================================================================");
		System.out.printf("%6s %6s   %6s    %6s  %6s    %6s  \n", "회원번호","회원이름","회원전화번호","dvd번호","dvd제목","dvd분류");
		System.out.println("------------------------------------------------------------------------------");
	}
	
	public void print() {
		System.out.print("  " + this.no + "\t\t" + this.name + "\t" + this.phoneNumber);
		this.rentDvd.print();
	}
	public int getNo() {
		return no;
	}
	public String getName() {
		return name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public Dvd getRentDvd() {
		return rentDvd;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setRentDvd(Dvd rentDvd) {
		this.rentDvd = rentDvd;
	}
	
	
}
