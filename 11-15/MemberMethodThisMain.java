
public class MemberMethodThisMain {

	public static void main(String[] args) {
		
		MemberMethodThis mmt1 = new MemberMethodThis();
		mmt1.memberField1 = 1;
		mmt1.memberField2 = 'A';
		mmt1.memberField3 = 95.4;
		
		
		/* ***********case1**********
		 * MemberMethodThis객체 내용출력
		 
		System.out.println(
				mmt1.memberField1+"\t"+
				mmt1.memberField2+"\t"+
				mmt1.memberField3 );
		*/
		/************case2************
		 * MemberMethodThis객체 내용출력 메쏘드 호출
		 */
		System.out.println("main block---> mmt1주소값 : "+mmt1);
		mmt1.print();
		
		
	}

}
