package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�⺻�̷�5_�⺻����1_����2 {
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
		int temp[][] = new int [5][];
		int sum[] = new int[5];
		
		for(int i=0; i<temp.length; i++) {
			if(i == 0) {
				temp[i] = class1;
			}
			else if(i == 1) {
				temp[i] = class2;
			}
			else if(i == 2) {
				temp[i] = class3;
			}
			else if(i == 3) {
				temp[i] = class4;
			}
			else if(i == 4) {
				temp[i] = class5;
			}
		}
		for(int i=0; i<temp.length; i++) {
			for(int j=0; j<temp[i].length; j++) {
				sum[i] += temp[i][j];
			}
		}
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
				win[i] = temp[0];
				sum[maxindex] = 0;
			}
			else if(maxindex == 1) {
				win[i] = temp[1];
				sum[maxindex] = 0;
			}
			else if(maxindex == 2) {
				win[i] = temp[2];
				sum[maxindex] = 0;
			}
			else if(maxindex == 3) {
				win[i] = temp[3];
				sum[maxindex] = 0;
			}
			else if(maxindex == 4) {
				win[i] = temp[4];
				sum[maxindex] = 0;
			}
			System.out.print(maxindex + " ==> ");
			System.out.println(Arrays.toString(win[i]));
		}
	}
}
