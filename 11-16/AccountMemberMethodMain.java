
public class AccountMemberMethodMain {

	public static void main(String[] args) {
		/************ case1 ***************/
		Account acc1 = new Account();
		// 초기값으로 대입된 계좌데이터 메소드 호출
		acc1.setAccountData(1111, "zzang", 8000000, 3.0);
		
		// 입금 메소드 호출
		System.out.println("\t  <입금 전>");
		acc1.headerPrint();
		acc1.print();
		acc1.deposit(7000000);
		System.out.println("\t  <입금 후>");
		acc1.headerPrint();
		acc1.print();
		// 출금 메소드 호출
		acc1.withDraw(200000);
		System.out.println("\t  <출금 후>");
		acc1.headerPrint();
		acc1.print();
		// 정보출력 메소드 호출
		acc1.print();
		
		/************ case2 ***************/
		/*
		 * 1.은행모든계좌에 잔고 50원증가
		 */
		/*
		 * 1-1.전체계좌생성 
		 * 1-2.계좌데이타대입
		 */
		Account acc2 = new Account();
		acc2.setAccountData(1000, "맹구", 89000, 5.6);
		Account acc3 = new Account();
		acc3.setAccountData(2000, "짱아", 85000, 3.2);
		Account acc4 = new Account();
		acc4.setAccountData(3000, "훈이", 36000, 2.5);
		
		/*
		 * 1-2.모든계좌잔고 50원증가
		 */
		acc2.deposit(50);
		acc3.deposit(50);
		acc4.deposit(50);
		/*
		 * 2.은행계좌 전체정보출력
		 */
		acc2.headerPrint();
		acc2.print();
		acc3.print();
		acc4.print();
		
		
	}

}
