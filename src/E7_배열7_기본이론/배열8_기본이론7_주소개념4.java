package E7_배열7_기본이론;

import java.util.Random;

public class 배열8_기본이론7_주소개념4 {
	public static void main(String[] args) {
		int darr[][] = new int[3][];		
		int arr[] = {10,20,30};			
		darr[0] = arr;
		darr[1] = arr;
		darr[2] = arr;
		
		arr[1] = 100;
		//---------------------------------		
		/*
		 * darr 출력
		 * 10 100 30
		 * 10 100 30
		 * 10 100 30
		 */
		int darr2[][] = {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		
		int temp[][] = new int[3][];
		temp[0] = darr2[1];
		temp[1] = darr2[2];
		temp[2] = darr2[0];
	/*
	 * temp 출력
	 * 40 50 60
	 * 70 80 90
	 * 10 20 30
	 */
	}
}