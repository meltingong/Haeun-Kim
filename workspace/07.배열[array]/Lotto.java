package com.itwill03.배열;

public class Lotto {

	public static void main(String[] args) {
		System.out.println("-----로또번호6개생성[중복번호허용안됨]-----");
		int[] lottoNumber = { 0, 0, 0, 0, 0, 0 };
		/*
		 * QUIZ:중복체크
		 */
			
		
			for(int i = 0; i < lottoNumber.length;i++) {
				int num = (int)(Math.random()*45)+1;
				lottoNumber[i] = num;
  				for(int j = 1; j < i; j++) {
					if( lottoNumber[i] == lottoNumber[j] ) {
						i--;
						break;
					}
				}
			}
			
			// 빈 배열안에 뽑은 볼을 넣음 > 이미 뽑혀있는 볼과 뽑은 볼이 중복되는지 체크 > 중복 안되면 배열에 넣기
				
			
		for (int i = 0; i < lottoNumber.length; i++) {
			System.out.print(lottoNumber[i] + " ");
		}
		
		
	}

}
