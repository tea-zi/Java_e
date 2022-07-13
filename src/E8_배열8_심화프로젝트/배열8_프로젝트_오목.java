package E8_배열8_심화프로젝트;

import java.util.Scanner;

public class 배열8_프로젝트_오목 {
	/*
	 * 우리가 알고있는오목을 만들어보자.
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int size = 10;
		int[][] omok = {
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
				{0,0,0,0,0,0,0,0,0,0},
		};
		boolean turn = false;
		int p = 0;
		int o = 0;
		int win = 0;
		while(true) {
			if(turn == false) {
				System.out.println("===== Player1 =====");
				p = 1;
				o = 2;				
			}
			else {
				System.out.println("===== Player2 =====");
				p = 2;
				o = 1;
			}
			System.out.println("[1.두기][0.종료]");
			int sel = scan.nextInt();
			if(sel == 1) {
				while(true) {
					System.out.print("y 입력 : ");
					int y = scan.nextInt();
					System.out.print("x 입력 : ");
					int x = scan.nextInt();
					if(y<0 || y>size-1 || x<0 || x>size-1) {
						continue;
					}
					if(omok[y][x] == 0) {
						omok[y][x] = p;
//						int xx = x+1;
//						int b = 1;
//						boolean check = false;
//						while(true) { // ->
//							if(xx >= size) {
//								break;
//							}
//							if(omok[y][xx] == o) {
//								break;
//							}
//							if(omok[y][xx] == p) {
//								check = false;
//							}
//							if(omok[y][xx] == 0) {
//								if(check == false) {
//									check = true;
//								}
//								else {
//									b++;
//									break;
//								}
//								if(b == 1) {
//									b--;
//								}
//								else {
//									break;
//								}
//								
//							}
//							x++;
//						}
//						xx = x-1;
//						while(true) { // <-
//							if(xx <= 0) {
//								break;
//							}
//							if(omok[y][xx] == o) {
//								break;
//							}
//							if(omok[y][xx] == p) {
//								check = false;
//							}
//							if(omok[y][xx] == 0) {
//								if(check == false) {
//									check = true;
//								}
//								else {
//									b++;
//									break;
//								}
//								if(b == 1) {
//									b--;
//								}
//								else {
//									break;
//								}
//								
//							}
//							x--;
//						}
//						int yy = y-1;
//						while(true) { // ->
//							if(yy <= 0) {
//								break;
//							}
//							if(omok[yy][x] == o) {
//								break;
//							}
//							if(omok[yy][x] == p) {
//								check = false;
//							}
//							if(omok[yy][x] == 0) {
//								if(check == false) {
//									check = true;
//								}
//								else {
//									b++;
//									break;
//								}
//								if(b == 1) {
//									b--;
//								}
//								else {
//									break;
//								}
//								
//							}
//							x++;
//						}
//						yy = y+1;
//						while(true) { // ->
//							if(yy >= size) {
//								break;
//							}
//							if(omok[yy][x] == o) {
//								break;
//							}
//							if(omok[yy][x] == p) {
//								check = false;
//							}
//							if(omok[yy][x] == 0) {
//								if(check == false) {
//									check = true;
//								}
//								else {
//									b++;
//									break;
//								}
//								if(b == 1) {
//									b--;
//								}
//								else {
//									break;
//								}
//								
//							}
//							x++;
//						}
						break;
					}
					else {
						System.out.println("이곳에는 둘수없습니다.");
					}
				}
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						System.out.printf("[%d]",omok[i][j]);
					}
					System.out.println();
				}
				for(int i=0; i<size; i++) {
					for(int j=0; j<size; j++) {
						int garo = 0;
						int sero = 0;
						int cro1 = 0;
						int cro2 = 0;
						if(omok[i][j] == p) {
							for(int k=1; k<5; k++) {
								if(j+k < size) {
									if(omok[i][j] == omok[i][j+k]) {
										garo++;
									}
								}
								if(i+k < size) {
									if(omok[i][j] == omok[i+k][j]) {
										sero++;
									}
								}
								if(i+k < size && j+k < size) {
									if(omok[i][j] == omok[i+k][j+k]) {
										cro1++;
									}
								}
								if(i+k < size && j-k >0) {
									if(omok[i][j] == omok[i+k][j-k]) {
										cro2++;
									}
								}
							}
						}
						if(garo == 4 || sero == 4 || cro1 == 4 || cro2 == 4) {
							win = p;
							break;
						}
					}
				}
				if(win == p) {
					System.out.println("Player" + p + " Win ");
					break;
				}
				else {
					if(p == 1) {
						turn = true;
					}
					else if(p == 2) {
						turn = false;
					}
				}
			}
			else if(sel == 0) {
				break;
			}
		}
	}
}