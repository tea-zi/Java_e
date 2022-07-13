package E5_배열5_알고리즘;

import java.util.Scanner;

public class 배열5_알고리즘_다음소수찾기 {
	/*
	 *  [다음 소수 찾기]
	 * 1. 숫자를 한 개 입력받는다.
	 * 2. 입력받은 숫자보다 큰 첫 번째 소수를 출력한다.
	 * 
	 * 예) Enter Number ? 1000
	 *    1000보다 큰 첫번재 소수는 1009
	 * 예) Enter Number ? 500
	 *    500보다 큰 첫번째 소수는 503
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Number ? ");
		int number = scan.nextInt();
		for(int i=number; i<number+10; i++) {
			int count = 0;
			for(int j=1; j<number+10; j++) {
				if(i%j == 0) {
					count++;
				}
			}
			if(count == 2) {
				System.out.printf("%d보다 큰 첫번째 소수는 %d",number,i);
				break;
			}
		}
		System.out.println();
		for(int i=1; i<1004; i++) {
			if(1003%i == 0) {
				System.out.println(i);
			}
		}
	}
}