package E7_�迭7_�˰���;

import java.util.Arrays;

public class �迭7_�˰���_���� {
	/*
		 ö���� ������������. 
		 8�� ö���̰� 7�� ���̰� 0�� �̵������Ѱ��̴�.
		 dir �� ö���� �ٶ󺸴� �����̰� 0~3���� �ϵ����� �� ������ ǥ���Ѵ�. 	
		 input�� �����ʹ� 1�� ��ĭ�����̰� 2�� ��ȸ��(90��) 3�� ��ȸ��(90��)�̴�.
		  ȸ���� ���⸸ �ٲ�� �����̴°� ����.
		 input�� ���� �Է¹ް� �ش系���� ���� ����Ͻÿ�.
	 */
	public static void main(String[] args) {
		int map[][] = {
				{0,0,0,0,0,0,0},	
				{0,7,7,7,7,0,0},	
				{0,7,0,0,7,0,0},	
				{0,7,0,8,7,0,0},	
				{0,0,0,0,7,0,0},	
				{0,0,0,0,7,7,0},	
				{0,0,0,0,0,0,0}
		};		
		System.out.println("[0:��][1:��][2:��][3:��]");
		int dir = 0;	
		int input[] = {1,1,2,1,1,2,1,1,3,1,1};
		int x = 0;
		int y = 0;
		for(int i=0; i<map.length; i++) {
			for(int j=0; j<map[i].length; j++) {
				if(map[i][j] == 8) {
					x = j;
					y = i;
				}
			}
		}
		for(int i=0; i<input.length; i++) {
			if(input[i] == 1) {
				System.out.println(input[i] + " ==> "  + dir + "�������� ��ĭ ����");
				map[y][x] = 0;
				if(dir == 0) {
					y--;
					if(map[y][x] == 7 || y<0 || x<0 || y>=map.length || x>=map[0].length) {
						System.out.println("���� �־� �����Ҽ������ϴ�.");
						y++;
						map[y][x] = 8;
					}
					else {
					 map[y][x] = 8;
					}
				}
				else if(dir == 1) {
					x++;
					if(map[y][x] == 7 || y<0 || x<0 || y>=map.length || x>=map[0].length) {
						System.out.println("���� �־� �����Ҽ������ϴ�.");
						x--;
						map[y][x] = 8;
					}
					else {
					 map[y][x] = 8;
					}
				}
				else if(dir == 2) {
					y++;
					if(map[y][x] == 7 || y<0 || x<0 || y>=map.length || x>=map[0].length) {
						System.out.println("���� �־� �����Ҽ������ϴ�.");
						y--;
						map[y][x] = 8;
					}
					else {
					 map[y][x] = 8;
					}
				}
				else if(dir == 3) {
					x--;
					if(map[y][x] == 7 || y<0 || x<0 || y>=map.length || x>=map[0].length) {
						System.out.println("���� �־� �����Ҽ������ϴ�.");
						x++;
						map[y][x] = 8;
					}
					else {
					 map[y][x] = 8;
					}
				}
			}
			else if(input[i] == 2) {
				System.out.println("��ȸ��");
				dir--;
				if(dir < 0) {
					dir = 3;
				}
			}
			else if(input[i] == 3) {
				System.out.println("��ȸ��");
				dir++;
				if(dir > 3) {
					dir = 0;
				}
			}
			for(int j=0; j<map.length; j++) {
			System.out.println(Arrays.toString(map[j]));
			}
			System.out.println("-----------------------------");
		}

	}
}