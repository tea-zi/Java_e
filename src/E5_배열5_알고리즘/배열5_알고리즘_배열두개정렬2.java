package E5_�迭5_�˰���;

import java.util.Arrays;

public class �迭5_�˰���_�迭�ΰ�����2 {
	public static void main(String[] args) {
		int[] arr1 = {9,10,3,2,12,15};
		int[] arr2 = {19,20,1,5,7,8};	
		int[] temp = null;
		temp = new int[arr1.length+arr2.length];
		/*
		 * arr1 �� arr2 ������ �����Ѵ�. 
		 * �տ������� ���ؼ� ���ϰ����������� temp������
		 * �ڽ�1�� ���� 
		 * {9,10,3,2,20,19};
		 * {15,12,1,5,7,8};	
		 * 2,3,9,10,19,20
		 * 1,5,7,8,12,15
		 * temp =>1.2.3.5.7.
		 * arr1 �� arr2 ������ �����Ѵ�. 
		 * �տ������� ���ؼ� ���ϰ����������� temp������
		 * �ڽ�1�� ���� 
		 * {9,10,3,2,20,19};
		 * {15,12,1,5,7,8};	
		 * 2,3,9,10,19,20
		 * 1,5,7,8,12,15
		 * temp =>1.2.3.5.7.
		 */
		
		for(int i = 1; i <arr1.length; i++) {
			for(int j = 0;  j < i; j++) {
				if(arr1[i]<arr1[j]) {
					int c = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = c;
				}
				if(arr2[i]<arr2[j]) {
					int c = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = c;
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));

		int ar1 = 0;
		int ar2 = 0;
		for(int i=0; i<temp.length; i++) {
			if(ar1 == arr1.length) {
				temp[i] = arr2[ar2];
				ar2++;
			}
			else if(ar2 == arr2.length) {
				temp[i] = arr1[ar1];
				ar1++;
			}
			else {
				if(arr1[ar1] > arr2[ar2]) {
					temp[i] = arr2[ar2];
					ar2++;
				}
				else if(arr1[ar1] < arr2[ar2]) {
					temp[i] = arr1[ar1];
					ar1++;
				}
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}
