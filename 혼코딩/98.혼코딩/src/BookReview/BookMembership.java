package BookReview;

public class BookMembership {
	private String name; 		//	회원 이름
	private String id;			//	회원 아이디
	private String pw;			//	회원 비밀번호
	private String tel;			// 	회원 핸드폰번호
	
	public BookMembership() {
		
	}
	
	public BookMembership(String name, String id, String pw, String tel) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.tel = tel;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	
	
	
}
