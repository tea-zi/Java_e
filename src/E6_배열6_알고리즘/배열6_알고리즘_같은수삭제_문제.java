package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_����������_���� {
	/*
	 	 input[] = {1,3,3,2,1,1,4};
	 
		 [1] input �� �����͸� a �� ���������� �����Ѵ�.
		 [2] ��, �����ҷ��� ������ ���� ���ڰ� ���� �����ҷ��� ���� ���� ���ٸ�,
		  	 �Ѵ� �����Ѵ�.		
		 ��) input = {1,3,3,2,1,1,4}		
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