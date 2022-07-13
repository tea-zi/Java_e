package E7_배열7_프로젝트;

import java.util.Scanner;

public class 배열7_프로젝트_식권자판기 {
	/*
	 [식권 자판기 프로그램]		
		 1) 관리자   2) 사용자 
		관리자 ==> 1) 식권충전   2) 잔돈 충전 	 3)뒤로가기
		사용자 ==> 1) 구입 ==> ==> 입금 금액 입력 ==> 구매 매수 입력  ==> 잔돈출력 	
	    	       2)뒤로가기
		 조건 ) 예) 잔돈이 7600원이다. 5000원권이 없으면 1000원짜리 7장거슬러준다. 
		화면 
		 식권 가격 : 3200원 
		 식권 	  : ??매  (매진시 매진) 
		 50000원 : ?? 매  	// 10000원 : ?? 매	// 5000원 : ?? 매
		 1000원 : ?? 매		//  500원 : ?? 개	  	//  100원 : ?? 개 
	*/
	

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int[] money   = {50000, 10000, 5000, 1000, 500, 100};
		int[] charges = {    1,     1,    1,    1,   5,  10};
		
		int tickets = 5;		// 식권 개수
		int price = 3200;		// 식권 가격
		
		while(true) {
			
			System.out.println("[1]관리자");
			System.out.println("[2]사용자");
			
			System.out.print("메뉴 선택 : ");
			int sel = scan.nextInt();
			
			if(sel == 1) {
				while(true) {
					System.out.println("1)식권충전");
					System.out.println("2)잔돈충전");
					System.out.println("0)뒤로가기");
					
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.print("식권충전 매수 : ");
						tickets += scan.nextInt();
						System.out.println("현재 총식권 : " + tickets);
					}
					else if(choice == 2) {
						for(int i=0; i<money.length; i++) {
							System.out.print(money[i] + "충전 : ");
							charges[i] += scan.nextInt();
						}
						for(int i=0; i<money.length; i++) {
							System.out.print(money[i] + "원 : " + charges[i] + " 매 ");
							if(i == money.length/2) {
								System.out.println();
							}
						}
						System.out.println();
					}
					else if(choice == 0) {
						break;
					}
				}
				
			}
			else if(sel == 2) {
				while(true) {
					System.out.println("1)구입");					
					System.out.println("0)뒤로가기");				
					System.out.print("메뉴 선택 : ");
					int choice = scan.nextInt();
					if(choice == 1) {
						System.out.print("입금 금액 : ");
						int don = scan.nextInt();
						System.out.print("식권 구매 개수 : ");
						int ea = scan.nextInt();
						if(don < ea*price) {
							System.out.println("금액이 부족합니다.");
						}
						else if(tickets < ea) {
							if(tickets == 0) {
								System.out.println("매진");
							}
							else {
								System.out.println(tickets + "개 구매가능");
							}
						}
						else {
							int cha = don - ea*price;
							int c = 0;
							int sum = 0;
							for(int i=0; i<money.length; i++) {
								c = cha/money[i];
								if(c > charges[i]) {
									c -= charges[i];
									cha = cha%money[i] + c*money[i];
									c = charges[i];
									charges[i] = 0;
								}
								else {
									charges[i] -= c;
									cha = cha%money[i];
								}
								System.out.print(money[i] + "원 : " + c + " 매 ");
								sum += money[i]*c;
								if(i==2) {
									System.out.println();
								}
							}
							if(sum < don-ea*price) {
								System.out.println("\n잔액이 부족합니다.");
								System.out.println(don-ea*price-sum +"부족");
							}
							System.out.println("거스름돈 : " + sum);
						}
					}
					else if(choice == 0) {
						break;
					}
				}
			}
		}
	}


}