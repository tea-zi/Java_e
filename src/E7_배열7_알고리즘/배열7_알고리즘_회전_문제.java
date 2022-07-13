package E7_�迭7_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭7_�˰���_ȸ��_���� {
	/*
	 * ����)  �Ʒ� ��ɾ �Է¹��������� block�迭�� 90�� ȸ���غ�����.
	 * [1.left_turn] [2.right_turn]
	 * 
	 * ��) [1.left_turn] (�������� 90�� ȸ��)
	 * 
	 * 4 8 12 16
	 * 3 7 11 15
	 * 2 6 10 14
	 * 1 5 9  13
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int block[][] = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16},
		};
		for(int i=0; i<block.length; i++) {
			for(int j=0; j<block[i].length; j++) {
				System.out.printf("[%d %d] ",i,j);
			}
			System.out.println();
		}
		while(true) {
			System.out.println("[1.left_turn][2.right_turn][0.exit]");
			int sel = scan.nextInt();
			for(int i=0; i<block.length; i++) {
				for(int j=0; j<block.length; j++) {
					System.out.printf("[%2d]",block[i][j]);
				}
				System.out.println();
			}
			if(sel == 1) {
				System.out.println("left_turn");
				int temp[][] = new int[4][4];
				for(int i=0; i<block.length; i++) {
					int y= block.length-1;
					for(int j=0; j<block.length; j++) {
						//System.out.printf("[i:%d j:%d] ==> [y:%d i:%d] ==> %2d , ",i,j,y,i,block[i][j]);
						temp[y][i] = block[i][j];
						y -= 1;
					}
					//System.out.println();
				}
				block = temp;
			}
			else if(sel == 2) {
				System.out.println("right_turn");
				int temp[][] = new int[4][4];
				int x = block.length-1;
				for(int i=0; i<block.length; i++) {
					for(int j=0; j<block.length; j++) {
						//System.out.printf("[i:%d j:%d] ==> [j:%d x:%d] ==> %2d , ",i,j,j,x,block[i][j]);
						temp[j][x] = block[i][j];
					}
					x--;
//					System.out.println();
				}
				block = temp;
			}
			else if(sel ==  0) {
				System.out.println("exit");
				break;
			}
			else {
				System.out.println("error");
			}
		}
		
	}
}