
public class AbstractParentChildMain {

	public static void main(String[] args) {
		/* 부모클래스 객체를 생성하지 못하게 막기위해서는 추상클래스를 만들어야함
		 * << Cannot instantiate the type AbstractClassParent >>
		AbstractClassParent acp = new AbstractClassParent();
		*/
		AbstractClassChild acc1 = new AbstractClassChild();
		acc1.method1();
		acc1.method2();
		
		AbstractClassParent acc2 = new AbstractClassChild();
		acc2.method1();
		acc2.method2();
		
		
	}
}
