/*
 * 오버라이딩(재정의)
 *   1. 상속관계에서 발생하는 메쏘드의 재정의 기법이다
 *   2. 자바의 다형성 기법중의하나이다.
 *   
 *   -형태 : 부모클래스에정의 된 메쏘드의 이름,리턴타입,인자가
 *          동일한 메쏘드를 자식클래스에 정의(재정의)하는것
 * 
 *   - ex> public class Super{
 *   			public void print(){
 *   			}		
 *   		}
 *        
 *        public class Sub extends Super{
 *        		public void print(){
 *        		}
 *        }
 * 
 */

class OverridingParent{
	public void method1() {
		System.out.println("OverridingParent.method1()");
	}
	public void method2() {
		System.out.println("OverridingParent.method2()");
	}
	
}


class OverridingChild extends OverridingParent{
	/*
	 <부모로부터 상속받음>
	 * public void method1() {
		System.out.println("OverridingParent.method1()");
		}
	public void method2() {
		System.out.println("OverridingParent.method2()");
		}
	 */
	@Override
	public void method2() {
			System.out.println("------재정의된 method2() start------");
			/*
			 * super
			 * 	- this와 같은 셀프참조변수
			 * 	- this와 같은 주소값이다.
			 * 	- 재정의에 의해 숨겨진 메소드[멤버]를 호출할 때 사용
			 */
			super.method2();	// super 는 this와 똑같지만 재정의되어 숨겨진 부모의 메소드를 호출할 때 사용 
			System.out.println("OverridingChild.method2 추가작업");
			
			System.out.println("------재정의된 method2() end------");
	}
	public void method3() {
		System.out.println("OverridingChild.method3()");
	}
	
	
}



public class OverridingParentChildMain {

	public static void main(String[] args) {
		OverridingChild oc = new OverridingChild();
		oc.method1();
		/*
		 * oc.method2()호출시에는 자식에서 재정의된 메소드 호출
		 */
		oc.method2();
		oc.method3();
		
	}

}
