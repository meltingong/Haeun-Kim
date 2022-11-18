package com.itwill01.field;

public class StudentMemberFieldMain {

	public static void main(String[] args) {
		// 학생객체 2명 생성
		Student st1 = new Student();
		Student st2 = new Student();
		
		// 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		st1.number = 1;
		st1.name = "김경호";
		st1.kor = 42;
		st1.eng = 56;
		st1.math = 78;
		
		st2.number = 2;
		st2.name = "김경수";
		st2.kor = 45;
		st2.eng = 53;
		st2.math = 76;
		
		// 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		st1.tot = st1.kor + st1.eng + st1.math;
		st2.tot = st2.kor + st2.eng + st2.math;
		
		st1.avg = (double)st1.tot/3;
		st2.avg = (double)st2.tot/3;
		
		st1.grade = ' ';
		if(st1.avg >= 90 && st1.avg <=100 ) {
			st1.grade = 'A';
		} else if (st1.avg >= 80 && st1.avg <90) {
			st1.grade = 'B';
		} else if (st1.avg >= 70 && st1.avg <80) {
			st1.grade = 'C';
		} else if (st1.avg >= 60 && st1.avg <70) {
			st1.grade = 'D';
		} else {
			st1.grade = 'F';
		}
		st2.grade = ' ';
		if(st2.avg >= 90 && st2.avg <=100 ) {
			st2.grade = 'A';
		} else if (st2.avg >= 80 && st2.avg <90) {
			st2.grade = 'B';
		} else if (st2.avg >= 70 && st2.avg <80) {
			st1.grade = 'C';
		} else if (st2.avg >= 60 && st2.avg <70) {
			st2.grade = 'D';
		} else {
			st2.grade = 'F';
		}
		st1.rank = 3;
		st2.rank = 2;
		
		//학생 데이타를 출력 2명
		
		System.out.printf("========================학생 성적출력========================\n");
		System.out.printf("%2s  %3s  %3s  %s  %s  %s   %s  %s  %s%n" , "학번","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.printf("-------------------------------------------------------------\n");
		System.out.printf("%3d  %4s  %4d  %4d  %4d  %4d   %4.1f  %3c  %4d%n", st1.number,st1.name,st1.kor,st1.eng,st1.math,st1.tot,st1.avg,st1.grade,st1.rank);
		System.out.printf("%3d  %4s  %4d  %4d  %4d  %4d   %4.1f  %3c  %4d%n", st2.number,st2.name,st2.kor,st2.eng,st2.math,st2.tot,st2.avg,st2.grade,st2.rank);
		System.out.printf("==============================================================");
		
		
	}

}