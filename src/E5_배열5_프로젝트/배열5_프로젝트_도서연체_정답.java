package E5_배열5_프로젝트;

public class 배열5_프로젝트_도서연체_정답 {
	/*
	 *  아래 와 같은데이터일때 도서를 연체여부 출력(단, 윤년은 계산하지않는다)
	 */

	public static void main(String[] args) {
		int rentalPeriod = 70;
		int [] rentalDay = {2020 , 12, 29};
		int [] today = {2021, 3, 10};
		
		int monthList[] = {31, 28, 31, 30, 31, 31, 30,
				31 , 30 , 31 , 30 , 31};
				
		int rsum = 0;
		int tsum = 0;
		
		rsum += rentalDay[0] * 365;
		tsum += today[0] * 365;
		System.out.println(rsum + " " + tsum);
		
		for(int i = 0; i < rentalDay[1] - 1; i++) {
			rsum += monthList[i];
		}
		for(int i = 0; i < today[1]-1; i++) {
			tsum += monthList[i];
		}
		System.out.println(rsum + " " + tsum);
		rsum += rentalDay[2];
		tsum += today[2];
		System.out.println(rsum + " " + tsum);
		rsum += rentalPeriod;
		
		int result = rsum - tsum;
		System.out.println(result);
	}
}
