package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		/*
		 * String객체의 생성
		 * 	1. 생성자 호출 (명시적생성)
		 * 	2. ""로 생성   (암시적생성)
		 */
		String name1 = new String("KIM");
		String name2 = new String("KIM");
		String name3 = "KIM";
		String name4 = "KIM";
		// "KIM"자체로도 객체 > 예를들어 Account accounts = new Account(); 로 accounts객체 생성하지만 String은 String자체로 클래스 이기때문에 바로 대입하면
		//  대입한 문자열 자체가 객체가 됨
		
		
		
		
		System.out.println("-------------String객체내용 비교는 equals메소드를 사용하여야 합니다------------");
		/*
		 << public boolean equals(String otherString) >>
		 */
		if(name1.equals(name2)) {
			System.out.println("name1객체의 문자열과 name2객체의 문자열이 동일하다");
		}
		if(name1.equals(name3)) {
			System.out.println("name1객체의 문자열과 name2객체의 문자열이 동일하다");
		}
		if(name3.equals(name4)) {
			System.out.println("name3객체의 문자열과 name4객체의 문자열이 동일하다");
		}
		if(name1.equals("KIM")) {
			System.out.println("name1객체의 문자열과 \"KIM\"객체의 문자열이 동일하다");
		}
		if("KIM".equals("KIM")) {
			System.out.println("\"KIM\"객체의 문자열과 \"KIM\"객체의 문자열이 동일하다");
			
		}
	}

}
