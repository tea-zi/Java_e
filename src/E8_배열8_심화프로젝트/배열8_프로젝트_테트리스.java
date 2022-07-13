package E8_배열8_심화프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 배열8_프로젝트_테트리스 {
	public static void main(String[] args) {
		int sy = 20;
		int sx = 10;
		int[][] map = new int[sy][sx];
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int tList[][][] = { { { 0, 2, 0 }, { 0, 2, 0 }, { 0, 2, 0 }, }, { { 3, 3 }, { 0, 3 }, },
				{ { 4, 0 }, { 4, 4 }, }, { { 5, 5 }, { 5, 5 }, }, };
		int[][] tetris = { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 } };
		boolean blockNew = true;
		int y = 0;
		int x = 4;
		int size = 0;
		boolean over = false;
		while (true) {
			if (blockNew) {
				int r = ran.nextInt(tList.length);
				size = tList[r].length;
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						tetris[i][j] = tList[r][i][j];
//						System.out.println(over);
						System.out.println("map : " + map[y + i][x + j]);
						System.out.println("tetris : " + tetris[i][j]);
						if (map[y + i][x + j] == 1) {
							System.out.println("j : " + j);
							over = true;
							break;
						}
						map[y + i][x + j] = tetris[i][j];
//						System.out.println(map[y + i][x + j]);
					}
					if (over == true) {
						System.out.println(i);
						break;
					}
				}
				blockNew = false;
				System.out.println(over);
			}
			for (int i = 0; i < sy; i++) {
				for (int j = 0; j < sx; j++) {
					if (map[i][j] == 1) {
						System.out.print("[■]");
					} else if (map[i][j] == 0) {
						System.out.print("[□]");
					} else {
						System.out.print("[▦]");
					}
				}
				System.out.println();
			}
			System.out.println("-------------------------------");
			System.out.print("[1.left][2.right][3.down][4.turn]");
			int sel = scan.nextInt();
			if (sel == 0) {
				break;
			} else if (sel == 1) { // left
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						if (tetris[i][j] > 1) {
							map[y + i][x + j] = 0;
						}
					}
				}
				x -= 1;
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						if (tetris[i][j] > 1) {
							map[y + i][x + j] = tetris[i][j];
						}
					}
				}
				System.out.println(x);
			} else if (sel == 2) { // right
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						if (tetris[i][j] > 1) {
							map[y + i][x + j] = 0;
						}
					}
				}
				x += 1;
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						if (tetris[i][j] > 1) {
							map[y + i][x + j] = tetris[i][j];
						}
					}
				}
			} else if (sel == 3) { // down
				while (true) {
					boolean check = false;
					int mx = x;
					int my = y;
					my += size;
					for (int i = 0; i < size; i++) {

						if (my >= sy) {
							check = true;
						}
					}

					if (check == true) {
						for (int i = 0; i < size; i++) {
							for (int j = 0; j < size; j++) {
//								if (j < 0 || j >= sx)
//									continue;
								if (tetris[i][j] > 1) {
									map[y + i][x + j] = 1;
								}
							}
						}
						y = 0;
						x = 4;
						blockNew = true;
						break;
					}

					check = false;
					mx = x;
					my = y;
					my += 1;
					for (int i = 0; i < size; i++) {
						for (int j = 0; j < size; j++) {
//							if (j < 0 || j >= sx)
//								continue;
							if (mx + j < 0 || mx + j >= sx)
								continue;
							if (map[my + i][mx + j] == 1 && tetris[i][j] > 1) {
								check = true;
								break;
							}
						}

						if (check == true) {
							break;
						}
					}
					if (check == true) {
						for (int i = 0; i < size; i++) {
							for (int j = 0; j < size; j++) {

								if (tetris[i][j] > 1) {
									map[y + i][x + j] = 1;
								}
							}
						}

						y = 0;
						x = 4;
						blockNew = true;
						break;
					}

					for (int i = 0; i < size; i++) {
						for (int j = 0; j < size; j++) {

							if (tetris[i][j] > 1) {
								map[y + i][x + j] = 0;
							}
						}
					}
					y += 1;
					int blank1 = 0;
					int blank2 = 0;
					for (int i = 0; i < size; i++) {
						if (tetris[size - 1][i] == 0) {
							blank1++;
						}
						if (x + i >= 0 && x + i < sx) {
							if (map[sy - 1][x + i] == 0) {
								blank2++;
							}
						}
					}
					if (blank1 == size && blank2 == size) {
						y++;
					}
					for (int i = 0; i < size; i++) {
						for (int j = 0; j < size; j++) {
							if (tetris[i][j] > 1) {
								map[y + i][x + j] = tetris[i][j];
							}
						}
					}
				}
			} else if (sel == 4) { // turn
				int temp[][] = new int[tetris.length][tetris[0].length];
				int tx = size - 1;
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						temp[j][tx] = tetris[i][j];
						// map[y + i][x + j] = temp[j][tx];
					}
					tx--;
				}
				tetris = temp;
				for (int i = 0; i < size; i++) {
					for (int j = 0; j < size; j++) {
						map[y + i][x + j] = tetris[i][j];
					}
				}
			}
			// 라인 지위기
			boolean linecheck = false;
			int index = 0;
			while (true) {
				for (int i = sy - 1; i > 0; i--) {
					int count = 0;
					for (int j = 0; j < sx; j++) {
						if (map[i][j] == 1) {
							count++;
						}
					}
					if (count == sx) {
						linecheck = true;
						index = i;
						break;
					}
				}
				if (linecheck == true) {
					for (int i = 0; i < index - 1; i++) {
						for (int j = 0; j < sx; j++)
							map[index][j] = map[index - 1][j];
						index--;
					}
					for (int i = 0; i < sx; i++) {
						map[0][i] = 0;
					}
					break;
				} else {
					break;
				}

			}
			if (over == true) {
				System.out.println("Game Over");
				break;
			}
		}

	}

}
