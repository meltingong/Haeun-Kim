
public class RuntimeExceptionCatchMain1 {
	/*
	 * 모든 메소드는 throws RuntimException구문 생략되어있다
	 * 	- 이 메소드에서는 RuntimException의 자식Exception들이 발생할 수 있다
	 */
	public static void main(String[] args) {
		System.out.println("stmt1");
		String str = null;
		try {
			System.out.println("stmt2");
			/*
			 * 예외발생 예상코드
			 */
			int length = str.length();
			/*
			 1. 예외상황발생하면  NullPointerException객체생성한후 
			    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			 2. 던져진 예외객체는 catch block에 선언된 변수에 대입된다
			 
			 3. 현재실행흐름은 try block 내의 코드를 실행하지 않고 catch block을 실행한다
			 */
			System.out.println(length);
			System.out.println("stmt3");
		}catch(NullPointerException e) {
			System.out.println("---catch start---");
			System.out.println("NullPointerException ==> msg : " + e.getMessage());
			str = "김경호";
			int length = str.length();
			System.out.println("length : " + length);
			System.out.println("---catch end---");
		}
		int[] intArray = null;
		try{
			intArray = new int[3];
			System.out.println("stmt4");
			intArray[3] = 9999;
			
			/*
			 1. 예외상황발생하면  NullPointerException객체생성한후 
			    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			 2. 현재실행흐름은 실행을멈추고 
			    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 이동
			 */
			System.out.println("stmt5");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("---catch start---");
			System.out.println("ArrayIndexOutOfBoundsException ==> msg : " + e.getMessage());
			intArray[intArray.length-1] = 9999;
			System.out.println("intArray[inArray.length-1] : " + intArray[intArray.length-1]);
			System.out.println("---catch end---");
		}
		System.out.println("main end return");
		return;
	}

}
