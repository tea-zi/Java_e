package E5_�迭5_�˰���;

import java.util.Arrays;

public class �迭5_�˰���_�迭�ΰ����� {
	/*
	 * [����]
	     �� �迭�� �ѳ��� ��ġ�� �����������������Ͻÿ�.	
		 ��) 1,2,3,5,7,8,9,10,12,15,19,20
	 */
	
	public static void main(String[] args) {
		int[] arr1 = {9,10,3,2,20,19};
		int[] arr2 = {15,12,1,5,7,8};
		int[] arr3 = new int[arr1.length+arr2.length];
		int turn = 0;
		for(int i=0; i<arr3.length; i++) {
			if(i%2 == 0) {
				arr3[i] = arr1[turn];
			}
			else {
				arr3[i] = arr2[turn];
				turn++;
			}
		}
		System.out.println(Arrays.toString(arr3));
	
		for(int i=0; i<arr3.length; i++) {
			for(int j=0; j<i; j++) {
				if(arr3[i] < arr3[j]) {
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr3));
	}
}