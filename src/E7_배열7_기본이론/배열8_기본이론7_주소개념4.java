package E7_�迭7_�⺻�̷�;

import java.util.Random;

public class �迭8_�⺻�̷�7_�ּҰ���4 {
	public static void main(String[] args) {
		int darr[][] = new int[3][];		
		int arr[] = {10,20,30};			
		darr[0] = arr;
		darr[1] = arr;
		darr[2] = arr;
		
		arr[1] = 100;
		//---------------------------------		
		/*
		 * darr ���
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
	 * temp ���
	 * 40 50 60
	 * 70 80 90
	 * 10 20 30
	 */
	}
}