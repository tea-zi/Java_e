package E7_배열7_기본이론;

import java.util.Arrays;

public class 배열7_기본이론5_기본문제1_문제 {
	/* 
	 * 아래 class1~5 배열은 각반의 시험점수를 저장한데이터이다.
	 * 
	 * 각반의 총점이 높은순서대로 세반을 을 뽑아서 win 배열에 저장후 
	 * win 배열의 모든 내용을 출력하시오.
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