package E8_�迭8_��ȭ������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �迭8_������Ʈ_ũ�����������̵�_���� {
	/*
	 * [ũ������ �����̵�]
	 * 1. ���� ũ��� 7 x 7 �̴�. 
	 * 2. ��(1)��(2)��(3)��(4)�� �̵��� �����ϸ�,
	 *    ��ź��ġ(5), ����(6)�� �����Ѵ�. 
	 * 3. ��(3), �÷��̾�(2), ��ź(9), ������(4)�� �����Ѵ�.
	 * 4. ��, ��ź�� ��ġ�� ������� ������ �ϸ�,
	 *    ���� �� ���ڰ� ���·� ������.
	 * 5. �� �ı��� �������� �����ϰ� �����Ǿ�,
	 *    �������� ������ ��ġ�� �� �ִ� ��ź�� ������ �����ȴ�.
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
		// �� ��ġ
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
			System.out.printf("�� ��ġ���� ��ź ���� %d EA\n",bomb);
			System.out.printf("�� �����ִ� ��ź ���� %d EA\n",rem);
			System.out.printf("�� �����ִ� ���� ���� %d EA\n",wall);
			System.out.printf("�� ȹ���� ������ ���� %d EA\n",tem);
			System.out.println("-----------------------------------");
			System.out.printf("�� ��ġ�� ��ź�� ��ġ\n");
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
						System.out.print("[��]");
					}
					else if(a == 3) {
						System.out.print("[��]");
					}
					else if(a == 4) {
						System.out.print("[��]");
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
			if(sel == 1) { // ��
				y--;
				if(y == -1 || map[y][x] == 3) {
					System.out.println("�� �Դϴ�.");
					y++;
				}
				if(map[y][x] == 4) {
					tem++;;	
				}
			}
			else if(sel == 2) { // �Ʒ�
				y++;
				if(y == 7 || map[y][x] == 3) {
					System.out.println("�� �Դϴ�.");
					y--;
				}
				if(map[y][x] == 4) {
					tem++;	
				}
			}
			else if(sel == 3) { // ����
				x--;
				if(x == -1 || map[y][x] == 3) {
					System.out.println("�� �Դϴ�.");
					x++;
				}
				if(map[y][x] == 4) {
					tem++;	
				}
			}
			else if(sel == 4) { // ������
				x++;
				if(x == 7 || map[y][x] == 3) {
					System.out.println("�� �Դϴ�.");
					x--;
				}
				if(map[y][x] == 4) {
					tem++;	
				}
			}
			else if(sel == 5) { // ��ź ��ġ
				if(bomb == 0 && tem == 0 && rem == 0) {
					System.out.println("��ź�� �����մϴ�.");
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
			else if(sel == 6) { // ����
				ry = boom[0][0];
				rx = boom[0][1];
				if(map[ry][rx] == 9) {
					if(y == ry && x == rx) {
						die = true;				
					}
					// �Ʒ��� �˻�
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
					// ���� �˻�
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
					// ���� �˻�
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
					// ������ �˻�
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