package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����5 {
	/*
	 *  numberList = {1001, 1002, 1003, 1004, 1005};
	 *	scoreList  = {  87,   11,   45,   98,   23};
	 *  [����] �й��� �Է¹޾� ���� ����Ѵ�. 
		 		��, �����й� �Է� �� ����ó�� �Ͻÿ�.
		 ��)
		 �й� �Է� : 1002		���� : 11��
		 �й� �Է� : 1000		�ش��й��� �������� �ʽ��ϴ�. 
	 */	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numberList = {1001, 1002, 1003, 1004, 1005};
		int[] scoreList  = {  87,   11,   45,   98,   23};
		System.out.print("�й� �Է� : ");
		int num = scan.nextInt();
		for(int i=0; i<5; i++) {
			if(num == numberList[i]) {
				System.out.println("���� : " + scoreList[i]);
				break;
			}
			else {
				System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
				break;
			}
		}
		int number = scan.nextInt();
		int room = -1;
		for(int i = 0; i < 5; i++) {
			if(number == numberList[i]) {
				room = i;
			}
		}
		if(room == -1) { // room �� ã�� ���ϸ� -1 �״�� ��µȴ�.
			System.out.println("�ش��й��� �������� �ʽ��ϴ�.");
		}else {
			System.out.println(numberList[room]);
			System.out.println(scoreList[room]);
		}		
	}

}