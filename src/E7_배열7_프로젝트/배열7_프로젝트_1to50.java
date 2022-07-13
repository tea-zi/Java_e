package E7_�迭7_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭7_������Ʈ_1to50 {
	/* 
	 * [1 to 50]
	 * 1. ���ۿ��� 1 to 50 �̶�� �˻��Ѵ�.
	 * 2. 1 to 50 ���߷� ������ ������ ������ �ǽ��غ���.
	 * 3. ����ϰ� ����� 
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int arr[][] = new int[5][5];
		int num[] = new int[50];
			for(int i=1; i<=50; i++) {
				num[i-1] += i;
			}
			for(int i=0; i<100; i++) {
				int r1 = ran.nextInt(50);
				int r2 = ran.nextInt(50);
				if((num[r1]+20)/20 == (num[r2]+20)/20) {
					int temp = num[r1];
					num[r1] = num[r2];
					num[r2] = temp;
				}
			}
			System.out.println(Arrays.toString(num));
		int in = 0;
		int count = 1;
		while(true) {
			System.out.println("[1.����][0.����]");
			int sel = scan.nextInt();
			for(int i=0; i<25;) {
				int r1 = ran.nextInt(5);
				int r2 = ran.nextInt(5);
				if(arr[r1][r2] == 0) {
					arr[r1][r2] = num[i];
					i++;
					in = i;
				}
			}
			if(sel == 1) {
				while(true) {
					for(int y=0; y<5; y++) {
						for(int x=0; x<5; x++) {
							if(arr[y][x] == 0 && in < 50) {
								arr[y][x] = num[in];
								in++;
							}
						}
					}
					System.out.println(count);
					for(int i=0; i<5; i++) {
						for(int j=0; j<5; j++) {
							System.out.printf("[%2d]", arr[i][j]);
						}
						System.out.println();
					}
					System.out.print("y �Է� : ");
					int y = scan.nextInt();
					System.out.print("x �Է� : ");
					int x = scan.nextInt();
					if(arr[y][x] == count) {
						arr[y][x] = 0;
						count++;
					}
					if(count > 50) {
						System.out.println("�Ϸ�!!");
						break;
					}
				}
			}
			else if(sel == 0) {
				break;
			}
		}
	}
}