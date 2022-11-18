package com.itwill01.method;

public class BMain {

	public static void main(String[] args) {
		/*
		 * 2.BMain 이라는 이름의 클래스작성 
		 * 2-1.BMain 클래스에 메인메쏘드 작성(생성) 
		 * 2-1-1.메인메쏘드에 코드작성 - B객체생성 -
		 * B객체멤버변수2개(x,y)에 값대입 - B객체멤버변수2개의 값출력 
		 * - B객체멤버메쏘드2개호출(m1,m2)
		 */
		
		B b1 = new B();
		b1.x = 25;
		b1.y = 50;
		
		System.out.println(b1.x);
		System.out.println(b1.y);
		
		b1.m1();
		b1.m2();
	}

}
