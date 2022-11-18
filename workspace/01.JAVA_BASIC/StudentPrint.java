
public class StudentPrint {

	public static void main(String[] args) {
		//학번 변수선언
		int no1, no2;
		//이름 변수선언
		String name1, name2;
		//과목별 변수선언 
		int korScore1 ,korScore2;
		int engScore1 ,engScore2;
		int mathScore1 ,mathScore2;
		//총점 변수선언
		double total1, total2;
		//평균 변수선언
		double avg1, avg2;
		//평점 변수선언
		char grade1, grade2;
		//석차 변수선언
		int rank1, rank2;
		//학번 대입
		no1 = 1;
		no2 = 2;
		//이름 대입
		name1 = "김경호";
		name2 = "김경수";
		//과목점수 대입
		korScore1 = 42;
		korScore2 = 44;
		engScore1 = 56;
		engScore2 = 53;
		mathScore1 = 78;
		mathScore2 = 48;
		//총점대입
		total1 = korScore1 + engScore1 + mathScore1;
		total2 = korScore2 + engScore2 + mathScore2;
		//평균대입
		avg1 = total1/3;
		avg2 = total2/3;
		//평점대입
		grade1 = 'F';
		grade2 = 'F';
		//석차대입
		rank1 = 0;
		rank2 = 0;
		//출력
		System.out.println("============================학생 성적 출력===========================");
		System.out.println("학번   이름\t 국어\t 영어\t 수학\t 총점\t   평균\t   평점\t 석차");
		System.out.println("---------------------------------------------------------------------");		
		System.out.printf(no1+"     "+ name1+"      " + korScore1+"     " + engScore1+"       " + mathScore1+"     " + total1+"     " + "%.2f" +"     " + grade1+"    " + rank1+ "\n" , avg1);
		System.out.printf(no2+"     "+ name2+"      " + korScore2+"     " + engScore2+"       " + mathScore2+"     " + total2+"     " + "%.2f" +"     " + grade2+"    " + rank2+ "\n", avg2);
		System.out.println("---------------------------------------------------------------------");		
		

	}

}
