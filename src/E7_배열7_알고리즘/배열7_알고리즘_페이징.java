package E7_�迭7_�˰���;

import java.util.Scanner;

public class �迭7_�˰���_����¡ {
	public static void main(String[] args) {
		
		/*
		 *  1~1000 ������ ���ڸ� �Է¹ް� ������ ���� ����Ͻÿ�.
		 *  �Է¹������� 
		 * 	1~10 ���� ���̸�  ==> 1
		 *  11~20 ���� ���̸� ==> 11 
		 *  21~30 ���� ���̸� ==> 21 
		 *  ......
		 *  
		 *  ��) 
		 *  	5 ==> 1
		 *  	24 ==> 21
		 *  	154 ==> 151 
		 *  	10 ==> 1
		 */
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num%10 == 0) {
			num = (num-1)/10*10+1;
		}
		else {
			num = num/10*10+1;
		}
		System.out.println(num);
	}
}