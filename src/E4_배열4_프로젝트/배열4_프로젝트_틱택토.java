package E4_�迭4_������Ʈ;

import java.util.Random;
import java.util.Scanner;

public class �迭4_������Ʈ_ƽ���� {
	/* 
	 * [ƽ����]
	 *  
	 * 	����1) ���� ũ�ҿ� "ƽ����" �˻��� ������ �ѹ��ϰ� 
	 * 	          �Ʒ��Ͱ��� ������.
	 *  ����2) P1 , P2 �� �÷��̾ �����ư��鼭 �÷���.
	 *  ����3) ���� ������ �ϼ��ϸ� �¸�
	 *  [��õ����] P2 �� com���� ��ü�غ���.(com�� �������� �÷���)
	 *
	 *=============
	 * [ó��ȭ��]
	 * 0,0,0
	 * 0,0,0
	 * 0,0,0
	 * [p1]�ε��� �Է� : 6
	 * =============
	 * [1��]
	 * 0,0,0
	 * 0,0,0
	 * 1,0,0
	 * [p2]�ε��� �Է� : 1
	 * =============
	 * [2��]
	 * 0,2,0
	 * 0,0,0
	 * 1,0,0
	 * [p1]�ε��� �Է� : 3
	 * =============
	 * [3��]
	 * 0,2,0
	 * 1,0,0
	 * 1,0,0
	 * [p2]�ε��� �Է� : 2
	 * =============
	 * [4��]
	 * 0,2,2
	 * 1,0,0
	 * 1,0,0
	 * [p1]�ε��� �Է� : 0
	 * =============
	 * [5��]
	 * 1,2,2
	 * 1,0,0
	 * 1,0,0
	 * [p1] �¸�
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] tic = new int[9];
		int turn = 0;
		while(true) {
			for(int i=0; i<tic.length; i++) {
				System.out.print(tic[i] + " ");
				if(i%3 == 2) {
					System.out.println();
				}
			}
			if(turn%2 == 0) {
				System.out.print("[p1]�ε��� �Է� : ");
				int me = scan.nextInt();
				if(tic[me] == 0) {
					tic[me] = 1;
					turn++;
				}
				else {
					System.out.println("--");
				}
			}
			else {
				System.out.print("[p2]�ε��� �Է� : ");
				int com = ran.nextInt(tic.length-1);
				System.out.println(com);
				if(tic[com] == 0) {
					tic[com] = 2;
					turn++;
				}
				else {
					System.out.println("--");
				}
			}
			System.out.println("===============");
			int karo = 0;
			int sero = 0;
			int cor = 0;
			int p = 0;
			for(int i=0; i<3; i++) {
				if(tic[i] == tic[i+3] && tic[i] != 0) {
					sero++;
					if(tic[i+3] == tic[i+6]) {
						sero++;
						p = tic[i];
					}
					else {
						sero = 0;
					}	
				}
				if(tic[i] == tic[i+4] && i == 0 && tic[i] != 0) {
					cor++;
					if(tic[i+4] == tic[i+8]) {
						cor++;
						p = tic[i];
					}
					else {
						cor = 0;
					}
				}
				if(tic[i] == tic[i+2] && i == 2 && tic[i] != 0) {
					cor++;
					if(tic[i+2] == tic[i+4]) {
						cor++;
						p = tic[i];
						
					}
					else {
						cor = 0;
					}
				}
			}
			for(int i=0; i<tic.length-1; i++) {
				if(tic[i] == tic[i+1] && tic[i] != 0) {
					karo++;
					if(karo == 2) {
						p = tic[i];
						break;
					}
				}
				else {
					karo = 0;
				}
			}
			if(karo == 2 || sero == 2 || cor == 2) {
				for(int i=0; i<tic.length; i++) {
					System.out.print(tic[i] + " ");
					if(i%3 == 2) {
						System.out.println();
					}
				}
				System.out.println("player" + p + " �¸� ");
				break;
			}
		}
	}
}