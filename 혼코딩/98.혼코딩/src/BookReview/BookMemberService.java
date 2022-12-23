package BookReview;

public class BookMemberService {
	private BookMembership[] members = {new BookMembership("철수","ch123","ch123*","01045869874"),
										new BookMembership("유리","yuri99","yuri99*","01054267894")
										};
	
	
	public void idCorrect(BookMembership newMember) {
		char[] c1 = newMember.getId().toCharArray();
		for(int i = 0; i < c1.length; i++) {
			if(c1[i] >= 'a' && c1[i] <= 'z' || c1[i] >= 0 && c1[i] <=9) {
				for(int j = 0; j < members.length; j++) {
					if(members[j] != null && members[j].getId().equals(newMember.getId()) ) {
						System.out.println("중복된 아이디 입니다.");
					}else if(!members[j].getId().equals(newMember.getId())) {
						System.out.println("사용할 수 있는 아이디 입니다.");
				}else {
					System.out.println("아이디는 소문자+숫자 조합으로만 가능합니다");
				}
			}
		}
		
	}
		
} //회원가입시 소문자 + 숫자형태의 아이디를 사용했는지 및 기존에 있는 아이디인지 검사 
	
	private void idSlCorrect(BookMembership newMember) {
		char[] c = newMember.getId().toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c[i] >= 'a' && c[i] <= 'z') {
				
			}
		}		
	}
	
	private void idNoCorrect(BookMembership newMember) {
		char[] c = newMember.getId().toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c[i] >= 0 && c[i] <=9) {
				
			}
		}
	}
	
	
	
	
	
	
	
	public void pwCorrect(BookMembership newMember) {
		char[] c = newMember.getPw().toCharArray();
		for(int i = 0; i < c.length; i++) {
			if(c[i] >='A' && c[i] <= 'z' || c[i] >= 'a' && c[i] <= 'z' || c[i] >= 0 && c[i] <=9 ) {
				
			}
		}
		
	} //회원가입시 소문자+대문자+특수문자의 조합으로 비밀번호를 설정하였는지
	
	public void addMember(BookMembership newMember) {
		BookMembership[] temp = new BookMembership [members.length+1];
		for(int i = 0; i < members.length; i++) {
			temp[i] = members[i];
		}
		for(int j = 0; j < temp.length; j++) {
			if(temp[j] == null) {
				temp[j] = newMember;
				
			}
			members = temp;
		}
	} //멤버추가 (회원가입)
	
	
	
	
}
