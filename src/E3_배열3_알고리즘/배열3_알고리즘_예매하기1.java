package E3_배열3_알고리즘;

import java.util.Arrays;

public class 배열3_알고리즘_예매하기1 {
	/*
	 * 1) seatList 는 현제 영화관 예매상황 이다.
	 * 2) seatIndex 는 예매 할려는 좌석 번호이고
	 * 3) user 는 회원번호이다 
	 * 
	 * 4) seatIndex 와 user 를 가지고 예매후 전체 예매상황 출력 
	 * 5) 좌석이 비어있으면 예매할수있다.
	 * 6) 좌석이 이미 예매 되어있으면 예매 불가 
	 * 
	 * -예) 2 , 1003 ==> seatList[] = {1003,1003,1003,0,1002,0,1001};
	 * -예) 1 , 1002 ==> "x";
	 * -예) 3 , 1005 ==> seatList[] = {1003,1003,1003,1005,1002,0,1001};
	 * 
	 */
	
	public static void main(String[] args) {
			
		int seatList[] = {1003,1003,0,0,1002,0,1001};
		
		int seatIndex[] = {2,1,3};
		int user [] = {1003,1002,1005};
		
		for(int i = 0; i<user.length; i++) {
			System.out.print(seatIndex[i] + " , " + user[i] + " ==> ");
			if(seatList[seatIndex[i]] == 0) {
				seatList[seatIndex[i]] = user[i];
				System.out.println(Arrays.toString(seatList));
			}
			else {
				System.out.println(" x ");
			}
		}
	}
}