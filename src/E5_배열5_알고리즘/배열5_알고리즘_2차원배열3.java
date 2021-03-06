package E5_배열5_알고리즘;

import java.util.Arrays;

public class 배열5_알고리즘_2차원배열3 {
	public static void main(String[] args) {

		int[][] arr = {
				{101, 102, 103, 104},
				{201, 202, 203, 204},
				{301, 302, 303, 304}
			}; 
			
			int[] garo = new int[3];
			int[] sero = new int[4];
			
		// 문제 1) 가로 합 출력
		// 정답 1) 410, 810, 1210
		int sum[] = new int[arr.length];
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				garo[i] += arr[i][j];
			}
		}
		System.out.println(Arrays.toString(garo));
		// 문제 2) 세로 합 출력
		// 정답 2) 603, 606, 609, 612
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sero[j] += arr[i][j];
			}
		}
		System.out.println(Arrays.toString(sero));
	}
}