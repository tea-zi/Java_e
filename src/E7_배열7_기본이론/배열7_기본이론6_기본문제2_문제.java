package E7_�迭7_�⺻�̷�;

import java.util.Arrays;

public class �迭7_�⺻�̷�6_�⺻����2_���� {
	/* 
	 * �Ʒ� classList�迭�� �ټ����� ���������� �����ѵ������̴�.
	 * 
	 * ������ ������ ����������� ������ �� �̾Ƽ� win �迭�� ������ 
	 * win �迭�� ��� ������ ����Ͻÿ�.
	 * 
	 */
	public static void main(String[] args) {
		int classList[][] = {
				 {10,54,65,22,15},
				 {65,14,24,75,25},
				 {50,45,25,87,49},
				 {11,66,5,21,95},
				 {70,84,64,21,11}
		};
		int win[][] = new int[3][];
		int sum[] = new int[5];
		for(int i=0; i<classList.length; i++) {
			for(int j=0; j<classList[i].length; j++) {
				sum[i] += classList[i][j]; 
			}
		}
		System.out.println(Arrays.toString(sum));
		
		for(int i=0; i<win.length; i++) {
			int max = 0;
			int maxin = 0;
			for(int j=0; j<sum.length; j++) {
				if(max < sum[j]) {
					max = sum[j];
					maxin = j;
				}
			}
			win[i] = classList[maxin];
			sum[maxin] = 0;
			System.out.println(Arrays.toString(win[i]));
		}
	}

}