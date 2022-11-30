package com.itwill05.service.array.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		System.out.println("1.AcademyMember 전체출력");
		AcademyMemberService as = new AcademyMemberService();
		as.print();
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		AcademyMember findMember = as.member(1);
		findMember.print();
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		AcademyMember[] findMembers = as.Kim("KIM");
		for(AcademyMember findMember2 : findMembers) {
			findMember2.print();
		}
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		
		System.out.println(
		"4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		findMembers = as.javaBan();
		for(int i = 0; i < findMembers.length; i++) {
			findMembers[i].print();
		}
		System.out.println(
		"4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		System.out.println(
		"4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		System.out.println("---------------------------------------------");
		System.out.println(
				"5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		
	}


	}

