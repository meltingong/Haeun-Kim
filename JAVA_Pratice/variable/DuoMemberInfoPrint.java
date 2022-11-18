package com.itwill00.variable;

public class DuoMemberInfoPrint {

	public static void main(String[] args) {
		System.out.println("*********************");
		String str1, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11;
		str1 = "회원번호";
		str2 = "이    름";
		str3 = "주민번호";
		str4 = "성    별";
		str5 = "결혼횟수";
		str6 = "흡연여부";
		str7 = "키      ";
		str8 = "학    점";
		str9 = "용    모";
		str10 ="김하은";
		str11 = "상(중)";
				
		int i1,i2;
		i1 = 1234556;
		i2 = 0;
		
		double d1;
		d1 = 168.6;
		
		char gender;
		gender = 'F';
		char a;
		a = ':';
		char score;
		score = 'A';
		
		boolean bool1;
		bool1 = false;
		
		String membernumber = str1 + a + i1;
		String name = str2 + a + str10;
		System.out.println(membernumber);
		System.out.println(name);
		System.out.println(str3 + a +"951210-123546");
		System.out.println(str4 + a + gender);
		System.out.println(str5 + a + i2);
		System.out.println(str6 + a + bool1);
		System.out.println(str7 + a + d1);
		System.out.println(str8 + a + score);
		System.out.println(str9 + a + str11);
		
		System.out.println("*********************");
	}

}