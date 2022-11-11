
public class WhileUseChar {

	public static void main(String[] args) {
		/*
		 * 문자출력
		 */
		char c1 = 0;
		while (c1 < 65535) {
			System.out.print(c1 + " ");
			c1++;
			if(c1%100 == 0) {
				System.out.println();
			}
		}
		System.out.println();
		
		/*
		 * - 영문 소문자 출력
		 */
		char c2 = 'a';
		while (c2 <='z') {
			System.out.print(c2 +",");
			c2++;
		}
		System.out.println();
		/*
		 * - 영문 소문자 출력
		 * a,b,c,d,e
		 * f,g,h,i,j
		 * k,l,m,n,o
		 * p,q,r,s,t
		 * u,v,w,s,y
		 * z
		 */
		char c3 = 'a';
		int letterCount = 0;
		while (c3 <='z') {
			System.out.print(c3);
			letterCount++;
			if (c3 != 'z' && letterCount%5 !=0) {
				System.out.print(",");
			}
			
			if (letterCount%5 == 0) {
				System.out.println();
			}
			c3++; 
		}
		
		//한글 출력
		System.out.println();
		char c4 = '가';
		int letterCount2 = 0;
		while (c4 <= '힣') {
			System.out.print(c4);
			letterCount2++;
			if(c4 != '힣'&& letterCount2%30 != 0) {
				System.out.print(",");
			}
			
			if (letterCount2%30 == 0) {
				System.out.println();
			}
			c4++;
		}
		
		/*
		 * Quiz
		 * - 숫자형문자(0~9) 출력
		 */
		System.out.println();
		char c5 = '0';
		int letterCount3 = 0;
		while (c5 <='9') {
			System.out.print(c5);
			letterCount3++;
			if(c5 != '9'&& letterCount3%3 !=0) {
				System.out.print(",");
			}
			
			if (letterCount3%3 == 0) {
				System.out.println();
			}
			c5++;
			
		}
		
		
		
		
	}

}
