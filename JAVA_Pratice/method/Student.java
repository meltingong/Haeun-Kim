package com.itwill01.method;

public class Student {
	/*
	 * << 속성(멤버변수)   >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
	 * << 기능(멤버메쏘드) >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */
	int no,kor,eng,math,tot,rank;
	String name;
	char grade;
	double avg;
	// 멤버메쏘드 선언
	/*
	 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
	*/
	void setBasicData(int no, String name,int kor, int eng, int math) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	/*
	 * 총점계산메쏘드
	 */
	void total() {
		this.tot = this.kor + this.eng + this.math;
	}
	/*
	 * 평균계산메쏘드
	 */
	void average() {
		this.avg = ((double)this.tot)/3;
	}
	/*
	 * 평점계산메쏘드
	 */
	void gr() {
		if(this.avg >=90 && this.avg <=100) {
			this.grade = 'A';
		}else if (this.avg >=80 && this.avg <90) {
			this.grade = 'B';
		}else if (this.avg >=70 && this.avg <80) {
			this.grade = 'C';
		}else if (this.avg >=60 && this.avg <70) {
			this.grade = 'D';
		}else {
			this.grade = 'F';
		}
	}
	/*
	 * 출력메쏘드
	 */
	void header() {
		System.out.printf("========================출력========================\n");
		System.out.printf("%s %s %3s  %s  %s  %s  %s  %s  %s \n","번호","이름","국어","영어","수학","총점","평균","평점","석차");
		System.out.printf("----------------------------------------------------\n");
	}
	void output() {
		System.out.printf("%d %5s %4d  %4d  %4d  %5d  %.1f   %s     %d \n", this.no,this.name,this.kor,this.eng,this.math,this.tot,this.avg,this.grade,this.rank);
	}
	
	
	
}
