package E1_�迭1_�˰���;

import java.util.Scanner;

public class �迭1_�˰���_�˻�_���� {
	/*
	 *  array = {1001, 20, 1002, 45, 1003, 54};
	 *  �й��� ������ �ѽ��̴�. ==>  1001:20 , 1002:45 , 1003:54
	 *  [����] �й��� �Է��ϸ� ���� ����Ѵ�.
	 *  [��] 1001==>20 , 1003 ==> 54
	 *  [����] ������ �Է��ϸ� �й� ����Ѵ�. 
	 *  [��] 20 ==> 1001 , 45 ==> 1002
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = {1001, 20, 1002, 45, 1003, 54};
		System.out.print("�й� �Է� : ");
		int in1 = scan.nextInt();
		System.out.print("���� �Է� : ");
		int in2 = scan.nextInt();
		for(int i=0; i<6; i++) {
				if(in1 == array[i]) {
					System.out.println(array[i+1]);
				}
				if(in2 == array[i]) {
					System.out.println(array[i-1]);
			}
		}
	}
}