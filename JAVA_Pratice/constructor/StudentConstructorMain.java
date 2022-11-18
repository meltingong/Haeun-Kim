package com.itwill02.constructor;

public class StudentConstructorMain {

	public static void main(String[] args) {
		/*
		 학생객체생성(3명)
		  - 1명은 기본생성자사용
			  학생객체기본데이타(번호, 이름, 국어, 영어, 수학) 입력메쏘드호출
		  - 2명은 인자5개 생성자사용
		 */
		Student st1 = new Student();
		st1.setBasicData(1, "철수", 88, 96, 55);
		Student st2 = new Student(2, "유리", 67, 87, 95);
		Student st3 = new Student(3, "맹구", 75, 90, 78);
		/*
		 학생총점계산 메쏘드 호출(3명)
		 학생평균계산 메쏘드 호출(3명)
		 학생평점계산 메쏘드 호출(3명)
		 */
		st1.total();
		st2.total();
		st3.total();
		
		st1.avg();
		st2.avg();
		st3.avg();
		
		st1.grade();
		st2.grade();
		st3.grade();
		/*
		 * 학생데이타 출력메쏘드 호출(3명)
		 */
		st1.print(1);
		st1.print();
		st2.print();
		st3.print();
		/*
		 * 학생 student1 의 이름변경한후(이름변경메쏘드호출후) student1학생객체출력
		 * 학생 student1 의 총점데이타 반환받은후 메인블록에서출력
		 * 학생 student1 의 학점데이타 반환받은후 메인블록에서출력
		 */
		System.out.println(">>>>>>>>>>>>>>>이름변경 및 반환데이터 출력<<<<<<<<<<<<<<<<<");
		st1.setName("짱구");
		st1.print(1);
		st1.print();
		
		st1.getTot();
		System.out.println(" < student1의 총점 >");
		System.out.println(st1.getTot());
		st1.getGrade();
		System.out.println(" < student1의 학점 >");
		System.out.println(st1.getGrade());
		
	}

}
