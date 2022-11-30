package nogeneric;
/*
 * 1. 주차장에서 차 객체를 생성할 클래스(틀)
 * 2. Car객체의 주소를 저장할 수 있는 타입
 */
/**
 * 주차장에서 차 객체를 생성할 클래스
 * 
 * @author KIM
 * @version 1.0
 * 
 *
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
	 * 생성자메소드[초기화]
	 */
	/*
	 * 멤버필드의 기본값을 가진 차 객체 생성
	 */
	/**
	 * 기본초기값을 가진 차객체 새성
	 */
	public Car() {
		
	}
	/*
	 *  차량번호, 입차시간을 포함한 차 객체 생성
	 */
	/**
	 * 입차데이터로 초기화된 차량객체생성
	 * @param no		차량번호
	 * @param inTime	입차시간
	 */
	public Car(String no, int inTime) {
		this.no = no;
		this.inTime = inTime;
	}
	/*
	 * 차량 멤버데이터를 인자로 받아서 멤버필드의 값을 가진 차 객체 생성 
	 */
	/**
	 * 매개변수로 초기화된 차량객체 생성
	 * @param no		차량번호
	 * @param inTime	입차시간
	 * @param outTime	출차시간
	 * @param fee		주차요금
	 */
	public Car(String no, int inTime, int outTime, int fee) {
		this.no = no;
		this.inTime = inTime;
		this.outTime = outTime;
		this.fee = fee;
	}
	
	/*
	 * 멤버메쏘드[기능]
	 */
	
	/*
	 * 입차 시 데이터 (번호, 입차시간)
	 */
	/**
	 * 입차시 입차데이터 대입메소드
	 * @param no		차량번호
	 * @param inTime	입차시간
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
	/**
	 * 주차요금계산 메소드
	 */
	public void calculateFee() {
		this.fee = (this.outTime - this.inTime)*1000;
	}
	/*
	 * 헤더 정보출력
	 */
	public static void header() {
		System.out.println("-------------------------------------------");
		System.out.printf("%5s   %3s   %3s   %5s \n", "차량번호","입차시간","출차시간","주차요금");
		System.out.println("-------------------------------------------");
	}
	/*
	 * 차량정보출력
	 */
	public void print() {
		System.out.printf("%6s      %3d          %3d        %6d\n",this.no,this.inTime,this.outTime,this.fee);
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
	/**
	 * 
	 * @return	주차요금
	 */
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
	@Override
	public String toString() {
		return "Car [no=" + no + ", inTime=" + inTime + ", outTime=" + outTime + ", fee=" + fee + "]";
	}
	
	
	
}
