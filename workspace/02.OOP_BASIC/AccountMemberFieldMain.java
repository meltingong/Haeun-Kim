
public class AccountMemberFieldMain {

	public static void main(String[] args) {
		/************case1************/
		/*
		 *  1. 1111번호 계좌 8000 입금
		 */
		/*
		 *  1-1. 계좌객체 생성
		 *  1-2. 계좌데이터 대입
		 */
		Account acc1 = new Account(); 
		acc1.no = 1111;
		acc1.owner = "zzang";
		acc1.balance = 10000;
		acc1.iyul = 3.0;
		/*
		 *  1-3. 계좌잔고 8000원 증가
		 */
		acc1.balance = acc1.balance + 8000;
		
		/*
		 *  2. 1111계좌 정보 출력
		 */
		System.out.println("-------------------------");
		System.out.printf(" %s  %s   %s  %s    %n", "번호", "이름", "잔고", "이율");
		System.out.println("-------------------------");
		System.out.printf(" %d  %s  %d  %.1f \n", acc1.no, acc1.owner, acc1.balance, acc1.iyul);
		/************case2************/
		/*
		 *  1. 은행 모든 계좌에 잔고 50원 증가
		 */
		/*
		 * 	1-1. 전체계좌 생성
		 *  1-2. 계좌데이터 대입
		 */
		Account a1 = new Account();
		a1.no = 1000;
		a1.owner = "Gu";
		a1.balance = 100000;
		a1.iyul = 2.0;
		Account a2 = new Account();
		a2.no = 2000;
		a2.owner = "manggu";
		a2.balance = 80000;
		a2.iyul = 1.5;
		Account a3 = new Account();
		a3.no = 3000;
		a3.owner = "yuri";
		a3.balance = 56000;
		a3.iyul = 3.2;
		/*
		 * 	1-2. 모든 계좌잔고 50원 대입
		 */
		a1.balance +=50;
		a2.balance +=50;
		a3.balance +=50;
		/*
		 *  2. 은행계좌 전체정보출력
		 */
		System.out.println("---------------------------");
		System.out.printf(" %s  %s     %s   %s    %n", "번호", "이름", "잔고", "이율");
		System.out.println("---------------------------");
		System.out.printf(" %d  %s       %d  %.1f \n", a1.no, a1.owner, a1.balance, a1.iyul);
		System.out.printf(" %d  %s    %d  %.1f \n", a2.no, a2.owner, a2.balance, a2.iyul);
		System.out.printf(" %d  %s      %d  %.1f \n", a3.no, a3.owner, a3.balance, a3.iyul);
		
		
		
		
		
	}

}
