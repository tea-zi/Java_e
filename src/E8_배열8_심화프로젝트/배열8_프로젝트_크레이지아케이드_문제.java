package E8_배열8_심화프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 배열8_프로젝트_크레이지아케이드_문제 {
	/*
	 * [크레이지 아케이드]
	 * 1. 맵의 크기는 7 x 7 이다. 
	 * 2. 상(1)하(2)좌(3)우(4)로 이동이 가능하며,
	 *    폭탄설치(5), 폭파(6)로 설정한다. 
	 * 3. 벽(3), 플레이어(2), 폭탄(9), 아이템(4)로 설정한다.
	 * 4. 단, 폭탄이 설치된 순서대로 터져야 하며,
	 *    폭파 시 십자가 형태로 터진다.
	 * 5. 벽 파괴시 아이템이 랜덤하게 생성되어,
	 *    아이템을 먹으면 설치할 수 있는 폭탄의 개수가 증가된다.
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int map[][] = new int[7][7];
		int boom[][] = new int[10][2];
		int x = 3;
		int y = 3;
		map[y][x] = 2;
		int ry = 0;
		int rx = 0;
		int bcount = 0;
		int bomb = 1;
		int rem = 0;
		int wall = 0;
		int tem = 0;
		// 벽 설치
		for(int i=0; i<15;) {
			int r1 = ran.nextInt(7);
			int r2 = ran.nextInt(7);
			if(map[r1][r2] == 0) {
				map[r1][r2] = 3;
				wall++;
				i++;
			}
		}
		while(true) {
			System.out.println("-----------------------------------");
			System.out.println("            Crazy Arcade           ");
			System.out.println("-----------------------------------");
			System.out.printf("◈ 설치가능 폭탄 개수 %d EA\n",bomb);
			System.out.printf("◈ 남아있는 폭탄 개수 %d EA\n",rem);
			System.out.printf("◈ 남아있는 벽돌 개수 %d EA\n",wall);
			System.out.printf("◈ 획득한 아이템 개수 %d EA\n",tem);
			System.out.println("-----------------------------------");
			System.out.printf("◈ 설치된 폭탄의 위치\n");
			for(int i=0; i<bcount; i++) {
				ry = boom[i][0];
				rx = boom[i][1];
				if(map[ry][rx] == 9) {
					System.out.printf("[%d] ([%d] , [%d]\n)",i+1,ry,rx);
				}
			}
			System.out.println("-----------------------------------");
			if(map[y][x] != 9) {
				map[y][x] = 2;
			}
			boolean die = false;
			for(int i=0; i<7; i++) {
				for(int j=0; j<7; j++) {
					int a = map[i][j];
					if(a == 9) {
						System.out.print("[※]");
					}
					else if(a == 3) {
						System.out.print("[■]");
					}
					else if(a == 4) {
						System.out.print("[★]");
					}
					else if(a == 2) {
						System.out.print("[8]");
					}
					else if(a == 0){
						System.out.print("[ ]");
					}
				}
				System.out.println();
			}
			System.out.print("[1.up][2.down][3.left][4.right]\n[5.install][6.boom][0.exit]");
			int sel = scan.nextInt();
			System.out.println(y + " , " + x);
			if(map[y][x] != 9) {
				map[y][x] = 0;
			}
			if(sel == 1) { // 위
				y--;
				if(y == -1 || map[y][x] == 3) {
					System.out.println("벽 입니다.");
					y++;
				}
				if(map[y][x] == 4) {
					tem++;;	
				}
			}
			else if(sel == 2) { // 아래
				y++;
				if(y == 7 || map[y][x] == 3) {
					System.out.println("벽 입니다.");
					y--;
				}
				if(map[y][x] == 4) {
					tem++;	
				}
			}
			else if(sel == 3) { // 왼쪽
				x--;
				if(x == -1 || map[y][x] == 3) {
					System.out.println("벽 입니다.");
					x++;
				}
				if(map[y][x] == 4) {
					tem++;	
				}
			}
			else if(sel == 4) { // 오른쪽
				x++;
				if(x == 7 || map[y][x] == 3) {
					System.out.println("벽 입니다.");
					x--;
				}
				if(map[y][x] == 4) {
					tem++;	
				}
			}
			else if(sel == 5) { // 폭탄 설치
				if(bomb == 0 && tem == 0 && rem == 0) {
					System.out.println("폭탄이 부족합니다.");
					System.out.println("------------------------------");
					System.out.println("           You Lose           ");
					System.out.println("------------------------------");
					break;
				}
				map[y][x] = 9;
				bomb--;
				rem++;
				boom[bcount][0] = y;
				boom[bcount][1] = x;
				bcount++;
			}
			else if(sel == 6) { // 폭파
				ry = boom[0][0];
				rx = boom[0][1];
				if(map[ry][rx] == 9) {
					if(y == ry && x == rx) {
						die = true;				
					}
					// 아래쪽 검사
					if(ry < 6) {
						if(y == ry && x == rx) {
							die = true;
						}
						if(map[ry+1][rx] == 3) {
							map[ry+1][rx] = 0;
							if(map[ry+1][rx] == 4) {
								map[ry+1][rx] = 0;
							}
							int r = ran.nextInt(2)+3;
							System.out.println(r);
							if(r == 4) {
								System.out.println(1);
								map[ry+1][rx] = r;
							}
						}
					}
					// 위쪽 검사
					if(ry > 0) {
						if(y == ry && x == rx) {
							die = true;							
						}
						if(map[ry-1][rx] == 3) {
							map[ry-1][rx] = 0;
							if(map[ry-1][rx] == 4) {
								map[ry-1][rx] = 0;
							}
							int r = ran.nextInt(2)+3;
							System.out.println(r);
							if(r == 4) {
								map[ry-1][rx] = r;
								System.out.println(2);
							}
						}
					}
					// 왼쪽 검사
					if(rx > 0) {
						if(y == ry && x == rx) {
							die = true;
					}
					if(map[ry][rx-1] == 3) {
						map[ry][rx-1] = 0;
						if(map[ry][rx-1] == 4) {
							map[ry][rx-1] = 0;
						}
						int r = ran.nextInt(2)+3;
						System.out.println(r);
						if(r == 4) {
							map[ry][rx-1] = r;
								System.out.println(3);
							}
						}
					}
					// 오른쪽 검사
					if(rx < 6) {	
						if(y == ry && x == rx) {
							die = true;
						}
						if(map[ry][rx+1] == 3) {
							map[ry][rx+1] = 0;
							if(map[ry][rx+1] == 4) {
								map[ry][rx+1] = 0;
							}
							int r = ran.nextInt(2)+3;
							System.out.println(r);
							if(r == 4) {
								map[ry][rx+1] = r;
								System.out.println(4);
							}
						}
					}
					 map[ry][rx] = 0;
				}
				for(int i=0; i<bcount-1; i++) {
					boom[i] = boom[i+1];
				}
				boom[bcount-1][0] = 0;
				boom[bcount-1][1] = 0;
				 rem--;
				bcount--;
			}
			else if(sel == 0) {
				break;
			}
			if(die == true) {
				System.out.println("-----------------------------");
				System.out.println("           You Die           ");
				System.out.println("-----------------------------");
				break;
			}
		}
	}
}