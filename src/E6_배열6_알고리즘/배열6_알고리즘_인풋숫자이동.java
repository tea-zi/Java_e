package E6_배열6_알고리즘;

import java.util.Arrays;

public class 배열6_알고리즘_인풋숫자이동 {
	/*
		 [숫자이동게임]	
		 move = {1,0,0,0,8,0,0,0,1};	 
		 [1] move 안의 8은 플레이어이다
		 [2] move 안의 0은 이동할수있는 길이다.
		 [3] move 안의 1은 이동할수없는 벽이다. 

		 input 배열의 내용을 순차적으로 실행하고,결과출력하시오.
		 input의값중 1은 왼쪽이동 , 2는 오른쪽이동이다. 
		 벽에서 이동하면, "이동할수없습니다" 출력 		
		 시작=> {1,0,0,0,8,0,0,0,1};
		 1 ==> {1,0,0,8,0,0,0,0,1};
		 1 ==> {1,0,8,0,0,0,0,0,1};
		 1 ==> {1,8,0,0,0,0,0,0,1};
		 1 ==> "이동할수없습니다"
		 2 ==> {1,0,8,0,0,0,0,0,1};
		 2 ==> {1,0,0,8,0,0,0,0,1};
		 2 ==> {1,0,0,0,8,0,0,0,1};
	 */
	public static void main(String[] args) {
		
		int move[] = {1,0,0,0,8,0,0,0,1};		
		int input[] = {1,1,1,1,2,2,2};
		int index = 0;
		for(int i=0; i<move.length; i++) {
			if(move[i] == 8) {
				index = i;
			}
		}
		System.out.print("시작=> ");
		System.out.println(Arrays.toString(move));
		for(int i=0; i<input.length; i++) {
			System.out.print(input[i] + " ==> ");
			if(input[i] == 1) {
				move[index] = 0;
				index--;
				if(move[index] == 1) {
					System.out.println("\"이동할수없습니다.\"");
					index++;
					move[index] = 8;
				}
				else {
					move[index] = 8;
					System.out.println(Arrays.toString(move));
				}
			}
			else {
				move[index] = 0;
				index++;
				if(move[index] == 1) {
					System.out.println("\"이동할수없습니다.\"");
					index--;
				}
				else {
					move[index] = 8;
					System.out.println(Arrays.toString(move));
				}
			}
		}
	}
}