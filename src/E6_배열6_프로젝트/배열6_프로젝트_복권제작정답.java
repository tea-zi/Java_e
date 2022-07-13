package E6_배열6_프로젝트;

import java.util.Arrays;
import java.util.Random;

public class 배열6_프로젝트_복권제작정답 {
	/*
	 * [복권제작]
	 * 1. lottoSet 배열은 5 * 7 사이즈 배열이다. 
	 * 2. 복권1개당 7줄이고 , 총 5개의 복권을 만들려고 한다.  
	 * 3. 복권 1줄의 내용은 1또는 7을 랜덤을 저장한다. 
	 * 4. 복권 1줄은 7이 연속으로 3개이상이면 "당첨" 이고 그 미만은 "꽝" 이다.
	 * 5. 5개 복권중에 1개만 당첨이고 4개는 꽝인 복권을 랜덤으로 생성해보자.
	 * 
	 * 예) 아래와 같이 한줄만 "당첨" 이고 나머지 4개는 "꽝"이다.
	 * 1177117 (꽝)
	 * 1117771 (당첨)
	 * 7171117 (꽝)
	 * 7711771 (꽝)
	 * 7171717 (꽝)
	 * 
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		int[][] lottoSet = new int[5][7];
		int wincount = 0;
		for(int i = 0; i<lottoSet.length;) {
			int count = 0;
			boolean check = false;
			for(int j = 0; j<lottoSet[i].length; j++) {
				int r = ran.nextInt(2);
				if(r == 0) {
					lottoSet[i][j] = 1;
				}
				else {
					lottoSet[i][j] = 7;
				}
			}
			for(int j = 0; j<lottoSet[i].length; j++) {
				if(lottoSet[i][j] == 7) {
					count++;
					if(count == 3) {
						check = true;
						break;
					}
				}
				else {
					count = 0;
				}
			}
			if(check == true && wincount == 0) {
				wincount++;
				i++;
			}
			else if(check == false && wincount == 1) {
				i++;
			}
		}
		for(int i=0; i<lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		System.out.println("-------------------");
		for(int i=0; i<20; i++) {
			int r1 = ran.nextInt(lottoSet.length);
			int r2 = ran.nextInt(lottoSet.length);
			for(int j=0; j<lottoSet[0].length; j++) {
				int temp = lottoSet[r1][j];
				lottoSet[r1][j] = lottoSet[r2][j];
				lottoSet[r2][j] = temp;
			}
		}
		//정답 배열 전체를 셔플하지 않고 당첨된 열만 랜덤으로 셔플
		int r = ran.nextInt(lottoSet.length);
		
		int[] temp = lottoSet[0];
		lottoSet[0] = lottoSet[r];
		lottoSet[r] = temp;
		System.out.println("------------------");
		for(int i=0; i<lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		for(int i=0; i<lottoSet.length; i++) {
			int count = 0;
			boolean check = false;
			for(int j=0; j<lottoSet[i].length; j++) {
				if(lottoSet[i][j] == 7) {
					count++;
					if(count == 3) {
						check = true;
						break;
					}
				}
				else {
					count = 0;
				}
			}
			if(check == true) {
				System.out.print(Arrays.toString(lottoSet[i]));
				System.out.println(" ==> \"당첨\"");
			}
			else {
				System.out.print(Arrays.toString(lottoSet[i]));
				System.out.println(" ==> \"꽝\"");
			}
		}
	}
}