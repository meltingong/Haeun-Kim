
public class CarMemberMethodMain {

	public static void main(String[] args) {
		/*
		 * 1. 차량번호 서울 마1234 차량 12시 입차
		 */
		Car car1 = new Car();
		car1.setIn("서울 마1234", 12);
		/*
		 *  2-1. 출차시간 대입 메소드 호출
		 */
		car1.setOut(16);
		/*
		 *  2-2. 주차요금계산 메소드 호출
		 */
		car1.calculateFee();
		/*
		 *  2-3. 주차요금 영수증 출력
		 */
		
		car1.print();
		
	}

}
