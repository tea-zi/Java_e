package E1_배열1_알고리즘;

import java.util.Scanner;

public class 배열1_알고리즘_검색_문제 {
	/*
	 *  array = {1001, 20, 1002, 45, 1003, 54};
	 *  학번과 점수가 한쌍이다. ==>  1001:20 , 1002:45 , 1003:54
	 *  [문제] 학번을 입력하면 점수 출력한다.
	 *  [예] 1001==>20 , 1003 ==> 54
	 *  [문제] 점수를 입력하면 학번 출력한다. 
	 *  [예] 20 ==> 1001 , 45 ==> 1002
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int array[] = {1001, 20, 1002, 45, 1003, 54};
		System.out.print("학번 입력 : ");
		int in1 = scan.nextInt();
		System.out.print("성적 입력 : ");
		int in2 = scan.nextInt();
		for(int i=0; i<6; i++) {
				if(in1 == array[i]) {
					System.out.println(array[i+1]);
				}
				if(in2 == array[i]) {
					System.out.println(array[i-1]);
			}
		}
	}
}