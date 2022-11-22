
public class AcademyMemberMain {

	public static void main(String[] args) {
		// 상속받은 부모 객체 생성하지 말것
		/*
		 * AcademyMember academyMember = new AcademyMember();
		 */
		AcademyStudent st1 = new AcademyStudent(1, "KIM", "LINUX");
		AcademyStudent st2 = new AcademyStudent(2, "KANG", "JAVA");
		System.out.println("----------Student----------");
		st1.studentPrint();
		st2.studentPrint();
		
		
	}

}
