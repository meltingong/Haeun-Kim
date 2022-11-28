
public class Whale implements Mammaila{

	@Override
	public void operation1() {
		
	}

	@Override
	public void operation2() {
		
	}

	@Override
	public void operation3() {
		
	}
	
	public static void main(String[] args) {
		Whale whale = new Whale();
		whale.operation1();
		whale.operation2();
		whale.operation3();
		Mammaila mermmaila = whale;
		mermmaila.operation1();
		mermmaila.operation2();
		mermmaila.operation3();
	}

}
