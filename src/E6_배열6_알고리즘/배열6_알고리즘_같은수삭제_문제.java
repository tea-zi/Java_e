package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_알고리즘_같은수삭제_문제 {
	/*
	 	 input[] = {1,3,3,2,1,1,4};
	 
		 [1] input 의 데이터를 a 에 순차적으로 저장한다.
		 [2] 단, 저장할려는 숫자의 앞의 숫자가 지금 저장할려는 수와 값이 같다면,
		  	 둘다 삭제한다.		
		 예) input = {1,3,3,2,1,1,4}		
		 1  ==> a[] = {1}
		 3  ==> a[] = {1,3}
		 3  ==> a[] = {1,3,3} ==> {1}
		 2  ==> a[] = {1,2}
		 1  ==> a[] = {1,2,1}
		 1  ==> a[] = {1,2,1,1} ==> {1,2}
		 4  ==> a[] = {1,2,4}
	*/
	public static void main(String[] args) {	
		int input[] = {1,3,3,2,1,1,4};
		int a [] = new int[input.length];	
		a[0] = input[0];
		int index = 0;
		for(int i=1; i<a.length; i++) {
			if(input[i] == a[index]) {
				a[index] = 0;
				index--;
			}
			else {
				index++;
				a[index] = input[i];
			}
			System.out.println(index);
		}
		System.out.println(Arrays.toString(a));
	}
}