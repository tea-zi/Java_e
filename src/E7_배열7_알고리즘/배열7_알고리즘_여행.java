package E7_배열7_알고리즘;

import java.util.Arrays;

public class 배열7_알고리즘_여행 {
	/*
		 철수는 여행을떠났다. 
		 8은 철수이고 7은 벽이고 0은 이동가능한곳이다.
		 dir 은 철수가 바라보는 방향이고 0~3까지 북동남서 의 방향을 표현한다. 	
		 input의 데이터는 1은 한칸전진이고 2는 좌회전(90도) 3은 우회전(90도)이다.
		  회전은 방향만 바뀌고 움직이는건 없다.
		 input을 전부 입력받고 해당내용을 전부 출력하시요.
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
		System.out.println("[0:북][1:동][2:남][3:서]");
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
				System.out.println(input[i] + " ==> "  + dir + "방향으로 한칸 전진");
				map[y][x] = 0;
				if(dir == 0) {
					y--;
					if(map[y][x] == 7 || y<0 || x<0 || y>=map.length || x>=map[0].length) {
						System.out.println("벽이 있어 전진할수없습니다.");
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
						System.out.println("벽이 있어 전진할수없습니다.");
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
						System.out.println("벽이 있어 전진할수없습니다.");
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
						System.out.println("벽이 있어 전진할수없습니다.");
						x++;
						map[y][x] = 8;
					}
					else {
					 map[y][x] = 8;
					}
				}
			}
			else if(input[i] == 2) {
				System.out.println("좌회전");
				dir--;
				if(dir < 0) {
					dir = 3;
				}
			}
			else if(input[i] == 3) {
				System.out.println("우회전");
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