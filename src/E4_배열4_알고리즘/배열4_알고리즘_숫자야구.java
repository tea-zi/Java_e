package E4_�迭4_�˰���;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭4_�˰���_���ھ߱� {
	/*
	 * [���� �߱� ����]
	 * 1. me�� 1~9 ������ ���� 3���� ����
	 *    (��, �ߺ��Ǵ� ���ڴ� ���� �Ұ�)
	 *    ��) 1,1,1 
	 * 2. com�� me�� ���� ������ ���� ������ �ݺ�
	 * 3. ���ڿ� �ڸ��� ������ 		strike += 1
	 *    ���ڸ� ���� �ڸ��� Ʋ���� 	ball += 1
	 * ��)
	 * ���� : 1 7 3
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
					System.out.println("�ߺ�");
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