package E2_�迭2_�˰���;

import java.util.Arrays;

public class �迭2_�˰���_�迭���� {
	
	/*
	 * [����]
	 *    [4�� ����� ����]
	 * - 	[����1] arr �迭���� 4�� ����� ��� temp �迭�� ����
	 * - ��! temp �� ���̸� 4�� ����� ���� ��ŭ�� �����Ѵ�.
	 * - ��) 4�ǹ�� ������ 3���̹Ƿ� temp = new int[3];  
	 */

	public static void main(String[] args) {

		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = new int[3];
		int j = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%4 == 0) {
				temp[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(temp));
	}

}