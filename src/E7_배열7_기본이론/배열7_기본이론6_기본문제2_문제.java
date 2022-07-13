package E7_배열7_기본이론;

import java.util.Arrays;

public class 배열7_기본이론6_기본문제2_문제 {
	/* 
	 * 아래 classList배열은 다섯반의 시험점수를 저장한데이터이다.
	 * 
	 * 각반의 총점이 높은순서대로 세반을 을 뽑아서 win 배열에 저장후 
	 * win 배열의 모든 내용을 출력하시오.
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