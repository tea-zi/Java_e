package E8_�迭8_��ȭ������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭8_������Ʈ_����Ǹ���_���� {
	/*
	   [������ ����]
	   	   
	   �Ʒ� ���� 2������� 2�ο����� �����. 3�������� ���� �¸��Ѵ�.
	   ���� �����ư��鼭 �ֻ����� ���� �̵����ڸ� ���Ѵ�. 
	   [��] �� �̵����ڸ�ŭ �̵� �ϴµ�, �ܰ����θ� �̵��Ѵ�.
	   
	   [����] �Ʒ��׸�����
	*/
	
     /*
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� ��
	 */
	
	/*
	 * �ֻ��� ==> 3 
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� ��
	 */
	
	/*
	 * �ֻ��� ==> 3 
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� �� 
	 * �� �� �� �� ��
	 */

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int p1[] = new int[16];
		int p2[] = new int[16];
		int map[][] = new int[5][5];
		boolean turn = false;
		p1[0] = 8;
		p2[0] = 8;
		int p1count = 0;
		int p2count = 0;
		int p[] = new int[p1.length];
		System.out.println("�� ��");
		System.out.println("========== Game Start ==========");
		while(true) {
			if(turn == false) {
				System.out.println("===== Player1 =====");
				p = p1;
			}
			else {
				System.out.println("===== Player2 =====");
				p = p2;
			}
			int y = 0;
			int x = 0;
			int index = 0;
			int count = 0;
			for(int i=0; i<p.length; i++) {
				if(p[i] == 8) {
					index = i;
				}
			}
//			for(int i=0; i<map.length; i++) {
//				System.out.println(Arrays.toString(map[i]));
//			}
			System.out.println("[1.�ֻ��� ������][2.����]");
			int sel = scan.nextInt();
			if(sel == 1) {
				int cube = ran.nextInt(6)+1;
				System.out.println("�ֻ��� ���� : " + cube);
				p[index] = 0;
				index += cube;
				if(index >= p.length) {
					index -= p.length;
					count++;
				}
				p[index] = 8;
				for(int i=0; i<p.length; i++) {
					map[y][x] = p[i];
					if(y == 0 && x<=3) {
						x++;
					}
					else if(x == 4 && y <= 3) {
						y++;
					}
					else if(y == 4 && x >= 1) {
						x--;
					}
					else if(x == 0) {
						y--;
					}
				}
				for(int i=0; i<5; i++) {
					for(int j=0; j<5; j++) {
						if(i == 0 || i == 4) {
							if(map[i][j] == 8) {
								System.out.printf("%2s", "��");
							}
							else {
								System.out.printf("%2s", "��");
							}
						}
						else {
							if(j == 0 || j == 4) {
								if(map[i][j] == 8) {
									System.out.printf("%2s", "��");
								}
								else {
									System.out.printf("%2s", "��");
								}
							}
							else {
								System.out.printf("%2s", "��");
							}
						}
					}
					System.out.println();
				}
				if(turn == false) {
					p1count += count;
					System.out.println("Player1 ������ : " + p1count);
					turn = true;
				}
				else {
					p2count += count;
					System.out.println("Player2 ������ : " + p2count);
					turn = false;
				}
				if(p1count == 3) {
					System.out.println("Player1 Win");
					break;
				}
				if(p2count == 3) {
					System.out.println("Player2 Win");
					break;
				}
			}
			else if(sel == 2) {
				break;
			}
		}
	}
}