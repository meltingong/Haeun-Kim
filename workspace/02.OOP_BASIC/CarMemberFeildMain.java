
public class CarMemberFeildMain {

	public static void main(String[] args) {
		/*
		 * 주차관리 프로그램
		 */
		/*
		 * 1. 차량번호 서울 마1234 차량 12시 입차
		 */
		Car car1; 			// 차 객체의 주소값을 저장할 Car타입 참조(주소)변수 선언
		car1 = new Car();	// Car클래스를 사용해서 차 객체를 힙메모리에 생성 후 차객체의 주소값이 car1에 참조(주소)변수 대입
		
		car1.no = "서울 마1234"; // 차 객체(car1)의 멤버필드no에 "서울 마1234"값 대입
		car1.inTime = 12;		 // 차 객체(car1)의 멤버필드inTime에 12값 대입
		/*
		 * 2. car1차량 16시 출차
		 */
		/*
		 *  2-1. 출차시간 대입
		 */
		car1.outTime = 16;		// 차 객체(car1)의 멤버필드outTime에 16값 대입
		
		/*
		 *  2-2. 주차요금 계산
		 */
		car1.fee = (car1.outTime - car1.inTime)*1000;
		/*
		 * 차 객체(car1)의 멤버필드 fee에 
		 * 차객체의 outTime, inTime 멤버필드를 사용해서 주차요금 계산 후 대입
		 */
		
		/*
		 *  2-3. 주차요금 영수증 출력
		 */
		
		System.out.println("-------------------------------------------");
		System.out.printf("%5s    %s   %s   %s \n", "차량번호","입차시간","출차시간","주차요금");
		System.out.println("-------------------------------------------");
		System.out.printf("%s   %d         %d        %d",car1.no,car1.inTime,car1.outTime,car1.fee);
		
	}

}
