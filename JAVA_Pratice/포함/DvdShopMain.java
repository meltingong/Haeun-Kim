package com.itwill03.포함;

public class DvdShopMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		DvdMember member1 = new DvdMember();
		member1.setNo(4567);
		member1.setName("유리");
		member1.setPhoneNumber("010-1234-5678");
		/*
		 * Dvd객체생성
		 */
		Dvd d1 = new Dvd();
		d1.setNo(35);
		d1.setTitle("닥터스트레인지");
		d1.setGenre("액션");
		/*
		 * 회원이Dvd을 대여
		 * 
		 * Dvd객체참조변수를 회원의 멤버변수에대입
		 */
		member1.setRentDvd(d1);
		
		/*
		 * 회원정보출력(회원이빌린Dvd정보출력)
		 */
		member1.headerPrint();
		member1.print();
		System.out.println("=====dvd정보=====");
		member1.getRentDvd().print();
		
	}

}
