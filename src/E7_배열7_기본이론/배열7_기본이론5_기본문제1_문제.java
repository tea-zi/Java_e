package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�⺻�̷�5_�⺻����1_���� {
	/* 
	 * �Ʒ� class1~5 �迭�� ������ ���������� �����ѵ������̴�.
	 * 
	 * ������ ������ ����������� ������ �� �̾Ƽ� win �迭�� ������ 
	 * win �迭�� ��� ������ ����Ͻÿ�.
	 * 
	 */
	public static void main(String[] args) {

		int class1[] = {10,54,65,22,15};
		int class2[] = {65,14,24,75,25};
		int class3[] = {50,45,25,87,49};
		int class4[] = {11,66,5,21,95};
		int class5[] = {70,84,64,21,11};
	
		int win[][] = new int[3][];
		int temp[][] =new int[5][];
		int sum[] = new int[5];
		for(int i=0; i<sum.length; i++) {
			for(int j=0; j<class1.length; j++) {
				if(i == 0) {
					sum[i] += class1[j];
				}
				else if(i == 1) {
					sum[i] += class2[j];
				}
				else if(i == 2) {
					sum[i] += class3[j];
				}
				else if(i == 3) {
					sum[i] += class4[j];
				}
				else if(i == 4) {
					sum[i] += class5[j];
				}
			}
		}
		System.out.println(Arrays.toString(sum));
		for(int i = 0; i<win.length; i++) {
			int max = 0;
			int maxindex = 0;
			for(int j=0; j<sum.length; j++) {
				if(max < sum[j]) {
					max = sum[j];
					maxindex = j;
				}	
			}
			if(maxindex == 0) {
				win[i] = class1;
				sum[maxindex] = 0;
			}
			else if(maxindex == 1) {
				win[i] = class2;
				sum[maxindex] = 0;
			}
			else if(maxindex == 2) {
				win[i] = class3;
				sum[maxindex] = 0;
			}
			else if(maxindex == 3) {
				win[i] = class4;
				sum[maxindex] = 0;
			}
			else if(maxindex == 4) {
				win[i] = class5;
				sum[maxindex] = 0;
			}
			System.out.println(Arrays.toString(win[i]));
		}
	}
}