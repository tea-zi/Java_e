package E8_�迭8_��ȭ������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �迭8_������Ʈ_����ã�� {
	/*
	 * 	[����ã��]
	 * 
	 * 	[����]
	 * 		���� 1�� ����Ǿ��ִ°����� ����Ѵ�.
	 * 		������ �밢���� ���Եȴ�.
--------------------------------------------------------
		 ���� 9�� ���̴�.
		 ���� 1�� �����ִ� ��ġ�̴�.		
		 ����1�� ��ġ�� �ε��� 2���� �Է¹ް� 
		 ����1���� ���� ����� ���� ��� 
		 ������ 8������ ���Ѵ�.	
		 ��) 0,0 ==> 1�� �Ѱ��̹Ƿ� ==> 1��� 
		 ��) 2,0 ==> 1�� 2�� ����Ǿ������Ƿ� ==> 2��� 	
		 ��) 3,3 ==> 1�� 7�� ����Ǿ������Ƿ� ==> 7��� 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int arr[][] = {
				{1,9,9,9,1},
				{9,9,1,9,1},
				{1,9,1,1,9},
				{1,9,9,1,1}
		};
		int check[][] = new int[100][2];
		while(true) {
			System.out.println("y �Է� : ");
			int y = scan.nextInt();
			System.out.println("x �Է� : ");
			int x = scan.nextInt();
			int count = 0;
			if(arr[y][x] == 1) {
				check[count][0] = y;
				check[count][1] = x;
				count++;
			}
			else {
				System.out.println("��");
			}
			
		}
	}
}