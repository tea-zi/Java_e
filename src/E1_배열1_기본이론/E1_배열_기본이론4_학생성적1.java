package E1_�迭1_�⺻�̷�;

import java.util.Random;

public class E1_�迭_�⺻�̷�4_�л�����1 {
	/*
		 [����1] array �迭�� 1~100�� ������ ���� ������ 5�� �����ϰ� ���
		 ��)    87, 11, 92, 14, 47
		
		 [����2] �������� ������ ��� ���
		 ��)    ����(251) ���(50.2)
		
		 [����3] ������ 60�� �̻��̸� �հ�. �հݻ� �� ���
		 ��)   2��
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] array = new int[5];
		int sum = 0;
		int count = 0;
		for(int i=0; i<5; i++) {
			int r = ran.nextInt(100)+1;
			array[i] = r;
			sum += array[i];
			System.out.print(array[i] + " ");
			if(array[i] >=60) {
				count++;
			}
		}
		System.out.println();
		System.out.println("���� : " + sum + "  ��� : " + sum/5.0);
		System.out.println("�հݻ��� : " + count);
	}

}