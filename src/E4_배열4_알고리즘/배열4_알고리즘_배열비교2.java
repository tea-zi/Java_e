package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_�迭��2 {
	/*
	 * [�迭��]
	     arr1 �迭�� input �迭�� ���Ѵ�.
	     ���ΰ��� ���� �ִ��� üũ�Ѵ�.
	     �������� ã���� arr1�� ���� �ִ� �ε����� b�� �����Ѵ�.    
		 input ���ڰ� arr1 �� ������ �ε��� ��� -1 �����Ѵ�.
			  [��]  input[] ==> { 30, 40, 1, 10, 2 }
			  [��]  arr1[] = {10, 20, 30, 40};			  
				   1) 30 �� arr1[2] �̹Ƿ� 2���� 
				   2) 40 �� arr1[3] �̹Ƿ� 3����
				   3) 1 �� arr1�� �����Ƿ� -1 ����
				   4) 10 �� arr1[0] �̹Ƿ� 0 ����
				   5) 2�� arr1�� �����Ƿ� -1  ���� 				   
		 	  [��] b = { 2, 3, -1, 0, -1}
	 */
	public static void main(String[] args) {
		
		int arr[] = {10, 20, 30, 40};		
		int input[] = {30, 40, 1, 10, 2};		
		int b[] = {-1, -1, -1, -1, -1};		
		for(int i = 0; i <arr.length; i++) {
			for(int j=0; j<input.length; j++) {
				if(arr[i] == input[j]) {
					b[j] = i;
				}
			}
		}
		System.out.println(Arrays.toString(b));
	}

}