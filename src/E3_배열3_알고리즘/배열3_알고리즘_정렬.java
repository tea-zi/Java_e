package E3_배열3_알고리즘;

import java.util.Arrays;

public class 배열3_알고리즘_정렬 {
	/*
	 * [정렬]
	 * 
	 * 1. 인덱스 0번이 나머지를 검사한다.
	 * 2. 제일 큰 값을 찾아 교환한다.
	 * 3. 인덱스 1증가한다.
	 * 4. [1~3]을 끝까지 반복한다.
	 * 예)
	 * 10, 50, 30, 40, 80, 19   ==> 80을 찾아내고 교환한다.
	 * 80, 50, 30, 40, 10, 19   ==> 50은 나머지중 이미 제일크다.
	 * 80, 50, 30, 40, 10, 19   ==> 40을 찾아내고 교환한다.
	 * 80, 50, 40, 30, 10, 19   ==> 30은 나머지중 이미 제일크다.
	 * 80, 50, 40, 30, 10, 19   ==> 19을 찾아내고 교환한다.
	 * 80, 50, 40, 30, 19, 10
	 */
	public static void main(String[] args) {

		int[] score = {10, 50, 30, 40, 80, 19};
	
		for(int i=0; i<score.length; i++) {
			int max = 0;
			int index = 0;
			for(int j=i; j<score.length; j++) {
				if(max < score[j]) {
					index = j;
					max = score[j];
				}
			}
			int temp = score[i];
			score[i] = score[index];
			score[index] = temp;
		}
		System.out.println(Arrays.toString(score));
	}
}