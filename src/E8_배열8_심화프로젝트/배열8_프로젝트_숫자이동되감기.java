package E8_배열8_심화프로젝트;

import java.util.Scanner;

public class 배열8_프로젝트_숫자이동되감기 {
	/*
	 * [숫자이동되감기]
	    	     
		[1) left 2)right 3)up 4)down 5)되감기]
		 
		0 이 플레이어이다 .
		번호를 입력받고 해당위치로 이동 ==> 
		이동할때 값을 서로 교환한다. 

		 예) 1 ==>  left
	    {1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,14,0,15}		

	  
	    예) 1 ==>  left
	    {1,2,3,4},
		{5,6,7,8},
		{9,10,11,12},
		{13,0,14,15}		

		한칸한칸이동할때마다 yx 에 배열에 이동한경로를 저장했다가,
		5번입력시 ==> 왔던길로 되돌아가기 한다. 
	
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
				System.out.println("[1) left 2)right 3)up 4)down 5)되감기 0)종료]");
				int sel = scan.nextInt();
				if(sel == 1) {
					x--;
					if(x < 0) {
						System.out.println("더이상 이동할수없습니다.");
						x++;
					}
				}
				else if(sel == 2) {
					x++;
					if(x > 3) {
						System.out.println("더이상 이동할수없습니다.");
						x--;
					}
				}
				else if(sel == 3) {
					y--;
					if(y < 0) {
						System.out.println("더이상 이동할수없습니다.");
						y++;
					}
				}
				else if(sel == 4) {
					y++;
					if(y < 0) {
						System.out.println("더이상 이동할수없습니다.");
						y--;
					}
				}
				else if(sel == 5) {
					c = true;
					if(count == 0) {
						System.out.println("더이상 되감기 불가능");
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
					System.out.println("오류");
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