
public class CarFactoryStaticMain {

	public static void main(String[] args) {
		
		Car car1 = new Car(1,"k3","RED");
		Car car2 = new Car(2,"k5","Green");
		Car car3 = new Car(3,"k7","Blue");
		
		System.out.println("차량 총 생산 대수 : " + Car.count);
		Car.headerPrint();
		car1.print();
		car2.print();
		car3.print();
		
		
		
		
	}

}
