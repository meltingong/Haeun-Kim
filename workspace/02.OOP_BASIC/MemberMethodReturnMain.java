
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr = new MemberMethodReturn();
		
		int returnData1 = mmr.method1();
		System.out.println("main block -->returnData1: " + returnData1);
		
		boolean returnData2 = mmr.method2();
		System.out.println("main block -->returnData2 :" + returnData2);
		
		int returnData3 = mmr.add(56, 99);
		System.out.println("main block -->returnData3 :" + returnData3);
		System.out.println("main block -->returnData4 : "+ mmr.add(594, 11));
		
		String name = "김경호";
		String returnMessage1 = mmr.hello(name);
		/*
		 * returnMessage1 : 김경호님 안녕하세요
		 */
		System.out.println("main block --> returnMessage1 :" + returnMessage1);
		System.out.println("main block --> returnMessage2 :" + mmr.hello("옹이"));
		System.out.println("****************setter메소드 호출****************");
		mmr.setMemberField1(77777);
		mmr.setMemberField2(88888);
		mmr.setMemberField3(99999);
		
		
		
		System.out.println("****************getter메소드 호출****************");
		System.out.println("--------main block --> memberField값 사용(출력)-------");
		int returnMemberField1 = mmr.getMemberField1();
		System.out.println("returnMemberField1 : "+returnMemberField1);
		System.out.println("returnMemberField1 : "+mmr.getMemberField2());
		System.out.println("returnMemberField1 : "+mmr.getMemberField3());
	
	}

}
