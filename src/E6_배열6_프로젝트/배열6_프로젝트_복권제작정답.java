package E6_�迭6_������Ʈ;

import java.util.Arrays;
import java.util.Random;

public class �迭6_������Ʈ_������������ {
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
		int wincount = 0;
		for(int i = 0; i<lottoSet.length;) {
			int count = 0;
			boolean check = false;
			for(int j = 0; j<lottoSet[i].length; j++) {
				int r = ran.nextInt(2);
				if(r == 0) {
					lottoSet[i][j] = 1;
				}
				else {
					lottoSet[i][j] = 7;
				}
			}
			for(int j = 0; j<lottoSet[i].length; j++) {
				if(lottoSet[i][j] == 7) {
					count++;
					if(count == 3) {
						check = true;
						break;
					}
				}
				else {
					count = 0;
				}
			}
			if(check == true && wincount == 0) {
				wincount++;
				i++;
			}
			else if(check == false && wincount == 1) {
				i++;
			}
		}
		for(int i=0; i<lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		System.out.println("-------------------");
		for(int i=0; i<20; i++) {
			int r1 = ran.nextInt(lottoSet.length);
			int r2 = ran.nextInt(lottoSet.length);
			for(int j=0; j<lottoSet[0].length; j++) {
				int temp = lottoSet[r1][j];
				lottoSet[r1][j] = lottoSet[r2][j];
				lottoSet[r2][j] = temp;
			}
		}
		//���� �迭 ��ü�� �������� �ʰ� ��÷�� ���� �������� ����
		int r = ran.nextInt(lottoSet.length);
		
		int[] temp = lottoSet[0];
		lottoSet[0] = lottoSet[r];
		lottoSet[r] = temp;
		System.out.println("------------------");
		for(int i=0; i<lottoSet.length; i++) {
			System.out.println(Arrays.toString(lottoSet[i]));
		}
		for(int i=0; i<lottoSet.length; i++) {
			int count = 0;
			boolean check = false;
			for(int j=0; j<lottoSet[i].length; j++) {
				if(lottoSet[i][j] == 7) {
					count++;
					if(count == 3) {
						check = true;
						break;
					}
				}
				else {
					count = 0;
				}
			}
			if(check == true) {
				System.out.print(Arrays.toString(lottoSet[i]));
				System.out.println(" ==> \"��÷\"");
			}
			else {
				System.out.print(Arrays.toString(lottoSet[i]));
				System.out.println(" ==> \"��\"");
			}
		}
	}
}