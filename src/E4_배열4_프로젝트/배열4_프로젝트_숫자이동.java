package E4_�迭4_������Ʈ;

import java.util.Scanner;

public class �迭4_������Ʈ_�����̵� {
	/*
	 * [�����̵�]
       0. �Ʒ� �迭�� �簢������ ����Ѵ�.
	 * 1. �����ڴ� ����� �ִ�. 
	 * 	 [1] ����8�� �÷��̾��̴�. 
	 *   [2] ����0�� �̵��Ҽ��ִ� ���̴�. 
	 *   [3] ����1�� �̵��Ұ����� ���̴�. 
	 *   [4] ����3�� ���������̴�.
	 * 2. System.out.println("1.left  2.right 3.up 4.down");
	 * 	  	��ȣ�� �Է¹ް� �� �������� ��ĭ�� �̵� ����  
	 * 3. left 
	  		{1,1,1,1,1,
			 1,0,0,0,1,
			 1,8,0,0,1,
		     1,0,0,0,3,
			 1,1,1,1,1}; 	 
	 * 4.��� �̵��ϴٰ� 3�� �����ϸ� ����.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = {1,1,1,1,1,
					  1,0,0,0,1,
					  1,0,8,0,1,
					  1,0,0,0,3,
					  1,1,1,1,1};
		int player = 12; // ���� �÷��̾���ġ 
		boolean set = false;
		while(true) {
				for(int i=0; i<game.length; i++) {
					System.out.print(game[i] + " ");
					if(i%5 == 4) {
						System.out.println();
					}
				}
			if(set == true) {
				System.out.println("��������");
				break;
			}
			System.out.println("1.left  2.right 3.up 4.down");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("�������� ��ĭ �̵��մϴ�.");
				game[player] = 0;
				player--;
				if(game[player] == 1) {
					System.out.println("���� �־� �̵��� �� �����ϴ�.");
					player++;
				}
				else if(game[player] == 3) {
					System.out.println("����!!!");
					set = true;
				}
				game[player] = 8;
			}
			else if(sel == 2) {
				System.out.println("���������� ��ĭ �̵��մϴ�.");	
				game[player] = 0;
				player++;
				if(game[player] == 1) {
					System.out.println("���� �־� �̵��� �� �����ϴ�.");
					player--;
				}
				else if(game[player] == 3) {
					System.out.println("����!!!");
					set = true;
				}
				game[player] = 8;
			}
			else if(sel == 3) {
				System.out.println("���� ��ĭ �̵��մϴ�.");
				game[player] = 0;
				player -= 5;
				if(game[player] == 1) {
					System.out.println("���� �־� �̵��� �� �����ϴ�.");
					player += 5;
				}
				else if(game[player] == 3) {
					System.out.println("����!!!");
					set = true;
				}
				game[player] = 8;
			}
			else if(sel == 4) {
				System.out.println("�Ʒ��� ��ĭ �̵��մϴ�.");
				game[player] = 0;
				player += 5;
				if(game[player] == 1) {
					System.out.println("���� �־� �̵��� �� �����ϴ�.");
					player -= 5;
				}
				else if(game[player] == 3) {
					System.out.println("����!!!");
					set = true;
				}
				game[player] = 8;
			}
			else {
				System.out.println("����");
			}
		}
	}
}