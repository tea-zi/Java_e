package E8_�迭8_��ȭ������Ʈ;

import java.util.Scanner;

public class �迭8_������Ʈ_�����̵��ǰ��� {
	/*
	 * [�����̵��ǰ���]
	    	     
		[1) left 2)right 3)up 4)down 5)�ǰ���]
		 
		0 �� �÷��̾��̴� .
		��ȣ�� �Է¹ް� �ش���ġ�� �̵� ==> 
		�̵��Ҷ� ���� ���� ��ȯ�Ѵ�. 

		 ��) 1 ==>  left
	    {1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,0,15}		

	  
	    ��) 1 ==>  left
	    {1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,0,14,15}		

		��ĭ��ĭ�̵��Ҷ����� yx �� �迭�� �̵��Ѱ�θ� �����ߴٰ�,
		5���Է½� ==> �Դ���� �ǵ��ư��� �Ѵ�. 
	
	 */
	
	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int game[][] = {
					{1,2,3,4},
					{5,6,7,8},
					{9,10,11,12},
					{13,14,15,0}
					};
			int yx [][] = new int[10000][2];
			int count = 0;
			int y = 0;
			int x = 0;
			while(true) {
				for(int i=0; i<game.length; i++) {
					for(int j=0; j<game[i].length; j++){
						if(game[i][j] == 0) {
							y = i;
							x = j;
							break;
						}
					}
				}
				yx[count][0] = y;
				yx[count][1] = x;
				int rey = yx[count][0];
				int rex = yx[count][1];
				boolean c = false;
				System.out.println("[1) left 2)right 3)up 4)down 5)�ǰ��� 0)����]");
				int sel = scan.nextInt();
				if(sel == 1) {
					x--;
					if(x < 0) {
						System.out.println("���̻� �̵��Ҽ������ϴ�.");
						x++;
					}
				}
				else if(sel == 2) {
					x++;
					if(x > 3) {
						System.out.println("���̻� �̵��Ҽ������ϴ�.");
						x--;
					}
				}
				else if(sel == 3) {
					y--;
					if(y < 0) {
						System.out.println("���̻� �̵��Ҽ������ϴ�.");
						y++;
					}
				}
				else if(sel == 4) {
					y++;
					if(y < 0) {
						System.out.println("���̻� �̵��Ҽ������ϴ�.");
						y--;
					}
				}
				else if(sel == 5) {
					c = true;
					if(count == 0) {
						System.out.println("���̻� �ǰ��� �Ұ���");
					}
					else {
						int y1 = yx[count][0];
						int x1 = yx[count][1];
						int y2 = yx[count-1][0];
						int x2 = yx[count-1][1];
						int temp = game[y1][x1];
						game[y1][x1] = game[y2][x2];
						game[y2][x2] = temp;
						yx[count][0] = 0;
						yx[count][1] = 0;
						count--;
					}
				}
				else if(sel == 0) {
					break;
				}
				else {
					System.out.println("����");
				}
				if(c == false) {
					int temp = game[y][x];
					game[y][x] = game[rey][rex];
					game[rey][rex] = temp;
					count++;
				}
				for(int i=0; i<4; i++) {
					for(int j=0; j<4; j++) {
						System.out.printf("[%2d]",game[i][j]);
					}
					System.out.println();
				}
			}
	}
}