package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_�迭��1 {
	/*
	 *  [����] array �迭 ���� �����߿��� b�迭�� ���� ������ 
		     b�� array�� ���� ��ġ�°���  0���� ����	
		 
		 [��] 
		 	array[] = {0,0,30,40};
			   b[] = {0,3,0,50};	
		
	 */
	public static void main(String[] args) {
		int array[] = {10,20,30,40};
		int b[] = {10,3,20,50};
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<b.length; j++) {
				if(array[i] == 0) {  // 1) 
					continue;
				}
				if(b[j] == 0) { // 2)
					continue;
				} 
				// 1)�� 2)�� �ݺ����� �ݺ��Ǵ� ������ �ٿ��ش�.
				if(array[i] == b[j]) {
					array[i] = 0;
					b[j] = 0;
				}
			}
		}
		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(b));

	}

}