package E3_배열3_알고리즘;

import java.util.Arrays;

public class 배열3_알고리즘_배열중복삭제1 {
	/*
		 [문제] 값을 입력받고 삭제 
		 [조건] 만약에 같은값이 여러개 있으면 가장첫번째의 값  한개만 삭제 후 b 에 순차적으로 저장 
		 
		 		  data[] = {5,2,6,8,5,6};
		 		  
		 [예] 2 ==>  b [] = {5,6,8,5,6,0};
		 [예] 6 ==>  b [] = {5,2,8,5,6,0};
	 */
	public static void main(String[] args) {
	
		int data[] = {5,2,6,8,5,6};
		int b [] = {0,0,0,0,0,0};
		int index = -1;
		for(int i=0; i<data.length; i++) {
			b[i] = data[i];
			for(int j=i+1; j<data.length; j++) {
				if(data[i] == data[j]) {
					index = i;
					System.out.println(index);
					break;
				}
			}
		}
		if(index != -1) {
			for(int i=0; i<data.length; i++) {
				if(i == index) {
					for(int j=i; j<data.length-1; j++) {
						b[j] = data[j+1];
					}
				/*	if(i != index) {
						b[bindex] = data[i]; 
						bindex += 1;
						3이 아닌경우만 입력받지않고 간단하게 완성
						*/
				}
			}
			b[b.length-1] = 0;			
		}
		System.out.println(Arrays.toString(b));
	}
}