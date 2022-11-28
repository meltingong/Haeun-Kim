
public class FinalFieldClassMain {

	public static void main(String[] args) {
		
		System.out.println("-----------------ffc1--------------");
		FinalFeildClass ffc1 = new FinalFeildClass();
		/*
		 << The final field FinalFeildClass.PORT_NUMBER cannot be assigned >>
			ffc1.PORT_NUMBER = 99;
			ffc1.INCENTIVE_RATE = 2.4;
			FinalFeildClass.PI = 4.5;
			FinalFeildClass.EARTH_RADIUS = 23405;
			Math.PI = 23.4125;
			ffc1.product = new Product(2,"양파링");
		*/
		System.out.println(FinalFeildClass.product.toString());
		System.out.println(ffc1.PORT_NUMBER);
		System.out.println(ffc1.INCENTIVE_RATE);
		System.out.println(FinalFeildClass.PI);
		System.out.println(FinalFeildClass.EARTH_RADIUS);
		System.out.println(Math.PI);
		System.out.println("-----------------ffc2--------------");
		FinalFeildClass ffc2 = new FinalFeildClass();
		System.out.println(ffc2.PORT_NUMBER);
		System.out.println(ffc2.INCENTIVE_RATE);
		
	}

}
