package E8_배열8_심화프로젝트;

import java.util.Arrays;

public class 배열8_프로젝트_달팽이_문제 {
	/*
	 * [달팽이] 아래와같이 출력하시오.
	 * 
	 * 
	 * 1 2 3 4 5 16 17 18 19 6 15 24 25 20 7 14 23 22 21 8 13 12 11 10 9
	 */

	public static void main(String[] args) {
		int size = 5;
		int arr[][] = new int[5][5];
		int num[] = new int[25];
		int y = 0;
		int x = -1;
		int dir = 1;
		System.out.println(arr[1][0]);
		for (int i = 0; i < num.length; i++) {
			num[i] = i + 1;
		}
		System.out.println(Arrays.toString(num));
		for (int i = 0; i < num.length;) {
			if (dir == 1) { // ->
				while (true) {
					System.out.println("i : " + i);
					System.out.println("x : " + x);
					x++;
					if (x == size) {
						dir = 2;
						x--;
						break;
					}
					if (arr[y][x] != 0) {
						dir = 2;
						x--;
						break;
					}
					System.out.println(num[i]);
					arr[y][x] = num[i];
					System.out.printf("arr[%d][%d] : %d\n", y, x, arr[y][x]);
					i++;
				}
			} else if (dir == 2) { // ▽
				while (true) {
					System.out.println("i : " + i);
					System.out.println("y : " + y);
					y++;
					if (y == arr.length) {
						dir = 3;
						y--;
						break;
					}
					if (arr[y][x] != 0) {
						dir = 3;
						y--;
						break;
					}
					arr[y][x] = num[i];
					System.out.printf("arr[%d][%d] : %d\n", y, x, arr[y][x]);
					i++;
				}
			} else if (dir == 3) { // △
				while (true) {
					System.out.println("i : " + i);
					System.out.println("x : " + x);
					x--;
					if (x == -1) {
						dir = 4;
						x++;
						break;
					}
					if (arr[y][x] != 0) {
						dir = 4;
						x++;
						break;
					}
					arr[y][x] = num[i];
					System.out.printf("arr[%d][%d] : %d\n", y, x, arr[y][x]);
					i++;
				}
			} else if (dir == 4) { // <-
				while (true) {
					System.out.println("i : " + i);
					System.out.println("y : " + y);
					y--;
					if (y == -1) {
						dir = 1;
						y++;
						break;
					}
					if (arr[y][x] != 0) {
						dir = 1;
						y++;
						break;
					}
					arr[y][x] = num[i];
					System.out.printf("arr[%d][%d] : %d\n", y, x, arr[y][x]);
					i++;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.printf("[%2d]", arr[i][j]);
			}
			System.out.println();
		}
	}
}