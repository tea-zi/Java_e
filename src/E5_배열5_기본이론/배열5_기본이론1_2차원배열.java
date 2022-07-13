package E5_배열5_기본이론;

import java.util.Arrays;

public class 배열5_기본이론1_2차원배열 {
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
				
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
				
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		
		arr[2][0] = 70;
		arr[2][1] = 80;
		arr[2][2] = 90;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}	
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}