package E3_�迭3_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭3_������Ʈ_�̴ϸ��� {
	/*
	 [�̴ϸ���]
	 * 1. �÷��̾�� [p1]�� [p2] 2���̴�. �ѹ��� ������ ���鼭 �ൿ�Ѵ�. 
	 * 2. [1.�ֻ���][2.�н�] �� �����Ҽ��ִ�. �ֻ����� (1~4)�� �������� ������. 
	 * 3. �ֻ������ڸ�ŭ ������ġ���� ������ �̵��Ѵ�. 
	 * 4. �̵����ڸ��� �ٸ� �÷��̾�� ���� ��ġ�� ���̰� �Ǹ�,
	 *    ��� �÷��̾�� ������ �Ǿ� �Ǿ�(�ε��� 0) ���� ���� �̵��ȴ�.
	 * 5. ��븦 ���� ��ġ�� �Ǿ�(�ε��� 0)�� ��ġ�� �������� ���������̴�.(�������ʴ´�.)
	 * 6. �̵��Ÿ��� �迭�� ��������ġ�� �ʰ��ϸ�,
	 *    �Ǿ�(�ε��� 0)���� �̵��ϰ� �ʰ��Ѽ��ڸ�ŭ �߰��̵��Ѵ�.
	 * 7. ���� 3������ ���� �̱��.
	 *  [p1] �ֻ��� : 1
	 *  1 0 0 0 0 0 0 0 0 0
	 *  2 0 0 0 0 0 0 0 0 0
	 *  [p2] �ֻ��� : 3
	 *  0 1 0 0 0 0 0 0 0 0
	 *  0 0 0 2 0 0 0 0 0 0
	 *  [p1] �ֻ��� : 2
	 *  [p1]�� [p2]�� ��Ҵ�!
	 *  0 0 0 0 1 0 0 0 0 0
	 *  2 0 0 0 0 0 0 0 0 0 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] map1   = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int[] map2   = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int p1 = 0;
		int p2 = 0;
		int count1 = 0;
		int count2 = 0;
		boolean turn = false;
		System.out.println("====== ���� ���� ======");
		while(true) {
			if(turn == false) {
				System.out.println("==== player1 ====");
			}
			else {
				System.out.println("==== player2 ====");
			}
			System.out.println("[1.�ֻ���][2.�н�]");
			int sel = scan.nextInt();
			if(sel == 1) {
				int r = ran.nextInt(4)+1;
				System.out.println(r);
				if(turn == true) {
					map2[p2] = 0;
					p2 += r;
					if(p2 == p1 && p2 != 0) {
						map1[p1] = 0;
						p1 = 0;
						map1[p1] = 1;
					}
					if(p2 >= map1.length) {
						p2 -= map1.length;
						count2++;
					}
					map2[p2] = 2;
					turn = false;
				}
				else {
					map1[p1] = 0;
					p1 += r;
					if(p2 == p1 && p1 != 0) {
						map2[p2] = 0;
						p2 = 0;
						map2[p2] = 2;
					}
					if(p1 >= map1.length) {
						p1 -= map1.length;
						count1++;
					}
						map1[p1] = 1;
						turn = true;
				}
				System.out.println(Arrays.toString(map1));
				System.out.println(Arrays.toString(map2));
			}
			else if(sel == 2) {
				if(turn == true) {
					turn = false;
				}
				else {
					turn = true;
				}
				System.out.println("pass");
			}
			if(count1 == 3) {
				System.out.println("player1 win");
				break;
			}
			if(count2 == 3) {
				System.out.println("player2 win");
				break;
			}
		}
	}
}