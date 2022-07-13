package E8_배열8_심화프로젝트;

import java.util.Arrays;
import java.util.Random;

public class 배열8_프로젝트_경마게임_문제 {
	/*
		 [경마 게임]
		 [1] 5 * 20 의 배열이 있다.
		 [2] 각 줄은 말이 달릴 트랙을 의미한다.
		 [3] 매 턴당 랜덤으로 1~4칸의 거리를 이동할수있다.
		 [4] 말이 전부 도착하면 게임은 끝난다. 각말들의 순위를 출력한다. 
		 [5] 단, 말이 동시에 도착하면 등수는 같다. 
	*/
	public static void main(String[] args) {

		int horse[][] = new int[5][20];
		int line[][] = new int[5][20];
		Random ran = new Random();
		int rank[] = new int[5];
		int rcount = 0;
		for(int i=0; i<5; i++) {
			int sum = 0;
			for(int j=0; j<20; j++) {
				int dis = ran.nextInt(4)+1;
				sum += dis;
				if(sum == 19) {
					rank[i] = j;
					horse[i][j] = dis;
					break;
				}
				else if(sum > 19 ) {
					rank[i] = j;
					horse[i][j] = dis - (sum-19);
					break;
				}
				horse[i][j] = dis;
			}	
		}
		System.out.println(Arrays.toString(rank));
			for(int i=0; i<5; i++) {
				int ra = 1;
				int min = rank[i];
				for(int j=0; j<5; j++) {
					if(i != j) {
						if(min > rank[j]) {
							ra++;
						}			
					}
				}
				System.out.println(ra);
			}
		for(int i=0; i<5; i++) {
			System.out.println(Arrays.toString(horse[i]));
		}
		int cou = 0;
		int sum[] = new int [5];
		while(true) {
			int count = 0;
			for(int i=0; i<5; i++) {
				sum[i] += horse[i][cou];
				line[i][sum[i]] = 3;
				for(int j=0; j<20; j++) {
					if(line[i][j] == 3) {
						System.out.print("[옷]");
					}
					else {
						System.out.print("[ ]");
					}
					line[i][j] = 0;
				}
				System.out.println();
				if(sum[i] == 19) {
					count++;
				}
			}
			System.out.println("---------------------------------------------");
			if(count == 5) {
				break;
			}
			cou++;
		}
	}

}