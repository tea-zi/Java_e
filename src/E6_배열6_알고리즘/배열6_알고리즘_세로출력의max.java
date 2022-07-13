package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_알고리즘_세로출력의max {
	/*
		 data 배열의 각 세로줄의 합을 sumList 에 저장후 
		 가장 큰값을 출력 
	
	 */
	public static void main(String[] args) {		
		int data[][] = {
			    {0,0,0,0,0},
				{0,0,0,0,3},
				{0,2,0,0,3},
				{3,1,3,0,1},
				{1,4,2,0,2},
				{4,1,4,0,4},
				{2,1,4,3,3},
		};		
		int[] sumList = {0,0,0,0,0};
		for(int i=0; i<data[0].length; i++) {
			for(int j=0; j<data.length; j++) {
				System.out.print(data[j][i] + " ");
				sumList[i] += data[j][i];
			}
			System.out.println();
		}
		int max = 0;
		for(int i=0; i<sumList.length; i++) {
			if(max < sumList[i]) {
				max = sumList[i];
			}
		}
		System.out.println(Arrays.toString(sumList));
		System.out.println(max);
	}
}