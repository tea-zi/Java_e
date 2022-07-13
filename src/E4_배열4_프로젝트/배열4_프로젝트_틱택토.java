package E4_배열4_프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 배열4_프로젝트_틱택토 {
	/* 
	 * [틱택토]
	 *  
	 * 	조건1) 구글 크롬에 "틱택토" 검색후 게임을 한번하고 
	 * 	          아래와같이 만들어보기.
	 *  조건2) P1 , P2 를 플레이어가 번갈아가면서 플레이.
	 *  조건3) 먼저 한줄을 완성하면 승리
	 *  [추천조건] P2 는 com으로 대체해보자.(com은 랜덤으로 플레이)
	 *
	 *=============
	 * [처음화면]
	 * 0,0,0
	 * 0,0,0
	 * 0,0,0
	 * [p1]인덱스 입력 : 6
	 * =============
	 * [1턴]
	 * 0,0,0
	 * 0,0,0
	 * 1,0,0
	 * [p2]인덱스 입력 : 1
	 * =============
	 * [2턴]
	 * 0,2,0
	 * 0,0,0
	 * 1,0,0
	 * [p1]인덱스 입력 : 3
	 * =============
	 * [3턴]
	 * 0,2,0
	 * 1,0,0
	 * 1,0,0
	 * [p2]인덱스 입력 : 2
	 * =============
	 * [4턴]
	 * 0,2,2
	 * 1,0,0
	 * 1,0,0
	 * [p1]인덱스 입력 : 0
	 * =============
	 * [5턴]
	 * 1,2,2
	 * 1,0,0
	 * 1,0,0
	 * [p1] 승리
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] tic = new int[9];
		int turn = 0;
		while(true) {
			for(int i=0; i<tic.length; i++) {
				System.out.print(tic[i] + " ");
				if(i%3 == 2) {
					System.out.println();
				}
			}
			if(turn%2 == 0) {
				System.out.print("[p1]인덱스 입력 : ");
				int me = scan.nextInt();
				if(tic[me] == 0) {
					tic[me] = 1;
					turn++;
				}
				else {
					System.out.println("--");
				}
			}
			else {
				System.out.print("[p2]인덱스 입력 : ");
				int com = ran.nextInt(tic.length-1);
				System.out.println(com);
				if(tic[com] == 0) {
					tic[com] = 2;
					turn++;
				}
				else {
					System.out.println("--");
				}
			}
			System.out.println("===============");
			int karo = 0;
			int sero = 0;
			int cor = 0;
			int p = 0;
			for(int i=0; i<3; i++) {
				if(tic[i] == tic[i+3] && tic[i] != 0) {
					sero++;
					if(tic[i+3] == tic[i+6]) {
						sero++;
						p = tic[i];
					}
					else {
						sero = 0;
					}	
				}
				if(tic[i] == tic[i+4] && i == 0 && tic[i] != 0) {
					cor++;
					if(tic[i+4] == tic[i+8]) {
						cor++;
						p = tic[i];
					}
					else {
						cor = 0;
					}
				}
				if(tic[i] == tic[i+2] && i == 2 && tic[i] != 0) {
					cor++;
					if(tic[i+2] == tic[i+4]) {
						cor++;
						p = tic[i];
						
					}
					else {
						cor = 0;
					}
				}
			}
			for(int i=0; i<tic.length-1; i++) {
				if(tic[i] == tic[i+1] && tic[i] != 0) {
					karo++;
					if(karo == 2) {
						p = tic[i];
						break;
					}
				}
				else {
					karo = 0;
				}
			}
			if(karo == 2 || sero == 2 || cor == 2) {
				for(int i=0; i<tic.length; i++) {
					System.out.print(tic[i] + " ");
					if(i%3 == 2) {
						System.out.println();
					}
				}
				System.out.println("player" + p + " 승리 ");
				break;
			}
		}
	}
}