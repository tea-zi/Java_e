package E1_�迭1_�⺻�̷�;

import java.util.Scanner;

public class E1_�迭_�⺻�̷�4_�л�����2 {
	/*
	 * 	 array = { 87, 11, 45, 98, 23 };
	  
		 [����1] �ε����� �Է¹޾� ���� ���
		 [����1] �ε��� �Է� : 1 ���� : 11��
	
		 [����2] ������ �Է¹޾� �ε��� ���
		 [����2] ���� �Է� : 11 �ε��� : 1
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = { 87, 11, 45, 98, 23 };
		System.out.print("�ε��� �Է� : ");
		int �ε��� = scan.nextInt();
		System.out.print("���� �Է� : ");
		int ���� = scan.nextInt();
		for(int i=0; i<5; i++) {
			if(i == �ε���) {
				System.out.println("�ε��� : " + i +"  ���� : " + array[i]);
			}
			if(array[i] == ����) {
				System.out.println("���� : " + array[i] + "  �ε��� : " + i);
			}
		}

	}

}