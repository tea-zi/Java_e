package E6_�迭6_�˰���;

import java.util.Arrays;

public class �迭6_�˰���_��������ã�� {
	/*
	 input �� �迭���� ������   array�迭�� ����� ��ġ�ϰ�,
	  �׼����� ��ġ�ϸ�  true , �ƴϸ� false ��� 	
	  
	��) input1�� ������  6,1,8  �̰� array ��  
		index 5~7(6,1,8) �� ���� ������ ��ġ�Ѵ�.
	���)  true	
		  	
	��) input2�� ������ array �迭�� �ִ°���� ��ġ������, 
	   input2 ������ 6,3 �̰�, array �� ���� 3,6 ���� ������ �ٸ���.
	���) false
*/
	public static void main(String[] args) {		
		int array[] = {1,3,3,6,5,6,1,8,9};	
		int input1[] = {3,6,5};
		int input2[] = {6,3};
		int index = 0;
		/*while(true) {
			int count = 0;
			for(int i=index; i<array.length; i++) {
				if(input1[0] == array[i]) {
					index = i;
				}
			}
			for(int i=0; i<input1.length; i++) {
				if(input1[i] == array[index]) {
					index++;
					count++;
				}
				else {
					break;
				}
			}
			if(count == 3) {
				System.out.println("�ִ�.");
				break;
			}
			if(index == array.length) {
				System.out.println("����.");
				break;
			}
		}*/
		boolean a = false;
		for(int i=index; i<array.length; i++) {
			int count = 0;
			if(input1[0] == array[i]) {
				index = i;
				for(int j=0; j<input1.length; j++) {
					if(input1[j] == array[index]) {
						index++;
						count++;
					}
					else {
						break;
					}
				}
			}
			if(count == 3) {
				a = true;
				break;
			}
		}
		if(a == true) {
			System.out.println("�ִ�.");
		}
		else {
			System.out.println("����.");
		}
		/* ����
		 * int win = 0;
		for(int i = 0; i < array.length - (input1.length-1); i++) {
			int count = 0;
			for(int j = 0; j < input1.length; j++) {
				System.out.print("[" + input1[j] + " " + array[j + i]  + "]");
							
				if(input1[j] == array[j + i]) {
					count += 1;
				}
			}
			System.out.println();
			if(count == 3) {
				win = 1;
			}
		}
		if(win == 1) {
			System.out.println("�ִ�.");
		}else {
			System.out.println("����.");
		}*/
	}
}