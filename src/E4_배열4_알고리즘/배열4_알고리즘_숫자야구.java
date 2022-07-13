package E4_배열4_알고리즘;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열4_알고리즘_숫자야구 {
	/*
	 * [숫자 야구 게임]
	 * 1. me에 1~9 사이의 숫자 3개를 저장
	 *    (단, 중복되는 숫자는 저장 불가)
	 *    예) 1,1,1 
	 * 2. com과 me를 비교해 정답을 맞출 때까지 반복
	 * 3. 숫자와 자리가 같으면 		strike += 1
	 *    숫자만 같고 자리가 틀리면 	ball += 1
	 * 예)
	 * 정답 : 1 7 3
	 * 3 1 5		: 2b
	 * 1 5 6		: 1s
	 * ...
	 * 
	 */
	public static void main(String[] args) {	
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] com = {1, 7, 3};
		int[] me = new int[3];		
		while(true) {
			int index = 0;
			while(true) {
				if(index == 3) {
					break;
				}
				int r = ran.nextInt(9)+1;
				boolean check = false;
				for(int i=0; i<index; i++) {
					if(r == me[i]) {
						check = true;
						break;
					}
				}
				if(check == false) {
					me[index] = r;
					index++;
				}
				else {
					System.out.println("중복");
				}	
			}		
			
			System.out.println("============");
			int ball = 0;
			int strike = 0;
			for(int i=0; i<com.length; i++) {
				for(int j=0; j<me.length; j++) {
					if(com[i] == me[j]) {
						if(i == j) {
							strike++;
						}
						else {
							ball++;
						}
					}
				}
			}
			System.out.println(Arrays.toString(com));
			System.out.println(Arrays.toString(me));
			if(strike == 3) {
				break;
			}
		}
	}
}