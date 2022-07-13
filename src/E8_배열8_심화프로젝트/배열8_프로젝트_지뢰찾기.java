package E8_배열8_심화프로젝트;

import java.util.Random;
import java.util.Scanner;

public class 배열8_프로젝트_지뢰찾기 {
	/*
	 * 	[지뢰찾기]
	 * 
	 * 	[목적]
	 * 		숫자 1이 연결되어있는개수를 출력한다.
	 * 		연결은 대각선도 포함된다.
--------------------------------------------------------
		 숫자 9는 벽이다.
		 숫자 1은 고를수있는 위치이다.		
		 숫자1의 위치를 인덱스 2개를 입력받고 
		 숫자1끼리 서로 연결된 개수 출력 
		 연결은 8방향을 말한다.	
		 예) 0,0 ==> 1이 한개이므로 ==> 1출력 
		 예) 2,0 ==> 1이 2개 연결되어있으므로 ==> 2출력 	
		 예) 3,3 ==> 1이 7개 연결되어있으므로 ==> 7출력 
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int arr[][] = {
				{1,9,9,9,1},
				{9,9,1,9,1},
				{1,9,1,1,9},
				{1,9,9,1,1}
		};
		int check[][] = new int[100][2];
		while(true) {
			System.out.println("y 입력 : ");
			int y = scan.nextInt();
			System.out.println("x 입력 : ");
			int x = scan.nextInt();
			int count = 0;
			if(arr[y][x] == 1) {
				check[count][0] = y;
				check[count][1] = x;
				count++;
			}
			else {
				System.out.println("벽");
			}
			
		}
	}
}