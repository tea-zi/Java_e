package E4_�迭4_�˰���;

import java.util.Arrays;

public class �迭4_�˰���_���μ����� {
	/*
	 * [���μ�����]
	 * 
	     �� �迭�� 1~9�� ������ ����Ǿ� �ִ� 9�� �������� �迭�̴�.
		 [����1] array �迭�� �� �Ͱ��� �簢�� ������� ��� �ϰ� 
		 ������ ���� ���� garo1[] �� ���ʴ�� ���� 
		 
		 [����2] array �迭�� �� �Ͱ��� �簢�� ������� ��� �ϰ� 
		 ������ ���� ���� sero1[] �� ���ʴ�� ���� 
		 
	 */
	public static void main(String[] args) {
		int array[] = {
				2, 4, 6,
				8, 1, 5,
				9, 7, 3
		};			
		int garo1[] = {0,0,0}; // {2+4+6 , 8+1+5 , 9+7+3}						
		int sero1[] = {0,0,0}; // {2+8+9 , 4+1+7 , 6+5+3}
		int gi = 0;
		int si = 0;
		for(int i = 0; i < array.length; i++) {		
			garo1[gi] += array[i];	
			sero1[si] += array[i];
			si += 1;
			System.out.print(array[i] + " ");
			if(i % 3 == 2) {
				System.out.println(garo1[gi]);
				gi += 1;
				si = 0;				
			}			
			if(i == array.length-1) {
				for(int j=0; j<sero1.length; j++) {
					System.out.print(sero1[j]);
				}
			}
		}
		System.out.println();
		System.out.println(Arrays.toString(garo1));		
		System.out.println(Arrays.toString(sero1));	
	}
}