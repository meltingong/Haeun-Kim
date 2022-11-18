/*
		논리연산자
		   - 형태:   ||(Logical OR) , && (Logical AND) ( |,& )
		   - 좌우측의항이 논리형변수(데이타)이다.
           - 결과도 논리형데이타이다.
		    ex> true || false, false && false

*/
public class OperatorLogical {

	public static void main(String[] args) {
		boolean b1,b2,b3,b4;
		boolean result;
		b1 = true;
		b2 = true;
		b3 = false;
		b4 = false;
		/*
		 * 논리합(logical or) ||
		 * 	--> false || false 인 경우에만 false를 반환
		 */
		result = b1 || b2;
		System.out.println("true || true --> " +result);
		result = b1 || b3;
		System.out.println("true || fals --> " +result);
		result = b3 || b1;
		System.out.println("false || true --> " +result);
		result = b3 || b4;
		System.out.println("false || false --> " +result);
		/*
		 * 논리곱(logical and) &&
		 * 	 --> true || true 인 경우에만 true를 반환
		 */
		result = b1 && b2;
		System.out.println("true && true --> " + result);
		result = b1 && b3;
		System.out.println("true && false --> " + result);
		result = b3 && b1;
		System.out.println("false && true --> " + result);
		result = b3 && b4;
		System.out.println("false && false --> " + result);
		
		
		int kor = 99;
		int eng = 67;
		
		/*
		 *  kor 정수의 유효성체크[ 0 ~ 100 사이의 정수]
		 */
		boolean condition1 = kor >= 0 ;
		boolean condition2 = kor <= 100;
		
		boolean isValidScore = condition1 && condition2;
		System.out.println("국어점수 유효점수여부 : " +isValidScore);
		
		Boolean condition3 = kor >= 90;
		Boolean condition4 = eng >= 90;

		System.out.println("--- A대학  국어점수가 90점이상이거나 영어점수가 90점이상이면 합격 ---");
		boolean isPass1 = condition3 || condition4;
		System.out.println("A대학 합격여부 : " + isPass1);
		System.out.println("--- B대학  국어, 영어점수가 모두 90점이상이면 합격 ---");
		boolean isPass2 = condition3 && condition4;
		System.out.println("B대학 합격여부 : " + isPass2);
		
		int math = 89;	
		boolean isValidMathScore = (math >= 0) && (math <=100);
		System.out.println("수학점수의 유효성여부 : " + isValidMathScore);
		boolean isInvalidMathScore = (math < 0) || (math > 100) ;
		System.out.println("수학점수의 유효하지 않은지 여부 : " + isInvalidMathScore);
		System.out.println("------배수판별------");
		
		int number = 12;
		
		boolean isMultiple3 = number % 3 == 0;
		System.out.println("3의 배수 여부 : " + isMultiple3);
		boolean isMultiple4 = number % 4 == 0;
		System.out.println("4의 배수 여부 : " + isMultiple4);
		
		boolean isMultiple34 = isMultiple3 && isMultiple4 ;
		System.out.println("3의 배수이면서 4의 배수여부(공배수) :" + isMultiple34);
		/*
		 * Quiz 윤년여부판단
		 * 	- 4의 배수 ( 4로 나누어떨어지는 수 ) 이면서 100의 배수가 아닌수 (100로 나누어떨어지지 않는 수 ) 이거나
		 * 	- 400의 배수 (400으로 나누어 떨어지는 수 )
		 */
		int year = 1992;
		
		boolean isMultipleFour = year % 4 == 0;
		boolean isMultiple100 = year % 100 != 0;
		boolean isMultiple400 = year % 400 == 0;
		
		boolean isLeapYear = isMultipleFour && isMultiple100 || isMultiple400;
		
		System.out.println(year + "의 윤년여부 : " +isLeapYear);
		System.out.println("===============문자연산================");
		char c = '야';
		
		boolean isHanguel = c >= '가' && c <= '힣';
		System.out.println("한글여부 : " + isHanguel);
		
		
		
		
	}

}
