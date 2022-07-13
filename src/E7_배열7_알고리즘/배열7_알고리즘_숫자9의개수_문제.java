package E7_�迭7_�˰���;

import java.util.Arrays;

public class �迭7_�˰���_����9�ǰ���_���� {	
	/* 
	   mine = {0,9,0},
			  {9,0,9},
			  {0,0,9}
			  
	  	�� mine�迭�� ���� 0�� �ڸ��� ���ڸ� �����ҷ����Ѵ�.
	 	�����Ҽ��ڴ� �ֺ� 8������ �˻��� 9�� ������ ���������.
			
		 ��) �Ʒ��� ���� ���  
		   {2,9,2},
		   {9,4,9},
		   {1,3,9}
	
	 */
	public static void main(String[] args) {
		int mine[][] = {
				{0,9,0},
				{9,0,9},
				{0,0,9}
		};
		int sy = mine.length;
		int sx = mine[0].length;
		for(int i=0; i<sy; i++) {
			for(int j=0; j<sx; j++) {
				if(mine[i][j] == 0) {
					int count = 0;
					System.out.println("------------------");
					for(int y=i-1; y<=i+1; y++) {
						for(int x=j-1; x<=j+1; x++) {
							if(y<0 || x<0 || y>=sy || x>=sx) {
								System.out.print("[   ]");
								continue;
							}
							System.out.print("["+y + " " + x + "]");
							if(mine[y][x] == 9) {
								count++;
							}
						}
						System.out.println();
					}
					mine[i][j] = count;
				}
			}
		}
		for(int i=0; i<sy; i++) {
			System.out.println(Arrays.toString(mine[i]));
		}
	}
}