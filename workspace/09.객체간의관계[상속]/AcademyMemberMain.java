
public class AcademyMemberMain {

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
		AcademyStaff   sf2 = new AcademyStaff(5, "Lee", "취업팀"); 
		
		System.out.println("----------Student----------");
		
		st1.studentPrint();
		st2.studentPrint();
		
		System.out.println("----------Gansa----------");
		gs1.gansaPrint();
		gs2.gansaPrint();
		
		System.out.println("----------Staff----------");
		sf1.staffPrint();
		sf2.staffPrint();
		
		
		
	}

}
