package com.itwill00.variable;

public class StudentPrint {

	public static void main(String[] args) {
		//변수선언
		int no1, no2;
		String name1, name2;
		int korScore1, korScore2, engScore1, engScore2, mathScore1, mathScore2;
		double total1, total2;
		double avg1, avg2, avg3, avg4;
		char grade1, grade2;
		int rank1, rank2;
		
		//변수대입
		no1 = 1;
		no2 = 2;
		name1 = "김경호";
		name2 = "김경수";
		korScore1 = 42;
		korScore2 = 45;
		engScore1 = 56;
		engScore2 = 53;
		mathScore1 = 99;
		mathScore2 = 80;
		total1 = korScore1 + engScore1 + mathScore1;
		total2 = korScore2 + engScore2 + mathScore2;
		avg1 = total1/3;
		avg2 = total2/3;
		grade1 = 'A';
		grade2 = 'A';
		rank1 = 0;
		rank2 = 0;
		
		//출력포멧
		System.out.println("=========================학생 성적출력=========================");
		System.out.println(" 학번   이름    국어   영어   수학   총점   평균   평점   석차  ");
		System.out.println("---------------------------------------------------------------");
		System.out.printf("  %d    %s    %d     %d    %d     %.1f    %.2f    %c    %d  \n", no1, name1, korScore1, engScore1, mathScore1, total1, avg1, grade1, rank1);
		System.out.printf("  %d    %s    %d     %d    %d     %.1f    %.2f    %c    %d  \n", no2, name2, korScore2, engScore2, mathScore2, total2, avg2, grade2, rank2);
		System.out.println("================================================================ \n");
		
		//반올림
		System.out.println("<반올림>");
		avg3 = (int)(((total1/3)*10)+5)/10;
		System.out.println(avg3);
		avg4 = (int)(((total2/3)*10)+5)/10;
		System.out.println(avg4);
		
		
		
	}

}
