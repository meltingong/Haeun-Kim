/*
 * 	계좌객체를 생성하기 위한 클래스(틀,타입)
 */
public class Account {
	/*
	 * 	1. 속성[멤버필드(변수)]
	 */
	
	private int no;			// 계좌번호
	private String owner; 	// 계좌주 이름
	private int balance; 	// 계좌잔고
	private double iyul;	// 이율
	
	public Account() {
		
	}
	
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}


	/*
	 * 	2. 기능[멤버메쏘드] - 계좌객체가 가지고 있는 기능
	 */
	/*
	 * 계좌데이터를 초기값으로 대입하는 메소드
	 */
	public void setAccountData(int no,String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
	/*
	 * 입금
	 */
	public void deposit(int money) {
		this.balance += money;
	}
	
	/*
	 * 출금
	 */
	public void withDraw(int money) {
		this.balance -= money;
	}
	/*
	 * 계좌 헤더 출력
	 */
	public static void headerPrint() {
		System.out.println("==============계좌정보==============");
		System.out.printf(" %s      %s    %s    %4s   %n", "번호", "이름", "잔고", "이율");
		System.out.println("------------------------------------");
	}
	/*
	 * 계좌객체 정보출력
	 */
	public void print() {
		System.out.printf(" %d      %s    %5d       %.1f \n", this.no, this.owner, this.balance, this.iyul);
	}
	public int getNo() {
		return no;
	}
	public String getOwner() {
		return owner;
	}
	public int getBalance() {
		return balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}

	/*
	 * public void setBalance(int balance) { 
			this.balance = balance; 
		}
	 */
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	
	
	
	
}
