package E4_배열4_알고리즘;

import java.util.Arrays;

public class 배열4_알고리즘_압축_문제 {
	/*
	 *  arr1 = {1,1,1,3,3,3,3,2,2,3,3,3,4,5};	
	 *  arr1의 중에서 연속으로 중복되는 숫자는 제외하고 숫자 1개씩만 압축해서 
	 *  b에 저장하려고 한다.
		[예] b[] = {1,3,2,3,4,5}
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