package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����3 {
	/*
	 *   numberList = { 1001, 1002, 1003, 1004, 1005 };
		 scoreList = { 87, 11, 45, 98, 23 };
		 [����] �й��� �Է¹޾� ���� ���
		 [����] �й� �Է� : 1003 ���� : 45��
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
		int[] scoreList = { 87, 11, 45, 98, 23 };
		System.out.print("�й� �Է� : ");
		int �й� = scan.nextInt();
		for(int i=0; i<5; i++) {
			if(�й� == numberList[i]) {
				System.out.println("�й� : " + �й� + "  ���� : " + scoreList[i]);
			}
		}
	}

}