package E2_�迭2_�˰���;

import java.util.Scanner;

public class �迭2_�˰���_��ȭ���� {

	/*
	 * # ��ȭ�� �¼�����
	 * 1. ����ڷκ��� �¼���ȣ(index)�� �Է¹޾� �����ϴ� �ý����̴�.
	 * 2. ���Ű� �Ϸ�Ǹ� �ش� �¼� ���� 1�� �����Ѵ�.
	 * 3. �̹� ���Ű� �Ϸ�� �¼��� �籸���� �� ����.
	 * 4. �� �¼��� ���� ������ 12000���̴�.
	 * 5. ���α׷� ���� ��, �ش� ��ȭ���� �� �ݾ��� ����Ѵ�.
	 * ��)
	 * seat = 0 0 0 0 0 0 0
	 * 
	 * �¼����� : 1
	 * seat = 0 1 0 0 0 0 0
	 * 
	 * �¼����� : 3
	 * seat = 0 1 0 1 0 0 0
	 * 
	 * �¼����� : 3
	 * seat = 0 1 0 1 0 0 0
	 * �̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.
	 * ----------------------
	 * �ѱݾ� : 24000��
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);		
		int[] seat = new int[7];
		int count = 0;
		boolean run = true;
		while(run) {
			System.out.println("=�ް� ��ȭ��=");				
			System.out.println("1.�¼�����");
			System.out.println("2.����");
			
			System.out.print("�޴� ���� : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				
				for(int i = 0; i < 7; i++) {
					System.out.print(seat[i] + " ");
				}
				System.out.println();	
				System.out.println("������ �¼��� �Է��ϼ���.");
				int s = scan.nextInt();
				if(seat[s] != 1) {
					seat[s] = 1;
					count++;
				}
				else {
					System.out.println("�̹� ���Ű� �Ϸ�� �ڸ��Դϴ�.");
				}
				
			}
			else if(sel == 2) {
				System.out.println("-----------------------------");
				System.out.println("�ѱݾ� : " + count*12000);
				run = false;
			}
		}
		
	}

}