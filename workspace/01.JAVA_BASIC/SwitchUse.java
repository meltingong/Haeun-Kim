
public class SwitchUse {

	public static void main(String[] args) {
		/*
		 짝수홀수 판별
		 */
		int number = 23;
		switch (number%2) {
		case 0:
			System.out.println("짝수입니다");
			break;
		case 1:
			System.out.println("홀수입니다");
			break;
		}
		
		char direction = 'A';
		switch (direction) {
		case 'A':
			System.out.println("move left~");
			break;
		case 'D':
			System.out.println("move right~");
			break;
		case 'W':
			System.out.println("move up~");
			break;
		case 'X':
			System.out.println("move down~");
			break;
		case 'S':
			System.out.println("move rotate~");
			break;
		default:
			System.out.println("don't move!");
			break;
		}
		/*
		 * Quiz : 대소문자 구분없이 X, x실행하도록 해보세요
		 */

		System.out.println("================================");
		char direaction2 = 'x';
		switch(direaction2) {
		case 'A':
			System.out.println("move left~");
			break;
		case 'D':
			System.out.println("move right~");
			break;
		case 'W':
			System.out.println("move up~");
			break;
		case 'x':
		case 'X':
			System.out.println("move down~");
			break;
		case 'S':
			System.out.println("move rotate~");
			break;
		default:
			System.out.println("don't move!");
			break;
		}
		
		
	}

}
