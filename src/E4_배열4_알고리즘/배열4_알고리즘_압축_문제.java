package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_����_���� {
	/*
	 *  arr1 = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};	
	 *  arr1�� �߿��� �������� �ߺ��Ǵ� ���ڴ� �����ϰ� ���� 1������ �����ؼ� 
	 *  b�� �����Ϸ��� �Ѵ�.
		[��] b[] = {1,3,2,3,4,5}
	 */
	public static void main(String[] args) {
		 int arr1[] = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};		 
		 int b [] = new int[arr1.length];
		 int count = 0;
		 int index = 0;
		 for(int i=0; i<arr1.length; i++) {
			 if(i != 0) {
				 if(arr1[i] == arr1[i-1]) {
					 count++;
				 }
				 else {
					 count = 0;
				 }
			 }
			 if(count == 0) {
				 b[index] = arr1[i];
				 index++;
			 }
		 }
		 for(int i=0; i<index; i++) {
			 System.out.print(b[i] + " ");
		 }
		 System.out.println();
		 System.out.println(Arrays.toString(b));
	}
}