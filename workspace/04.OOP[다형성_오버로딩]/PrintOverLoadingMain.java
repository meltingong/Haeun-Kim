
public class PrintOverLoadingMain {

	public static void main(String[] args) {
		Print p = new Print();
		p.print(1);
		p.print(4, 5);
		p.print(5, 4, 15);
		
		p.print(false);
		p.print(213);
		p.print("맹구");
		p.print('A');
		p.print(23.4);
		p.print(123456);
		
		System.out.print(1);
		System.out.print("수업끝");
		System.out.print(45.890);
		
	}
}
