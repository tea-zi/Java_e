package E7_배열7_알고리즘;

import java.util.Arrays;

public class 배열7_알고리즘_숫자9의개수_문제 {	
	/* 
	   mine = {0,9,0},
			  {9,0,9},
			  {0,0,9}
			  
	  	위 mine배열의 숫자 0의 자리에 숫자를 저장할려고한다.
	 	저장할숫자는 주변 8방향을 검사후 9의 개수를 저장후출력.
			
		 예) 아래와 같이 출력  
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