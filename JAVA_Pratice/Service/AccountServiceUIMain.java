package com.itwill05.service.array.account;

import java.util.Scanner;

public class AccountServiceUIMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean run=true;
		AccountService accountService=new AccountService();
		System.out.println("*****************************");
		System.out.println("     계좌관리프로그램");
		System.out.println("*****************************");
		while (run) {
			System.out.println("------------메뉴-------------");
			System.out.println("0. 은행계좌 추가[OPTION]");
			System.out.println("1. 은행계좌들 총계좌수출력");
			System.out.println("2. 은행계좌들 전체출력");
			System.out.println("3. 계좌번호로 검색후 계좌한개출력");
			System.out.println("4. 계좌잔고로 검색후 잔고이상인 계좌들출력");
			System.out.println("5. 계좌이율로 검색후 이율이상인 계좌들출력");
			System.out.println("6. 입금");
			System.out.println("7. 출금");
			System.out.println("8. 계좌를 잔고순으로 오름차순정렬후출력");
			System.out.println("9. 계좌를 잔고순으로 내림차순정렬후출력");
			System.out.println("10. 계좌수정[OPTION]");
			System.out.println("----------------------------");
			System.out.print("메뉴번호선택> ");
			
			int menuNo =scanner.nextInt();
			if(menuNo==0) {
			}else if(menuNo==1) {
				
			}else if(menuNo==2) {
				
			}else if(menuNo==3) {
				
			}else if(menuNo==4) {
				
			}else if(menuNo==5) {
				
			}else if(menuNo==6) {
				
			}else if(menuNo==7) {
				
			}else if(menuNo==8) {
				
			}else if(menuNo==9) {
				
			}else if(menuNo==10) {
				
			}
		}

	}

}
