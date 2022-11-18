
public class CarConstructorMain {

	public static void main(String[] args) {
		System.out.println("********************car1******************");
		Car car1 = new Car();
		car1.setIn("서울 라1234",12);
		car1.setOut(14);
		car1.calculateFee();
		car1.print();
		System.out.println();
		System.out.println("********************car2******************");
		Car car2 = new Car("서울 마1234",15);
		car2.setOut(17);
		car2.calculateFee();
		car2.print();
		System.out.println("*****************오늘 주차장 이용차량 출력**************");
		Car cara = new Car("1234",1,2,1000);
		Car carb = new Car("7892",12,17,5000);
		Car carc = new Car("3400",6,9,3000);
		
		cara.header();
		cara.print();
		carb.print();
		carc.print();
		
	}

}
