package E3_�迭3_�˰���;

import java.util.Arrays;

public class �迭3_�˰���_�迭�ߺ�����1 {
	/*
		 [����] ���� �Է¹ް� ���� 
		 [����] ���࿡ �������� ������ ������ ����ù��°�� ��  �Ѱ��� ���� �� b �� ���������� ���� 
		 
		 		  data[] = {5,2,6,8,5,6};
		 		  
		 [��] 2 ==>  b [] = {5,6,8,5,6,0};
		 [��] 6 ==>  b [] = {5,2,8,5,6,0};
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
						3�� �ƴѰ�츸 �Է¹����ʰ� �����ϰ� �ϼ�
						*/
				}
			}
			b[b.length-1] = 0;			
		}
		System.out.println(Arrays.toString(b));
	}
}