package com.itwill05.service.array.academy;
/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */

public class AcademyMemberService {
	private AcademyMember[] members;
	public static final int STUDENT = 1;
	public static final int GANGSA = 2;
	public static final int STAFF = 3;
	public static final int JAVA =4;
	public static final int SALES = 5;
	
	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}

	/*
	 * 1.AcademyMember 전체출력
	 */
	public void print() {
		for(int i = 0; i < members.length; i++) {
			members[i].print();
		}
	}

	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 * 
	 */
	public AcademyMember member(int no) {
		AcademyMember findMember = null;
		for(int i = 0; i < members.length; i++) {
		if(members[i].getNo() == no) {
			findMember = members[i];
			break;
			}
		}
		return findMember;
	}
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] Kim(String name) {
		int count = 0;
		for(int i = 0 ; i < members.length; i++) {
			if(members[i].getName().equals("KIM")) {
				count++;
			}
		}
		AcademyMember[] findMember = new AcademyMember[count];
		int index = 0;
		for(int i = 0; i < members.length; i++) {
			if(members[i].getName() == name) {
				findMember[index] = members[i];
				index++;
			}
		}
		return findMember;
	}

	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	private AcademyMember[] student() {
		AcademyMember[] findMember = null;
		int stCount = 0;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				stCount++;
			}
		}
		int stIndex = 0;
		findMember = new AcademyMember[stCount];
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				findMember[stIndex] = members[i];
				stIndex++;
			}
		}
		return findMember;
	}
	private AcademyMember[] student(int type) {
		AcademyMember[] findMember = null;
		int stIndex = 0;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
			AcademyStudent temp = (AcademyStudent)members[i];
				if(type == JAVA && temp.getBan().equals("자바")) {
					stIndex++;
				}
			}
		}
		findMember = new AcademyMember[stIndex];
		int a = 0;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
			AcademyStudent temp = (AcademyStudent)members[i];
				if(type == JAVA && temp.getBan().equals("자바")) {
					findMember[a] = members[i];
					a++;
				}
			}
		}
		return findMember;
	}
	private AcademyMember[] gangsa() {
		int gaCount = 0;
		AcademyMember[] findMember = null;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				gaCount++;
			}
		}
		findMember = new AcademyMember[gaCount];
		int gaIndex = 0;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
				findMember[gaIndex] = members[i];
				gaIndex++;
			}
		}
		return findMember;
	}
	private AcademyMember[] gangsa(int type) {
		int gaIndex = 0;
		AcademyMember[] findMember = null;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
			AcademyGangsa temp = (AcademyGangsa)members[i];
				if(type == JAVA && temp.subject.equals("자바")) {
					gaIndex++;
				}
			}
		}
		findMember = new AcademyMember[gaIndex];
		int b = 0;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyGangsa) {
			AcademyGangsa temp = (AcademyGangsa)members[i];
				if(type == JAVA && temp.subject.equals("자바")) {
					findMember[b] = members[i];
					b++;
				}else {
					System.out.println("만족하는 과목이 없습니다");
				}
			}
		}
		return findMember;
	}
	private AcademyMember[] staff() {
		int staffCount = 0;
		AcademyMember[] findMember = null;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				staffCount++;
			}
		}
		findMember = new AcademyMember[staffCount];
		int staffIndex = 0;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				findMember[staffIndex] = members[i];
				staffIndex++;
			}
		}
		return findMember;
	}
	private AcademyMember[] staff(int type) {
		int staffIndex = 0;
		AcademyMember[] findMember = null;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
			AcademyStaff temp = (AcademyStaff)members[i];
				if(type == SALES && temp.getDepart().equals("영업")) {
					staffIndex++;
				}
			}
		}
		findMember = new AcademyMember[staffIndex];
		int c = 0;
		for(int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStaff) {
				AcademyStaff temp = (AcademyStaff)members[i];
				if(type == SALES && temp.getDepart().equals("영업")) {
					findMember[c] = members[i];
					c++;
				}
			}
		}
		return findMember;
	}
	public AcademyMember[] members(int number) {
		AcademyMember[] findMember = null;
		switch(number) {
		case STUDENT :
			 findMember = this.student();
			break;
		case GANGSA :
			 findMember = 	this.gangsa();
			break;
		case STAFF : 
			 findMember = this.staff();
			break;
		}
		return findMember;
	}
	
	// sort처럼 상수 만들어서 하위 클래스가 형성되어도 메소드가 추후에 수정되지 않도록
	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] member(int number, int type) {
		AcademyMember[] findMember = null;
		switch(number) {
		case STUDENT :
			findMember = this.student(type);
			break;
		case GANGSA :
			findMember = this.gangsa(type);
			break;
		case STAFF : 
			findMember = this.staff(type);
			break;
		}
		return findMember;
	}
	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */

 
}

