package E2_�迭2_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭2_������Ʈ_�Ｎ���� {
	/*
	 *  �Ｎ���ǹ���) ����� 7�� �迭�� �ִ�. 
	 *   - [1. ���� ���Ȯ��] �Է½� "��÷" �Ǵ� "��" ��� 
	 *   - 1 �Ǵ� 7��  �������� �迭�� �����Ѵ�.   [��] 1,7,7,1,1,1,7
	 *   - 7�̿������� 3���̻��̸� "��÷" �ƴϸ� "��" �̴�.
	 *   - ��÷�̵Ǹ� 3000�� ȹ���Ѵ�.
	 *   - ���̵Ǹ� 1000�� �����Ѵ�.
	 *   
	 *   [����] �ݵ�� 7�� 3���̻� �־���Ѵ�. 
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[7];
		int money = 1000;
		boolean run = true;
		while(run) {
			System.out.println("[�ܾ� : " + money + "��]");
			System.out.println("[1. ���� ���Ȯ��]");
			System.out.println("[2. ������]");
			System.out.println("[0. ����]");
			int sel = scan.nextInt();
				int c1 = 0;
				for(int i=0; i<lotto.length;) {
					int r = ran.nextInt(2);
					if(r == 0 && c1 <4) {
						lotto[i] = 1;
						c1++;
						i++;
					}
					else if(r == 1) {
						lotto[i] = 7;
						i++;
					}
				}
			if (sel == 1) {
				System.out.println(Arrays.toString(lotto));
				int count = 0;
				for(int i=0; i<lotto.length; i++) {
					if(lotto[i] == 7 && count < 3) {
						count++;
						System.out.print(count + " ");
					}
					else if(lotto[i] == 1 && count < 3){
						count = 0;
					}
				}
				if(count >= 3) {
					System.out.println("��÷");
					money += 3000;
				}
				else {
					System.out.println("��");
					money -= 1000;
				}
			}
			else if(sel == 2) {
				System.out.println("������ �ݾ� : ");
				int c = scan.nextInt();
				money += c;
			}
			else if(sel == 0){
				break;
			}

		}

	}

}