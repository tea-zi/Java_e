package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_�ߺ�����_���� {
	/*
	 *  [����] arr1 �迭 ���� �����߿��� b�迭�� ���� ������ 
		      b�� arr1�� ���� ��ġ�°���  0���� ����	
		[����] ��ġ�� ���� ������ ������ ���� 0���� ���� 	
		 ��) arr1[] = {0,0,30,40,0};
		 ��) b[] = {0,3,0,0,0,50};
	 */
	public static void main(String[] args) {
		int arr1[] = {10,20,30,40,20};
		int b[] = {10,3,20,10,20,50};
		for(int i=0; i<arr1.length; i++) {
			int check = arr1[i];
			for(int j=0; j<b.length; j++) {
				if(b[j] == check) {
					b[j] = 0;
					for(int k=0; k<arr1.length; k++) {
						if(check == arr1[k]) {
							arr1[i] = 0;	
						}
					}
				}
			}
		}
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(b));
	}
}