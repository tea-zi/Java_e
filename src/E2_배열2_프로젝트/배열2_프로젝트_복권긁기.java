package E2_배열2_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열2_프로젝트_복권긁기 {
	/*
	 *  [복권긁기]
	  
	    랜덤으로 복권배열에 1 또는 7 을 저장한다. 
	    화면은 { * * * * * * * } 이렇게 출력한다.
		인덱스 3개를 고를수있고, 
		인덱스 3개의 값이 전부 7이면  당첨이다.
		
	    [조건1] 
	    	반드시 7은 3개이상 있어야 한다.	
			[예] 1,1,7,7,1,7,1
		
		[조건2] 
			한번 고른 인덱스는 또고를수없다. 		
			[예] 2,2,2
			
	 */
	
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		
		int 복권[] = new int[7];
		int c1 = 0;
		int c7 = 0;
		for(int i=0; i<복권.length;) {
			int r = ran.nextInt(2);
			if(r == 0 && c1 <=3) {
				복권[i] = 1;
				i++;
				c1++;
			}
			else if(r == 1){
				복권[i] = 7;
				i++;
			}
		}
		System.out.println(Arrays.toString(복권));
		boolean check[] = new boolean[7];
		int count = 0;
		while(true) {
			for(int i=0; i<복권.length; i++) {
				if(check[i] == false) {
					System.out.print(" * ");
				}
				else {
					System.out.print(복권[i]);
				}
			}
			System.out.println();
			
			if(count == 3) {
				break;
			}
			
			System.out.print("인덱스 입력 : ");
			int sel = scan.nextInt();
			if(sel < 0 || sel > 6) {
				System.out.println("오류");
			}
			if(check[sel] == false) {
				count++;
				check[sel] = true;
			}
			else if(check[sel] == true) {
				System.out.println("이미 선택한 인덱스입니다.");
			}	
		}
		
		int win = 0;
		for(int i=0; i<복권.length; i++) {
			if(check[i] == true && 복권[i] == 7) {
				win++;
			}
		}
		if(win == 3) {
			System.out.println("당첨");
		}
		else {
			System.out.println("꽝");
		}
	}
}