package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_����_����2 {
	/*
	 *  arr1 = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};	
	 *  arr1�� �߿��� �������� �ߺ��Ǵ� ���ڴ� �����ϰ� ���� 1������ �����ؼ� 
	 *  b�� �����Ϸ��� �Ѵ�.
		[��] b[] = {1,3,2,3,4,5}
	 */
	public static void main(String[] args) {
		 int arr1[] = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};		 
		 int b [] = new int[arr1.length];
		 
		 int index = 0;
		 b[0] = arr1[0];
		 
		 for(int i=1; i<arr1.length; i++) {
			 if(b[index] != arr1[i]) {
				 index++;
				 b[index] = arr1[i];
			 }
		 }
		 System.out.println(Arrays.toString(b));
	}
}