package com.itwill04.array;

public class BookMember {
	//회원번호
		private int no;
		//회원이름
		private String name;
		//전화번호
		private String phoneNumber;
		//빌린책들
		private Book[] books;
		
		public BookMember() {
			
		}
		public void print() {
			System.out.printf("%d %s %s ", this.no, this.name,this.phoneNumber);
			for(int i = 0; i < books.length; i++) {
				books[i].print();
			}
			
		}
		public BookMember(int no, String name, String phoneNumber, Book[] books) {
			this.no = no;
			this.name = name;
			this.phoneNumber = phoneNumber;
			this.books = books;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
}
