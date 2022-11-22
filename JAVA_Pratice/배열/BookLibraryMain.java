package com.itwill04.array;

public class BookLibraryMain {

	public static void main(String[] args) {
		/*
		 * 회원객체생성
		 */
		BookMember bookMember=new BookMember(1234,"철수","010-1234-541", null);
		/*
		 * 책객체들생성
		 */
		Book book1=new Book(46372, "책제목1", "문학", "좋은책1");
		Book book2=new Book(46372, "책제목2", "문학", "좋은책2");
		
		/*
		 * 회원이 책들 대여
		 * 
		 * 책객체들 참조변수를 회원의 멤버변수에대입
		 */
		
		/*
		 * 회원정보출력(회원정보와 회원이빌린들책정보출력)
		 */
		bookMember.print();

	}

}
