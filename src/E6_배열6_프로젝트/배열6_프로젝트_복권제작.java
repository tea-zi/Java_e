package E6_�迭6_������Ʈ;

import java.util.Arrays;
import java.util.Random;

public class �迭6_������Ʈ_�������� {
	/*
	 * [��������]
	 * 1. lottoSet �迭�� 5 * 7 ������ �迭�̴�. 
	 * 2. ����1���� 7���̰� , �� 5���� ������ ������� �Ѵ�.  
	 * 3. ���� 1���� ������ 1�Ǵ� 7�� ������ �����Ѵ�. 
	 * 4. ���� 1���� 7�� �������� 3���̻��̸� "��÷" �̰� �� �̸��� "��" �̴�.
	 * 5. 5�� �����߿� 1���� ��÷�̰� 4���� ���� ������ �������� �����غ���.
	 * 
	 * ��) �Ʒ��� ���� ���ٸ� "��÷" �̰� ������ 4���� "��"�̴�.
	 * 1177117 (��)
	 * 1117771 (��÷)
	 * 7171117 (��)
	 * 7711771 (��)
	 * 7171717 (��)
	 * 
	 */

	public static void main(String[] args) {
		Random ran = new Random();
		int[][] lottoSet = new int[5][7];

		int r1 = ran.nextInt(5);
		System.out.println("��÷���� : " + r1);
		for(int i=0; i<lottoSet.length; i++) {
			int count = 0;
			boolean scount = false;
			for(int j=0; j<lottoSet[i].length;) {
				int r2 = ran.nextInt(2);
				if(i == r1) { // ��÷
					if(count == 3) {
						scount = true;
					}
					if(j >= 4 && scount == false) {
						lottoSet[i][j] = 7;
						j++;
					}
					else {
						if(r2 == 0) {
							lottoSet[i][j] = 1;
							j++;
						}
						else {
							lottoSet[i][j] = 7;
							j++;
						}
					}
				}
				else { // ��
					if(r2 == 0) {
						lottoSet[i][j] = 1;
						count = 0;
						j++;
					}
					else {
						if(count == 2) {
							lottoSet[i][j] = 1;
							count = 0;
							j++;
						}
						else {
							lottoSet[i][j] = 7;
							count++;
							j++;
						}
					}
				}
			}
		}
		for(int i=0; i<lottoSet.length; i++) {
			int win = 0;
			int count = 0;
			for(int j=0; j<lottoSet[i].length; j++) {
				if(lottoSet[i][j] == 7) {
					count++;
				}
				else {
					count = 0;
				}
				if(count == 3) {
					win = 1;
				}
				
			}
			System.out.print(Arrays.toString(lottoSet[i]));
			if(win == 1) {
				System.out.println("��÷");
			}
			else {
				System.out.println("��");
			}
		}
	}
}