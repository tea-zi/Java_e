package E5_�迭5_�˰���;

import java.util.Arrays;

public class �迭5_�˰���_����Ǯ�� {			
	/*
	    array[][] = {3,2},{5,6},{2,1},{4,3}
		 �� �����ʹ� ������ �������̴�.
		 ���������� ��Ģ�� 2���� ¦�� �̷��.
		  1) ���� ���� ==> ������ 
		  2) ���� ���� ==> �����̴�.
		 ��) {3,2} ==> 33
		 ��) {5,6} ==> 555555
		 ��) {2,1} ==> 2
		 ��) {4,3} ==> 444
			 ���� �����ʹ� 335555552444 �ΰ��̴�. 
		 ����) �������ͻ����ŭ �迭�� ����� ������ ���� ������ ��� 
		 ��) temp = {3,3,5,5,5,5,5,5,2,4,4,4}
	 */	
	public static void main(String[] args) {
		int array[][] = {
				{3,2},{5,6},{2,1},{4,3}
			};
		int [] temp = new int[12];
		int index = 0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<array[i][1]; j++) {
				temp[index] = array[i][0];
				index++;
			}
		}
		System.out.println(Arrays.toString(temp));
	}
}