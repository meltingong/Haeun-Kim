package com.itwill03.포함;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember member1 = new BookMember(1234,"철수", 10123, new Book());
		/*
		 * 책객체생성
		 */
		Book book1 = new Book(1,"나미야잡화점","소설","잡화점에서 편지 어쩌구");
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체참조변수를 회원의 멤버변수에대입
		 */
		member1.setRentBook(book1);
		/*
		 * 회원정보출력(회원정보와 회원이 빌린책들 정보출력)
		 */
		member1.headerPrint();
		member1.print();
	}
}
