package E5_�迭5_�˰���;

import java.util.Scanner;

public class �迭5_�˰���_�׷��� {
	/*
	  	scoreList[] = {31, 76, 54, 2, 100, 23};
	  
		�� �����ʹ� �л� 6���� �����̴�.	
		�� �����͸� �׷����� ǥ���غ������Ѵ�.		
		 ǥ�ô� 10�� �ڸ����ڷ� ǥ���ؼ� ������ŭ  * �� ����ҷ����Ѵ�.		
		��)
		 31  ==> ***
		 76  ==> *******
		 54  ==> *****
		 2   ==> 
		 100 ==> **********
		 23  ==> **
	*/

	public static void main(String[] args) {
		int scoreList[] = {31, 76, 54, 2, 100, 23};
		
		for(int i=0; i<scoreList.length; i++) {
			int count = 0;
			System.out.printf("%3d  ==>  ",scoreList[i]);
			count = scoreList[i]/10;
			for(int j=0; j<count; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}