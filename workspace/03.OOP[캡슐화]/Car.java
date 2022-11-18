/*
 * 1. 주차장에서 차 객체를 생성할 클래스(틀)
 * 2. Car객체의 주소를 저장할 수 있는 타입
 */
public class Car {
	/*
	 * 클래스의 구성요소
	 *  1. 멤버필드(변수)[속성] : 
	 *  2. 멤버메쏘드[기능]
	 */
	/*
	 * 멤버필드[속성]
	 */
	private String no; 	// 차량번호
	private int inTime; 	// 입차시간
	private int outTime; 	// 출차시간
	private int fee; 		// 주차요금
	/*
	 * 멤버메쏘드[기능]
	 */
	/*
	 * 입차 시 데이터 (번호, 입차시간)
	 */
	public void setIn(String no,int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	/*
	 * 출차시간 멤버필드outTime에 출차시간 데이터 대입
	 */
	public void setOut(int outTime) {
		this.outTime = outTime;
	}
	/*
	 * 요금 계산
	 */
	public void calculateFee() {
		this.fee = (this.outTime - this.inTime)*1000;
	}
	/*
	 * 차량정보출력
	 */
	public void print() {
		System.out.println("-------------------------------------------");
		System.out.printf("%5s   %3s   %3s   %5s \n", "차량번호","입차시간","출차시간","주차요금");
		System.out.println("-------------------------------------------");
		System.out.printf("%s    %d         %d         %d",this.no,this.inTime,this.outTime,this.fee);
	}
	
	
	/*
	 * setter,getter 메소드 자동생성 단축키
	 * alt + shift + s --> r
	 */
	public String getNo() {
		return no;
	}
	public int getInTime() {
		return inTime;
	}
	public int getOutTime() {
		return outTime;
	}
	public int getFee() {
		return fee;
	}
	public void setNo(String no) {
		this.no = no;
	}
	public void setInTime(int inTime) {
		this.inTime = inTime;
	}
	public void setOutTime(int outTime) {
		this.outTime = outTime;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	
	
}
