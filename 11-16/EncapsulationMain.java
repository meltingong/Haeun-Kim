
public class EncapsulationMain {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		/*
		 *  encapsulation 객체 멤버 데이터 대입
		 */
		/*
		 * encapsulation.memberField1 = 11; 
		 * encapsulation.memberField2 = true;
		 * encapsulation.memberField3 = 'A'; 
		 * encapsulation.memberField4 = 2.34;
		 */
		encapsulation.setMemberField1(11);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('A');
		encapsulation.setMemberField4(2.34);
		/*
		 *  encapsulation 객체 멤버 데이터 출력
		 */
		/*System.out.println(encapsulation.memberField1);
		System.out.println(encapsulation.memberField2);
		System.out.println(encapsulation.memberField3);
		System.out.println(encapsulation.memberField4);
		*/
		System.out.println(encapsulation.getMemberField1());
		System.out.println(encapsulation.getMemberField2());
		System.out.println(encapsulation.getMemberField3());
		System.out.println(encapsulation.getMemberField4());
	}

}
