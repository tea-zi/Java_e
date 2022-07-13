package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_가로세로합 {
	/*
	 * [가로세로합]
	 * 
	     위 배열은 1~9가 섞여서 저장되어 있는 9개 사이즈의 배열이다.
		 [문제1] array 배열을 위 와같이 사각형 모양으로 출력 하고 
		 각줄의 가로 합을 garo1[] 에 차례대로 저장 
		 
		 [문제2] array 배열을 위 와같이 사각형 모양으로 출력 하고 
		 각줄의 세로 합을 sero1[] 에 차례대로 저장 
		 
	 */
	public static void main(String[] args) {
		int array[] = {
				2, 4, 6,
				8, 1, 5,
				9, 7, 3
		};			
		int garo1[] = {0,0,0}; // {2+4+6 , 8+1+5 , 9+7+3}						
		int sero1[] = {0,0,0}; // {2+8+9 , 4+1+7 , 6+5+3}
		int gi = 0;
		int si = 0;
		for(int i = 0; i < array.length; i++) {		
			garo1[gi] += array[i];	
			sero1[si] += array[i];
			si += 1;
			System.out.print(array[i] + " ");
			if(i % 3 == 2) {
				System.out.println(garo1[gi]);
				gi += 1;
				si = 0;				
			}			
			if(i == array.length-1) {
				for(int j=0; j<sero1.length; j++) {
					System.out.print(sero1[j]);
				}
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(garo1));		
		System.out.println(Arrays.toString(sero1));	
	}
}