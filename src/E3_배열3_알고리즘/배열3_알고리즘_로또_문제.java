package E3_배열3_알고리즘;

import java.util.Arrays;
import java.util.Random;

public class 배열3_알고리즘_로또_문제 {
	/*
	 * [문제]
	 * 
	 	[로또] 
		1~45사이의 랜덤값 6 개를 lotto1 에 저장할려고 한다.
		[조건] 중복되는숫자는 없어야한다. 
	*/
	public static void main(String[] args) {
		Random ran = new Random();
		int lotto1[] = new int[6];
		
		for(int i=0; i<6;) {
			int r = ran.nextInt(45)+1;
			boolean check = false;
			for(int j=0; j<i; j++) {
				if(lotto1[j] == r) {
					check = true;
					break;
				}
			}
			if(check == false) {
				lotto1[i] = r;
				i++;
			}
		}
		
		
		System.out.println(Arrays.toString(lotto1));
	}
}