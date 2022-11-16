package com.itwill00.variable;

public class StudentPrint2 {

	public static void main(String[] args) {
		// 변수선언
		int no1, no2;
		String name1, name2;
		int korScore1 ,korScore2,engScore1 ,engScore2,mathScore1 ,mathScore2;
		double total1, total2;
		double avg1, avg2;
		char grade1, grade2;
		int rank1, rank2;
		//대입
		no1 = 1;
		no2 = 2;
		name1 = "김경호";
		name2 = "김경수";
		korScore1 = 42;
		korScore2 = 44;
		engScore1 = 56;
		engScore2 = 53;
		mathScore1 = 78;
		mathScore2 = 48;
		
		//유효성체크
		System.out.println("------------유효성 체크------------");
		if (korScore1 >= 0 && korScore1 <= 100) {
			System.out.println(korScore1 +"는 유효한 점수입니다.");
		}else {
			System.out.println(korScore1 +"는 유효하지 않은 점수입니다.");
		}
		if (korScore2 >= 0 && korScore2 <= 100) {
			System.out.println(korScore2 +"는 유효한 점수입니다.");
		}else {
			System.out.println(korScore2 +"는 유효하지 않은 점수입니다.");
		}
		if (engScore1 >= 0 && engScore1 <= 100) {
			System.out.println(engScore1 + "는 유효한 점수입니다.");
		}else {
			System.out.println(engScore1 + "는 유효하지 않은 점수입니다.");
		}
		if (engScore2 >= 0&& engScore2 <= 100) {
			System.out.println(engScore2 + "는 유효한 점수입니다.");
		}else {
			System.out.println(engScore2 + "는 유효하지 않은 점수입니다.");
		}
		if (mathScore1 >= 0 && mathScore1 <= 100) {
			System.out.println(mathScore1 + "는 유효한 점수입니다.");
		}else {
			System.out.println(mathScore1 + "는 유효하지 않은 점수입니다.");
		}
		if (mathScore2 >= 0 && mathScore2 <= 100) {
			System.out.println(mathScore2 + "는 유효한 점수입니다.");
		}else {
			System.out.println(mathScore2 + "는 유효하지 않은 점수입니다.");
		}
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		total1 = korScore1 + engScore1 + mathScore1;
		total2 = korScore2 + engScore2 + mathScore2;
		avg1 = total1/3;
		avg2 = total2/3;
		grade1 = ' ';
		grade2 = ' ';
		if(avg1 >= 90 && avg1  <=100) {
			grade1 = 'A';
		}else if (avg1  >= 80 && avg1  <= 89) {
			grade1 = 'B';
		}else if (avg1  >=70 && avg1  <= 79) {
			grade1 = 'C';
		}else if (avg1  >=60 && avg1  <= 69) {
			grade1 = 'D';
		}else {
			grade1 = 'F';
		}
		if(avg2 >= 90 && avg2 <=100) {
			grade2 = 'A';
		}else if (avg2 >= 80 && avg2 <= 89) {
			grade2 = 'B';
		}else if (avg2 >=70 && avg2 <= 79) {
			grade2 = 'C';
		}else if (avg2 >=60 && avg2 <= 69) {
			grade2 = 'D';
		}else {
			grade2 = 'F';
		}
		rank1 = 0;
		rank2 = 0;
		
		System.out.printf("======================학생 성적출력====================\n");
		System.out.printf("%s %3s  %3s  %2s  %2s  %3s  %2s  %2s  %2s\n", "학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-------------------------------------------------------\n");
		System.out.printf("%2d   %3s  %3d   %3d   %3d    %.1f  %.1f   %c     %d\n", no1, name1,korScore1,engScore1, mathScore1, total1, avg1, grade1, rank1);
		System.out.printf("%2d   %3s  %3d   %3d   %3d    %.1f  %.1f   %c     %d\n", no2, name2,korScore2,engScore2, mathScore2, total2, avg2, grade2, rank2);
		System.out.printf("=======================================================");
	
	
	}

}