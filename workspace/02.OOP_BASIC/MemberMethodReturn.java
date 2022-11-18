
public class MemberMethodReturn {
	/*
	 *  멤버필드
	 *  	- 멤버필드선언 시 값을 대입할 수 있다.
	 */
	int memberField1 = 10;
	int memberField2 = 20;
	int memberField3 = 30;
	/*
	 * setter method
	 */
	void setMemberField1(int memberField1) {
		this.memberField1 = memberField1;
	}

	void setMemberField2(int memberField2) {
		this.memberField2 = memberField2;
	}

	void setMemberField3(int memberField3) {
		this.memberField3 = memberField3;
	}

	
	/*
	 * getter method
	 */
	int getMemberField1() {
		return memberField1;
	}

	int getMemberField2() {
		return memberField2;
	}

	int getMemberField3() {
		return memberField3;
	}
	
	/*
	 *  멤버메소드
	 */
	int method1() {
		System.out.println("\t----int method1()실행----");
		int result = 234 + 7546;
		System.out.println("\t----int method1()실행종료 후 int데이터 반환----");
		/*
		 return <<호출한 클래스(객체)에게 반환할 값(변수,리터럴,연산의 결과)>>
		 	- 호출한 곳으로 실행흐름을 반환
		 	- 호출한 곳으로 데이터 반환
		 	- 반환할 데이터가 없는 경우에는(void) 	  return문 생략 가능하다.
		 	- 반환할 데이터가 있는 경우에는(int...등) return문 생략 불가능하다.
		 
		 */
		return result;
	}
	
	boolean method2() {
		System.out.println("\t---boolean method2()실행---");
		boolean isMarried = false;
		System.out.println("\t---boolean method2()종료 후 boolean 데이터 반환---");
		return isMarried;
	}
	
	/*
	 *  두개의 정수를 파라메타로 받아서 더한결과를 반환하는 메소드
	 */
	int add(int a, int b) {
		System.out.println("---int add()실행---");
		int result = a + b;
		System.out.println("---int add()종료 후 int 데이터 반환---");
		return result;
	}
	



	String hello(String name) {
		String msg = "";
		msg = name +"님 안녕하세요";
		return msg;
	}
	
	
	
	
	
	
}
