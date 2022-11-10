package Practice;

public class StudentScorePrint {

	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언
		 * 	- 번호, 이름, 국어, 영어, 수학, 총점, 평균, 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int no1, no2;
		String name1, name2;
		int korScore1, korScore2, engScore1, engScore2, mathScore1, mathScore2;
		double total1, total2;
		double avg1, avg2;
		String grade1, grade2;
		int rank1, rank2;
	
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력 
		 */
		no1 = 1;
		no2 = 2;
		name1 = "김경호";
		name2 = "김경수";
		korScore1 = 42;
		korScore2 = 45;
		engScore1 = 60;
		engScore2 = 72;
		mathScore1 = 89;
		mathScore2 = 99;
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크
		 *   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if(korScore1 >=0 && korScore1 <=100) {
			System.out.println("유효한 점수");
		}else {
			System.out.println("유효하지 않은 점수");
		}
		if(korScore2 >=0 && korScore2 <=100) {
			System.out.println("유효한 점수");
		}else {
			System.out.println("유효하지 않은 점수");
		}
		if(engScore1 >=0 && engScore1 <=100) {
			System.out.println("유효한 점수");
		}else {
			System.out.println("유효하지 않은 점수");
		}
		if(engScore2 >=0 && engScore2 <=100) {
			System.out.println("유효한 점수");
		}else {
			System.out.println("유효하지 않은 점수");
		}
		if(mathScore1 >=0 && mathScore1 <=100) {
			System.out.println("유효한 점수");
		}else {
			System.out.println("유효하지 않은 점수");
		}
		if(mathScore2 >=0 && mathScore2 <=100) {
			System.out.println("유효한 점수");
		}else {
			System.out.println("유효하지 않은 점수");
		}
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서
		 * 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		 */
		total1 = korScore1 + engScore1 + mathScore1;
		total2 = korScore2 + engScore2 + mathScore2;
		avg1 = total1/3;
		avg2 = total2/3;
		grade1 = "";
		grade2 = "";
		if(avg1 >= 90 && avg1 <= 100) {
			grade1 = "A";
		}else if (avg1 >= 80 && avg1 <= 89) {
			grade1 = "B";
		}else if (avg1 >= 70 && avg1 <= 79) {
			grade1 = "C";
		}else if (avg1 >= 60 && avg1 <= 69) {
			grade1 = "D";
		}else { 
			grade1 = "F";
		}
		
		if(avg2 >= 90 && avg2 <= 100) {
			grade2 = "A";
		}else if (avg2 >= 80 && avg2 <= 89) {
			grade2 = "B";
		}else if (avg2 >= 70 && avg2 <= 79) {
			grade2 = "C";
		}else if (avg2 >= 60 && avg2 <= 69) {
			grade2 = "D";
		}else { 
			grade2 = "F";
		}
		rank1 = 0;
		rank2 = 0;
		/*
		- 출력포맷
 		- 평균은 소수점이하 첫째자리까지출력(반올림)
 		- 석차는 구하지마세요
		*/
		System.out.println("=========================학생 성적출력==========================");
		System.out.println(" 학번  이름   국어  영어  수학  총점  평균  평점  석차 ");
		System.out.println("----------------------------------------------------------------");
		System.out.printf(" %d    %s    %d   %d    %d  %.1f  %.1f    %s     %d \n", no1, name1, korScore1, engScore1, mathScore1, total1, avg1, grade1, rank1);
		System.out.printf(" %d    %s    %d   %d    %d  %.1f  %.1f    %s     %d \n", no2, name2, korScore2, engScore2, mathScore2, total2, avg2, grade2, rank2);
		System.out.println("================================================================");
		
	}

}
