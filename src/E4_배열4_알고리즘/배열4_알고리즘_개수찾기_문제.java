package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_����ã��_���� {
	/*
	 * [����ã��]
	 
	  	 ���帹�� ����ִ� ���ڰ�����
		 ���� ���� ����ִ� ������ ������ ���� ���Ͻÿ�.	
		 100 : 1��
		 3   : 5�� 	
		 �� : 6		
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