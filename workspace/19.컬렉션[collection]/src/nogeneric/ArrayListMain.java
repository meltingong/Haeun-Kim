package nogeneric;

import java.util.*;

public class ArrayListMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 45000, 0.1);
		Account acc3 = new Account(3333, "KING", 66000, 0.8);
		Account acc4 = new Account(4444, "YONG", 86000, 1.2);
		Account acc5 = new Account(5555, "SANG", 90000, 0.9);
		
		ArrayList accountList = new ArrayList();
		int size = accountList.size();
		System.out.println("#size : " + accountList.size());
		System.out.println("*********** 1. add[맨마지막 index에 객체 저장]*************");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		System.out.println("*********** 2. add(index, element)[지정된 index에 객체 저장]*************");
		accountList.add(2,new Account (3332,"KING",45000,3.3));
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		System.out.println("*********** 3. set(index, element)[지정된 index에 객체 저장]*************");
		accountList.set(5, new Account(9999,"Last",88888,8.8));
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		System.out.println("*************** 4. get(index)***************");
		Account getAccount =(Account) accountList.get(1);
		System.out.println(getAccount);
		System.out.println("*************** 5. remove(index)***************");
		Account removeAccount = (Account) accountList.remove(accountList.size()-1);
		removeAccount.print();
		System.out.println("#size : " + accountList.size());
		System.out.println(accountList);
		System.out.println("%%%%%%%%%%업무실행%%%%%%%%%%");
		System.out.println("************1.계좌전체출력************");
		Account.headerPrint();
		for(int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			tempAccount.print();
		}
		for(Object objectAccount : accountList) {
			((Account)objectAccount).print();
		}
		System.out.println("************2.계좌번호3333번 한개 찾기************");
		for(int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo()==3333) {
				tempAccount.print();
			}
		}
		System.out.println("******3.계좌이름번호 KING인 계좌 여러개 찾기******");
		for(int i =0; i < accountList.size(); i++) {
			if(((Account)accountList.get(i)).getOwner().equals("KING")) {
				((Account)accountList.get(i)).print();;
			}
		}
		System.out.println("*********4.계좌번호 4444번 계좌 한개 삭제*********");
		for(int i = 0; i < accountList.size(); i++) {
			if(((Account)accountList.get(i)).getNo() == 4444) {
				accountList.remove(i);
				break;
			}
		}
		for(Object list : accountList) {
			((Account)list).print();
		}
		System.out.println("*********5.계좌이름번호 KING인 계좌 여러개 삭제[Quiz]*********");
		for(int i = 0; i < accountList.size(); i++) {
			if(((Account)accountList.get(i)).getOwner().equals("KING")) {
				accountList.remove(i);
				i--;
			}
		}
		for(Object list : accountList) {
			((Account)list).print();
		}
	
	}

}
