package E3_�迭3_�⺻�̷�;

import java.util.Arrays;

public class �迭3_�⺻�̷�3_��ø�ݺ������迭 {
	
	/*
	 * [��ø�ݺ������迭]
	 *   - ��ø�ݺ��� 3 x 4 �� Ȱ����  1�����迭�� 1~12 ���ֱ� 
	 */
	
	public static void main(String[] args) {
		
		
		int arr[] = new int[12];
		
		int k = 0;
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				arr[k] = k + 1;
				k += 1;
			}
		}
		
		System.out.println(Arrays.toString(arr));
	}
		
}