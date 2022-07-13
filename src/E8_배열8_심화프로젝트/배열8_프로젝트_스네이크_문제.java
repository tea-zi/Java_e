package E8_배열8_심화프로젝트;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class 배열8_프로젝트_스네이크_문제 {
	/*
	 * [스네이크게임]
	 * 1. 10x10 배열을 0으로 채운다.
	 * 2. 스네이크는 1234로 표시한다.
	 * 3. 머리 상하좌우로 이동이 가능하며, 꼬리가 따라온다.
	 * 4. 자기몸하고 부딪히면, 사망한다.
	 * 5. 랜덤으로 아이템을 생성해
	 *    아이템을 먹으면 꼬리 1개가 자란다.
	 * 6. 꼬리는 최대 8개까지 증가할 수 있다.
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int size = 10;
		int map[][] = new int[size][size];
		int tem = 0;
		int snake[][] = new int[12][2];
		int lan = 4;
		for(int i=0; i<lan; i++) {
			snake[i][0] = 0;
			snake[i][1] = i;
		}
		while(true) {
			// 뱀의 위치
			for(int i=0; i<lan; i++) {
				int y = snake[i][0];
				int x = snake[i][1];
				map[y][x] = i+1;
			}
			// 아이템 생성
			if(tem == 0) {
				while(true) {
					int r1 = ran.nextInt(10);
					int r2 = ran.nextInt(10);
					if(map[r1][r2] == 0) {
						map[r1][r2] = -1;
						tem++;
						break;
					}
				}
			}
			// 지도 출력
			for(int i=0; i<size; i++) {   
				for(int j=0; j<size; j++) {
					if(map[i][j] == 0) {
						System.out.print("[ ]");
					}
					else if(map[i][j] == -1) {
						System.out.print("[★]");
					}
					else if(map[i][j] == 1) {
						System.out.print("[S]");
					}
					else {
						System.out.print("[■]");
					}
				}
				System.out.println();
			}
			
			System.out.print("[1.left][2.right][3.up][4.down] ");
			int sel = scan.nextInt();
			int yy = snake[0][0];
			int xx = snake[0][1];
			int yy2 = snake[1][0];
			int xx2 = snake[1][1];
			// 꼬리 이동
			map[snake[lan-1][0]][snake[lan-1][1]] = 0;
			for(int i=snake.length-1; i>0; i--) {
				snake[i][0] = snake[i-1][0];
				snake[i][1] = snake[i-1][1];
			}
			boolean check = false;
			boolean back = false;
			if(sel == 1) { // left
				xx--;
				if(xx == -1) {
					System.out.println(1);
					break;
				}
				if(map[yy][xx] == map[yy2][xx2]) {
					back = true;
				}
				else if(map[yy][xx] == 0) {
					snake[0][1] = xx;
					System.out.println(xx);
				}
				else if(map[yy][xx] == -1) {
					snake[0][1] = xx;
					check = true;
					System.out.println(lan);
				}
				else {
					System.out.println(2);
					break;
				}
			}
			else if(sel == 2) { // right
				xx++;
				if(xx == size) {
					System.out.println(1);
					break;
				}
				if(map[yy][xx] == map[yy2][xx2]) {
					back = true;
				}
				else if(map[yy][xx] == 0) {
					snake[0][1] = xx;
					System.out.println(xx);
				}
				else if(map[yy][xx] == -1) {
					snake[0][1] = xx;
					check = true;
					System.out.println(lan);
				}
				else {
					System.out.println(2);
					break;
				}
			}
			else if(sel == 3) {	// up
				yy--;
				if(yy == -1) {
					System.out.println(1);
					break;
				}
				if(map[yy][xx] == map[yy2][xx2]) {
					back = true;
				}
				else if(map[yy][xx] == 0) {
					snake[0][0] = yy;
					System.out.println(yy);
				}
				else if(map[yy][xx] == -1) {
					snake[0][0] = yy;
					check = true;
					System.out.println(lan);
				}
				else {
					System.out.println(2);
					break;
				}
			}
			else if(sel == 4) { // down
				yy++;
				if(yy == size) {
					System.out.println(1);
					break;
				}
				if(map[yy][xx] == map[yy2][xx2]) {
					back = true;
				}
				else if(map[yy][xx] == 0) {
					snake[0][0] = yy;
					System.out.println(yy);
				}
				else if(map[yy][xx] == -1) {
					snake[0][0] = yy;
					check = true;
					System.out.println(lan);
				}
				else {
					System.out.println(2);
					break;
				}
			}
			else {
				back = true;
			}
			if(check == true && lan < snake.length) {
				lan++;
				map[yy][xx] = 0;
				tem--;
			}
			if(back == true) {
				for(int i=0; i<snake.length-1; i++) {
					snake[i][0] = snake[i+1][0];
					snake[i][1] = snake[i+1][1];
				}
			}
		}
	}
}