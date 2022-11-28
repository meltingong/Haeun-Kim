
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		// 상속받은 부모 객체 생성하지 말것
				/*
				 * AcademyMember academyMember = new AcademyMember();
				 */
				AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
				AcademyStudent st2 = new AcademyStudent(2, "KANG", "JAVA");
				
				AcademyGangsa  gs1 = new AcademyGangsa(3,"BOGUS","자바");
				AcademyGangsa  gs2 = new AcademyGangsa(4,"HONG","오피스");
				
				AcademyStaff   sf1 = new AcademyStaff(5, "Lee", "영업팀"); 
				AcademyStaff   sf2 = new AcademyStaff(6, "CHA", "취업팀"); 
				
				System.out.println("----------Student----------");
				
				st1.print();
				st2.print();
				
				System.out.println("----------Gansa----------");
				gs1.print();
				gs2.print();
				
				System.out.println("----------Staff----------");
				sf1.print();
				sf2.print();
				
	}

}
