/*
	switch 문
	
	 - 형식
	 
	    switch(변수){
	    	case 값_1:
	    	  stmt1;
	    	  break;
	    	case 값_2:
	    	  stmt2;
	    	  break;  
	        case 값_n:
	          stmt3;
	    	  break;
	        default:
	          stmt4;
	    }
	    
	    
	switch(변수)  변수값은 byte,short,int char 
	              값이올수있다.(long 은안됨)
*/
public class SwitchTest {

	public static void main(String[] args) {
		int level = 1;	//게임레벨 1~5사이의 정수
		switch (level) {
		case 1:
			/* 명령문기술 위치*/
			System.out.println("보초");
			System.out.println("보초");
			System.out.println("보초");
			System.out.println("보초");
			System.out.println("보초");
			/*
			* break ==> switch block 을 빠져나간다.
			*/
			break;
		case 2:
			System.out.println("초보");
			break;
		case 3:
			System.out.println("중급");
			break;
		case 4:
			//System.out.println("고수");
			//break;						프린트 되는 문장이 같을 경우 break 및 프린트포멧 생략 가능
		case 5:
			System.out.println("고수"); 
			break;
			
		default:
			System.out.println("레벨은 1~5사이의 정수입니다.");
			break;
		}
		
		
		
		
	}

}
