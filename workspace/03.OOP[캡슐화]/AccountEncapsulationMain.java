
public class AccountEncapsulationMain {

	public static void main(String[] args) {
		Account account1 = new Account();
		account1.setAccountData(1111, "짱구", 89000, 1.5);
		/*
		 * account1 8000원 입금
		 */
		account1.deposit(8000);
		account1.print();
		/*
		 * account1 400원 출금
		 */
		account1.withDraw(400);
		account1.print();
		/*
		 * account1 이율 변경
		 */
		account1.setIyul(3.6);
		/*
		 * account1 잔고얻기
		 */
		System.out.println("account1 잔고 : "+ account1.getBalance());
		
		Account acc1 = new Account();
		Account acc2 = new Account();
		Account acc3 = new Account();
		
		acc1.setAccountData(1000, "철수", 89000, 3.5);
		acc2.setAccountData(2000, "유리", 45000, 2.5);
		acc3.setAccountData(3000, "훈이", 12000, 1.5);
		
		/*
		 *  잔고 50원 증가
		 */
		acc1.deposit(50);
		acc2.deposit(50);
		acc3.deposit(50);
		
		acc1.headerPrint();
		acc1.print();
		acc2.print();
		acc3.print();
		
		/*
		 * 은행 총 잔고 get
		 */
		int totBalance = acc1.getBalance()+acc2.getBalance()+acc3.getBalance();
		System.out.println("은행 총 잔고 : " + totBalance);
		
	
	}

}
