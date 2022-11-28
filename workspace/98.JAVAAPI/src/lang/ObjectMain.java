package lang;

public class ObjectMain {

	public static void main(String[] args) {
		/*
		 	<< Object >>
		 	Class Object is the root of the class hierarchy. 
		 	Every class has Object as a superclass. All objects, including arrays, implement the methods of this class.
		 */
		
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 = o1;
		
		String str1 = o1.toString();
		System.out.println(str1);
		
		if(o1.equals(o2)) {
			System.out.println("o1 과 o2의 주소가 동일하다");
		}else {
			System.out.println("o1 과 o2의 주소가 다르다");
		}
		
		if(o1.equals(o3)) {
			System.out.println("o1 과 o3의 주소가 동일하다");
		}else {
			System.out.println("o1 과 o3의 주소가 다르다");
		}
		
		System.out.println("----------------ObjectChild--------------");
		ObjectChild oc1 = new ObjectChild();
		ObjectChild oc2 = new ObjectChild();
		ObjectChild oc3 = oc1;
		System.out.println("---상속받은 Object.equals---");
		if(oc1.equals(oc3)) {
			System.out.println("oc1과 oc3의 주소가 동일하다");
		}
		System.out.println("---상속받은 Object.toString --> 재정의---");
		System.out.println(oc1.toString());
		System.out.println(oc2);
		System.out.println(oc3);
		
		
		
		
	}

}
