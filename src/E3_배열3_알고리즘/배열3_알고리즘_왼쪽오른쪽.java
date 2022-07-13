package E3_배열3_알고리즘;

import java.util.Arrays;
import java.util.Scanner;

public class 배열3_알고리즘_왼쪽오른쪽 {
	/*
	 * [왼쪽오른쪽]
	 * 
	 *   아래 번호를 입력받고 각방향 으로 0 이아닌숫자를 모으시요.
		 1)left 2)right 	
		 예) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
		 예) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {0,2,0,3,4,0,0,5,0};	
		System.out.println("[1.left][2.right]");
		int sel = scan.nextInt();
		if(sel == 1) { // 왼쪽정렬
			int index = 0;
			int index2 = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[index] != 0) {
					int temp = arr[index];
					arr[index] = arr[index2];
					arr[index2] = temp;
					index2++;
				}
				index++;
			}
			System.out.println(Arrays.toString(arr));
		}
		else if(sel == 2) { // 오른쪽 정렬
			int index = arr.length-1;
			int index2 = arr.length-1;
			for(int i=0; i<arr.length; i++) {
				if(arr[index] != 0) {
					int temp = arr[index];
					arr[index] = arr[index2];
					arr[index2] = temp;
					index2--;
				}
				index--;
			}
			System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println("오류");
		}
	}
}