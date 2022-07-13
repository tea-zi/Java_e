package E8_�迭8_��ȭ������Ʈ;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class �迭8_������Ʈ_������ũ_���� {
	/*
	 * [������ũ����]
	 * 1. 10x10 �迭�� 0���� ä���.
	 * 2. ������ũ�� 1234�� ǥ���Ѵ�.
	 * 3. �Ӹ� �����¿�� �̵��� �����ϸ�, ������ ����´�.
	 * 4. �ڱ���ϰ� �ε�����, ����Ѵ�.
	 * 5. �������� �������� ������
	 *    �������� ������ ���� 1���� �ڶ���.
	 * 6. ������ �ִ� 8������ ������ �� �ִ�.
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
			// ���� ��ġ
			for(int i=0; i<lan; i++) {
				int y = snake[i][0];
				int x = snake[i][1];
				map[y][x] = i+1;
			}
			// ������ ����
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
			// ���� ���
			for(int i=0; i<size; i++) {   
				for(int j=0; j<size; j++) {
					if(map[i][j] == 0) {
						System.out.print("[ ]");
					}
					else if(map[i][j] == -1) {
						System.out.print("[��]");
					}
					else if(map[i][j] == 1) {
						System.out.print("[S]");
					}
					else {
						System.out.print("[��]");
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
			// ���� �̵�
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