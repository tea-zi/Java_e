package E1_배열1_프로젝트;

import java.util.Random;

public class 배열1_프로젝트_1과7만저장_문제 {	
	/*
	 * [문제] a 배열안에 1 또는 7만 랜덤으로 저장후 출력. 
	 * [예] 1,7,7,1,1,7,7
	 * [추가문제] [1 => 4개] [7 => 3개] 고정
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		int a [] = new int[7];
		int b = 0;
		while(true) {
			int r = ran.nextInt(10)+1;
			if(r==1 || r==7) {
				a[b] = r;
				b++;
			}
			if(b == 7) {
				break;
			}
		}
		for(int j=0; j<7; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println();
		for(int i = 0; i < 7; i++) {
			int r = ran.nextInt(2);
			if(r == 0) {
				a[i] = 1;
			}else if(r == 1) {
				a[i] = 7;
			}
		}
		
		for(int i = 0; i < 7; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		int c1 = 0;
		int c7 = 0;
		int index = 0;
		while(true) {
			int r = ran.nextInt(2);			
			if(r == 0 && c1 < 4) {
				a[index] = 1;
				index += 1;
				c1 += 1;
			}else if(r == 1 && c7 < 3) {
				a[index] = 7;
				index += 1;
				c7 += 1;
			}
			if(c1 == 4 && c7 == 3) {
				break;
			}
		//	System.out.println("~~");
		}
		for(int i = 0; i < 7; i++) {
			System.out.print(a[i] + " ");
		}
	}
}