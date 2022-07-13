package E8_�迭8_��ȭ������Ʈ;

import java.util.Arrays;
import java.util.Random;

public class �迭8_������Ʈ_�渶����_���� {
	/*
		 [�渶 ����]
		 [1] 5 * 20 �� �迭�� �ִ�.
		 [2] �� ���� ���� �޸� Ʈ���� �ǹ��Ѵ�.
		 [3] �� �ϴ� �������� 1~4ĭ�� �Ÿ��� �̵��Ҽ��ִ�.
		 [4] ���� ���� �����ϸ� ������ ������. �������� ������ ����Ѵ�. 
		 [5] ��, ���� ���ÿ� �����ϸ� ����� ����. 
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
						System.out.print("[��]");
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