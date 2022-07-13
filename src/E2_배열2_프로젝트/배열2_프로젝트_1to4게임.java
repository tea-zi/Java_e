package E2_배열2_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열2_프로젝트_1to4게임 {
	/*
	 * [문제]
	 * 
	 * [1to4 게임]
	 * 
	 * [1] arr배열에 1~4 사이의 숫자를 중복없이 저장한다.
	 * [2] 사용자는 가장작은수1부터 순서대로 해당 방번호(인덱스)을 입력한다.
	 * [3] 정답을 맞추면 해당 값은 9로 변경되어 모든 값이 9가 되면 게임은 종료된다.
	 * 
	 * [예]
	 * 
	 * 시작 : { 4 2 3 1 }
	 * 
	 * 인덱스 입력 : 3  ==> { 4 2 3 9 } ==> 1은 가장작은수이므로 9로 변경한다.
	 * 
	 * 인덱스 입력 : 0 ==>  { 4 2 3 9 }  ==> 4는 가장작은수가아니므로 변화가없다.
     *
     * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] arr = new int[4];
		boolean[] check = new boolean[4];
		for(int i=0; i<arr.length;) {
			int num = ran.nextInt(4);
			if(check[num] == false) {
				check[num] = true;
				arr[i] = num+1;
				i++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=1; i<=arr.length;) {
			System.out.println(Arrays.toString(arr));
			System.out.print("인덱스 입력 : ");
			int sel = scan.nextInt();
			if(arr[sel] == i) {
				arr[sel] = 9;
				i++;
				if(i == 5) {
					System.out.println("게임종료");
				}
			}
		}
	}
}