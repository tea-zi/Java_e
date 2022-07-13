package E3_배열3_프로젝트;

import java.util.Arrays;
import java.util.Scanner;

public class 배열3_프로젝트_max게임 {
	/*
	 * [max게임]
	 * 
	 * 1. 가장 큰 값을 찾아 입력한다.
	 * 2. 정답이면 해당 값을 0으로 변경한다.
	 * 3. arr배열의 모든 값이 0으로 변경되면 프로그램은 종료된다.
	 * 예)
	 * 11, 87, 42, 100, 24
	 * 입력 : 100
	 * 
	 * 11, 87, 42, 0, 24
	 * 입력 : 87
	 * 
	 * 11, 0, 42, 0, 24
	 * 입력 : 24 ==> 최대값이 아니므로 아무일안생김
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		int count = 0;
		int max = 0;
		int index = 0;
		for(int i=0; i<arr.length;) {
			System.out.println(Arrays.toString(arr));
			System.out.print("입력 : ");
			int me = scan.nextInt();
			for(int j=0; j<arr.length; j++) {
				if(max < arr[j]) {
					index = j;
					max = arr[j];
				}
			}
			System.out.println(max + " " + index);
			if(me == max) {
				arr[index] = 0;
				i++;
				max = 0;
				index = 0;
			}
		}
		
	}
}