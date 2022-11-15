
public class MemberMethodThis {
	/*
	 * 멤버필드[속성]
	 */
	int memberField1;
	char memberField2;
	double memberField3;
	/*
	 * 멤버메소드[기능]
	 */
	/*
	 * 객체의 멤버필드의 내용을 출력하는 메쏘드
	 */
	void print() {
		/*
		 * this : 
		 * 	- self참조변수
		 * 	- void print()메소드를 가지고 있는 객체의 주소값
		 *  - this는 생략이 가능
		 */
		System.out.println("mmt1.print()메소드 안에서 this :"+this);
		System.out.println(this.memberField1+"\t"+this.memberField2+"\t"+this.memberField3);
		
		
	}
	
	
}
