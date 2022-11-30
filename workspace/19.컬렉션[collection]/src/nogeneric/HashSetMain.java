package nogeneric;

import java.util.*;

public class HashSetMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 45000, 0.1);
		Account acc3 = new Account(3333, "KING", 66000, 0.8);
		Account acc4 = new Account(4444, "YONG", 86000, 1.2);
		Account acc5 = new Account(5555, "SANG", 90000, 0.9);
		HashSet accountSet = new HashSet();
		System.out.println("# set size : " + accountSet.size());
		System.out.println(accountSet);
		System.out.println("-----------1.add-----------");
		accountSet.add(acc1);
		accountSet.add(acc2);
		accountSet.add(acc3);
		accountSet.add(acc4);
		accountSet.add(acc5);
		System.out.println("# set size : " + accountSet.size());
		System.out.println(accountSet);
		System.out.println("-----------2.add[중복객체]-----------");
		/*
		 * Element의 equals메소드를 사용해서 중복체크를한다.
		 */
		boolean isAdd = accountSet.add(acc1);
		System.out.println("추가여부 : " + isAdd);
		System.out.println("# set size : " + accountSet.size());
		System.out.println(accountSet);
		System.out.println("-----------3.remove[객체]-----------");
		boolean isRemove = accountSet.remove(new Account());
		System.out.println("삭제여부 : " + isRemove);
		System.out.println("# set size : " + accountSet.size());
		isRemove = accountSet.remove(acc5);
		System.out.println("삭제여부 : " + isRemove);
		System.out.println("# set size : " + accountSet.size());
		System.out.println("#####################전체출력[iteratrion]#######################");
		for (Object objectAccount : accountSet) {
			Account account = (Account)objectAccount;
			account.print();
		}
		System.out.println("--------------------toArray(Object[])------------------");
		Object[] accountArray = accountSet.toArray();
		for (int i = 0; i < accountArray.length; i++) {
			Account account = (Account)accountArray[i];
			account.print();
		}
		System.out.println("###########전체출력[iteration]############");
	}

}
