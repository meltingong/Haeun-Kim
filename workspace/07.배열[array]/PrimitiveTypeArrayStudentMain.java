
public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		System.out.println("-----학생10명 성적데이터를 저장하기 위한 배열객체 생성 및 초기화 -----");
		int[] noArray = {1,2,3,4,5,6,7,8,9,10};
		String[] nameArray = {"LEE","KIM","PARK","LIM","SONG","CHOI","KWON","ZHU","YOU","YANG"};
		int[] korArray = {90,80,75,66,50,45,80,90,100,75};
		int[] engArray = {75,90,80,60,55,48,68,78,95,100};
		int[] mathArray = {75,65,95,48,22,38,99,88,75,100};
		int[] totArray = {0,0,0,0,0,0,0,0,0,0};
		double[] avgArray = {0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0};
		char[] gradeArray = {'F','F','F','F','F','F','F','F','F','F','F'};
		int[] rankArray = {1,1,1,1,1,1,1,1,1,1};
		
		/*
		 *  총점, 평균, 평점 계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			totArray[i] = korArray[i] + engArray[i] + mathArray[i];
			avgArray[i] = totArray[i]/3.0;
			if(avgArray[i] >=90) {
				gradeArray[i] = 'A';
			}else if(avgArray[i] >=80) {
				gradeArray[i] = 'B';
			}else if(avgArray[i] >=70) {
				gradeArray[i] = 'C';
			}else if(avgArray[i] >=60) {
				gradeArray[i] = 'D';
			}else {
				gradeArray[i] = 'F';
			}
		}
		/*
		 * 총점으로 석차 계산
		 */
		/*
		 * 1번 학생(index-->0)
		 */
		/*
		 * for(int j = 0; j < totArray.length; j++) {
		 * 	 if(totArray[0] < totArray[j]) {
		 * 		rankArray[0]++; 
		 * 	} 
		 * }
		 */
		/*
		 * 2번 학생(index-->1)
		 */
		/*
		 * for(int j = 0; j < totArray.length; j++) {
		 *  	if(totArray[1] < totArray[j]) {
		 *  		rankArray[1]++; 
		 *  	} 
		 *  }
		 */
		/*
		 * 3번 학생(index-->2)
		 * 4번 학생(index-->3)
		 * 5번 학생(index-->4)
		 * 6번 학생(index-->5)
		 * 7번 학생(index-->6)
		 * 8번 학생(index-->7)
		 * 9번 학생(index-->8)
		 * 10번 학생(index-->9)
		 */
			for(int i = 0; i < totArray.length; i++) {
				for(int j = 0; j < totArray.length; j++) {
					if(totArray[i] < totArray[j]) {
						rankArray[i]++;
					}
				}
			}
		/*
		 * 학생검색(번호,국어,영어,수학,학점,석차)
		 */
		/*
		 * 번호3번인 학생 1명 찾아서 1명의 정보 출력 (학생번호 중복되지 않음)
		 */
			System.out.println(">>>번호3번인 학생 1명 찾아서 1명 정보 출력<<<");
				for(int i = 0; i < noArray.length; i++) {
					if(noArray[i]==3) {
						System.out.printf("%3d %6s %3d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
							engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
						break;
					}
				}
		
		/*
		 * 국어점수 80점인 학생들 여러명 찾아서 여러명 정보 출력
		 */
			System.out.println(">>>국어점수 80점인 학생들 여러명 찾아서 여러명 정보 출력<<<");
			for(int i = 0; i < noArray.length; i++) {
				if(korArray[i]==80) {
					System.out.printf("%3d %6s %3d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
							engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
					
				}
			}
		/*
		 * 영어점수 50점 이하인 학생들 여러명 찾아서 여러명 정보 출력
		 */
			System.out.println(">>>영어점수 50점 이하인 학생들 여러명 찾아서 여러명 정보 출력<<<");
			for(int i = 0; i < noArray.length; i++) {
				if(engArray[i] <= 50) {
					System.out.printf("%3d %6s %3d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
							engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				}
			}
		/*
		 * 수학점수 70점 이상인 학생들 여러명 찾아서 여러명 정보 출력
		 */
			System.out.println(">>>수학점수 70점 이상인 학생들 여러명 찾아서 여러명 정보 출력<<<");
			for(int i = 0; i < noArray.length; i++) {
				if(mathArray[i] >= 70) {
					System.out.printf("%3d %6s %3d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
							engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				}
			}
		/*
		 * 학점이 D학점이하인 학생모두찾아서 여러명 정보출력
		 */
			System.out.println(">>>학점이 D학점이하인 학생모두찾아서 여러명 정보출력<<<");
			for(int i = 0; i < noArray.length; i++) {
				char c = 68;
				if(gradeArray[i] >= c) {
					System.out.printf("%3d %6s %3d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
							engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				}
			}
		
		
			
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬전  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%3d %6s %3d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		
		/*
		 * 정렬
		 *    1.오름차순 
		 *      ex> 1,2,3,4,5....
		 *          a,b,c,d,e....,가 ... 힣
		 *    2.내림차순
		 *    	ex> 5,4,3,2,1
		 *          z,y,x.... , 힣  ... 가
		 */
		/*
		 * 학생총점순으로 오름차순(내림차순)정렬
		 */	
			int a = 10;
			int b = 3;
			//swap a,b
			System.out.println(" a = "+ a);
			System.out.println(" b = "+ b);
			int temp = a;
			a = b;
			b = temp;
			System.out.println("----swap----");
			System.out.println(" a = "+ a);
			System.out.println(" b = "+ b);
			
			
			//1회
			/*for(int j = 0; j < noArray.length-1; j++ ) {
				if(totArray[j] >totArray[j+1]) {
					//swap
					int tempTot = totArray[j];
						totArray[j] = totArray[j+1];
						totArray[j+1] = tempTot;
							
				}
			}
			*/
			
			for(int i = 0; i < noArray.length; i++) {
				for(int j = 0; j < noArray.length-1; j++ ) {
					if(totArray[j] < totArray[j+1]) {
						//swap
						int tempTot = totArray[j];
							totArray[j] = totArray[j+1];
							totArray[j+1] = tempTot;
						int tempNo = noArray[j];
							noArray[j] = noArray[j+1];
							noArray[j+1] = tempNo;
						String tempName = nameArray[j];
							nameArray[j] = nameArray[j+1];
							nameArray[j+1] = tempName;
						int tempKor = korArray[j];
							korArray[j] = korArray[j+1];
							korArray[j+1] = tempKor;
						int tempEng = engArray[j];
							engArray[j] = engArray[j+1];
							engArray[j+1] = tempEng;
						int tempMath = mathArray[j];
							mathArray[j] = mathArray[j+1];
							mathArray[j+1] = tempMath;	
						double tempAvg = avgArray[j];
							avgArray[j] = avgArray[j+1];
							avgArray[j+1] = tempAvg;
						char tempGrade = gradeArray[j];
							gradeArray[j] = gradeArray[j+1];
							gradeArray[j+1] = tempGrade;
						int tempRank = rankArray[j];
							rankArray[j] = rankArray[j+1];
							rankArray[j+1] = tempRank;
					}
				}
			}
		
			
			
			
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬후 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.printf("-------------------학생 성적출력-----------------------\n");
			System.out.printf("%s  %3s  %s  %s  %s  %s  %3s  %s  %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
			System.out.printf("-------------------------------------------------------\n");
			for (int i = 0; i < noArray.length; i++) {
				System.out.printf("%4d  %-6s  %4d  %4d  %4d  %4d  %5.1f  %3c  %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
			
			
			
		
		
	}

}
