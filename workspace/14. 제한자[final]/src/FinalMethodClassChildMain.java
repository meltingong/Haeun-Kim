
public class FinalMethodClassChildMain {

	public static void main(String[] args) {
		
		FinalMethodClassChild fmcc = new FinalMethodClassChild();
		fmcc.method1();
		fmcc.method2();
		
		FinalMethodClass fmc = new FinalMethodClassChild();
		fmc.method1();
		fmc.method2();
		
	}

}
