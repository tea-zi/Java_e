package E5_배열5_알고리즘;

import java.util.Scanner;

public class 배열5_알고리즘_소수여러개찾기 {
	/*
	 * [소수여러개찾기]
	 * 정수 한 개를 입력받아, 2부터 해당 숫자까지의 모든 소수 출력
	 * 예)
	 * 입력 : 20
	 * 2, 3, 5, 7, 11, 13, 17, 19
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int num = scan.nextInt();
		int array[] = new int[1000];
		int index = 0;
		for(int i=2; i<=num; i++) {
			int count = 0;
			boolean check = false;
			for(int k=0; k<index; k++) {
				if(i%array[k] == 0) {
					check = true;
				}
			}
			if(check == true) {
				continue;
			}
			for(int j=1; j<=i; j++) {
				if(i%j == 0) {
					System.out.printf("%d / %d\n",i,j);
					count++;
				}
			}
			if(count == 2) {
				System.out.println(i + " ");
				array[index] = i;
				index++;
			}
		}
	}		
}