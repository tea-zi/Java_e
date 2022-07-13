package E1_배열1_기본이론;

import java.util.Scanner;

public class E1_배열_기본이론4_학생성적3 {
	/*
	 *   numberList = { 1001, 1002, 1003, 1004, 1005 };
		 scoreList = { 87, 11, 45, 98, 23 };
		 [문제] 학번을 입력받아 성적 출력
		 [정답] 학번 입력 : 1003 성적 : 45점
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numberList = { 1001, 1002, 1003, 1004, 1005 };
		int[] scoreList = { 87, 11, 45, 98, 23 };
		System.out.print("학번 입력 : ");
		int 학번 = scan.nextInt();
		for(int i=0; i<5; i++) {
			if(학번 == numberList[i]) {
				System.out.println("학번 : " + 학번 + "  성적 : " + scoreList[i]);
			}
		}
	}

}