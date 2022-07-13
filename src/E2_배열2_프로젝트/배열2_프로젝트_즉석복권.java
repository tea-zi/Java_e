package E2_배열2_프로젝트;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class 배열2_프로젝트_즉석복권 {
	/*
	 *  즉석복권문제) 사이즈가 7인 배열이 있다. 
	 *   - [1. 복권 결과확인] 입력시 "당첨" 또는 "꽝" 출력 
	 *   - 1 또는 7을  랜덤으로 배열에 저장한다.   [예] 1,7,7,1,1,1,7
	 *   - 7이연속으로 3개이상이면 "당첨" 아니면 "꽝" 이다.
	 *   - 당첨이되면 3000원 획득한다.
	 *   - 꽝이되면 1000원 감소한다.
	 *   
	 *   [조건] 반드시 7은 3개이상 있어야한다. 
	 */
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		int[] lotto = new int[7];
		int money = 1000;
		boolean run = true;
		while(run) {
			System.out.println("[잔액 : " + money + "원]");
			System.out.println("[1. 복권 결과확인]");
			System.out.println("[2. 돈충전]");
			System.out.println("[0. 종료]");
			int sel = scan.nextInt();
				int c1 = 0;
				for(int i=0; i<lotto.length;) {
					int r = ran.nextInt(2);
					if(r == 0 && c1 <4) {
						lotto[i] = 1;
						c1++;
						i++;
					}
					else if(r == 1) {
						lotto[i] = 7;
						i++;
					}
				}
			if (sel == 1) {
				System.out.println(Arrays.toString(lotto));
				int count = 0;
				for(int i=0; i<lotto.length; i++) {
					if(lotto[i] == 7 && count < 3) {
						count++;
						System.out.print(count + " ");
					}
					else if(lotto[i] == 1 && count < 3){
						count = 0;
					}
				}
				if(count >= 3) {
					System.out.println("당첨");
					money += 3000;
				}
				else {
					System.out.println("꽝");
					money -= 1000;
				}
			}
			else if(sel == 2) {
				System.out.println("충전할 금액 : ");
				int c = scan.nextInt();
				money += c;
			}
			else if(sel == 0){
				break;
			}

		}

	}

}