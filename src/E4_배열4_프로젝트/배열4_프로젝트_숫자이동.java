package E4_배열4_프로젝트;

import java.util.Scanner;

public class 배열4_프로젝트_숫자이동 {
	/*
	 * [숫자이동]
       0. 아래 배열을 사각형으로 출력한다.
	 * 1. 각숫자는 기능이 있다. 
	 * 	 [1] 숫자8는 플레이어이다. 
	 *   [2] 숫자0은 이동할수있는 길이다. 
	 *   [3] 숫자1은 이동불가능한 벽이다. 
	 *   [4] 숫자3은 골인지점이다.
	 * 2. System.out.println("1.left  2.right 3.up 4.down");
	 * 	  	번호를 입력받고 각 방향으로 한칸씩 이동 가능  
	 * 3. left 
	  		{1,1,1,1,1,
			 1,0,0,0,1,
			 1,8,0,0,1,
		     1,0,0,0,3,
			 1,1,1,1,1}; 	 
	 * 4.계속 이동하다가 3에 도착하면 종료.
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] game = {1,1,1,1,1,
					  1,0,0,0,1,
					  1,0,8,0,1,
					  1,0,0,0,3,
					  1,1,1,1,1};
		int player = 12; // 현재 플레이어위치 
		boolean set = false;
		while(true) {
				for(int i=0; i<game.length; i++) {
					System.out.print(game[i] + " ");
					if(i%5 == 4) {
						System.out.println();
					}
				}
			if(set == true) {
				System.out.println("게임종료");
				break;
			}
			System.out.println("1.left  2.right 3.up 4.down");
			int sel = scan.nextInt();
			if(sel == 1) {
				System.out.println("왼쪽으로 한칸 이동합니다.");
				game[player] = 0;
				player--;
				if(game[player] == 1) {
					System.out.println("벽이 있어 이동할 수 없습니다.");
					player++;
				}
				else if(game[player] == 3) {
					System.out.println("골인!!!");
					set = true;
				}
				game[player] = 8;
			}
			else if(sel == 2) {
				System.out.println("오른쪽으로 한칸 이동합니다.");	
				game[player] = 0;
				player++;
				if(game[player] == 1) {
					System.out.println("벽이 있어 이동할 수 없습니다.");
					player--;
				}
				else if(game[player] == 3) {
					System.out.println("골인!!!");
					set = true;
				}
				game[player] = 8;
			}
			else if(sel == 3) {
				System.out.println("위로 한칸 이동합니다.");
				game[player] = 0;
				player -= 5;
				if(game[player] == 1) {
					System.out.println("벽이 있어 이동할 수 없습니다.");
					player += 5;
				}
				else if(game[player] == 3) {
					System.out.println("골인!!!");
					set = true;
				}
				game[player] = 8;
			}
			else if(sel == 4) {
				System.out.println("아래로 한칸 이동합니다.");
				game[player] = 0;
				player += 5;
				if(game[player] == 1) {
					System.out.println("벽이 있어 이동할 수 없습니다.");
					player -= 5;
				}
				else if(game[player] == 3) {
					System.out.println("골인!!!");
					set = true;
				}
				game[player] = 8;
			}
			else {
				System.out.println("오류");
			}
		}
	}
}