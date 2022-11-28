
public class FinalFeildClass {
	
	public static final Product product = new Product(1,"새우깡");
	
	public final int PORT_NUMBER = 80;
	public final double INCENTIVE_RATE;
	public static final double PI = 3.141592;
	public static final int EARTH_RADIUS = 6400;
	
	public FinalFeildClass() {
		
		this.INCENTIVE_RATE = 0.1;
		/*
		<< The final field FinalFeildClass.PORT_NUMBER cannot be assigned >>
			this.PORT_NUMBER = 90;
			this.INCENTIVE_RATE = 0.3;
			FinalFeildClass.PI = 5.62;
			FinalFeildClass.EARTH_RADIUS = 4545;
		*/
		
		System.out.println(this.PORT_NUMBER);
		System.out.println(this.INCENTIVE_RATE);
		System.out.println(FinalFeildClass.PI);
		System.out.println(FinalFeildClass.EARTH_RADIUS);
		System.out.println(Math.PI);
		
	}
	
	
	
	
}
