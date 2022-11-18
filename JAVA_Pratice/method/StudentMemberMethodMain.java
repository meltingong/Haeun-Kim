package com.itwill01.method;

public class StudentMemberMethodMain {

	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student();
		Student st3 = new Student();
		// 기본데이터 메소드 호출
		st1.setBasicData(1, "철수", 80, 77, 96);
		st2.setBasicData(2, "짱구", 56, 75, 85);
		st3.setBasicData(3, "유리", 75, 45, 55);
		// 총점 계산 메소드 호출
		st1.total();
		st2.total();
		st3.total();
		// 평균 계산 메소드 호출
		st1.average();
		st2.average();
		st3.average();
		// 평점 계산 메소드 호출
		st1.gr();
		st2.gr();
		st3.gr();
		// 출력 메소드 호출
		st1.header();
		st1.output();
		st2.output();
		st3.output();
		
		
		
		
		
		
	}

}
