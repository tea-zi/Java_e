package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_개수찾기_문제 {
	/*
	 * [개수찾기]
	 
	  	 가장많이 들어있는 숫자개수와
		 가장 적개 들어있는 숫자의 개수의 합을 구하시요.	
		 100 : 1개
		 3   : 5개 	
		 답 : 6		
	 */
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 3, 100, 1, 3, 3, 2, 3, 2 };	
		int count[] = new int[arr.length];
		int num[] = new int[arr.length];
		int numc = 0;
		for(int i=0; i<arr.length; i++) {
			boolean check = false;
			for(int j=0; j<num.length; j++) {
				if(arr[i] == num[j]) {
					check = true;
					break;
				}
			}
			if(check == false) {
				num[numc] = arr[i];
				numc++;
			}
		}
		System.out.println(Arrays.toString(num));		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<num.length; j++) {	
				if(arr[i] == num[j]) {
					count[j]++;
				}
			}
		}
		System.out.println(Arrays.toString(count));
	}
}