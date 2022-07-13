package E5_배열5_프로젝트;

public class 배열5_프로젝트_도서연체 {
	/*
	 *  아래 와 같은데이터일때 도서 연체여부 출력(단, 윤년은 계산하지않는다)
	 */

	public static void main(String[] args) {
		int rentalPeriod = 70;
		int [] rentalDay = {2021 , 11, 29};
		int [] today = {2021, 12, 10};
		
		int monthList[] = {31, 28, 31, 30, 31, 31, 30,
				31 , 30 , 31 , 30 , 31};
		int day = rentalDay[2]+70;
		int month = rentalDay[1];
		int year = rentalDay[0];
		while(true) {
			if(day > monthList[month-1]) {
				day -= monthList[month-1];
				if(month == 12) {
					year = rentalDay[0]+1;
					month = 0;
				}
			}
			else {
				break;
			}
			month++;
		}
		System.out.printf("%d년 %d월 %d일\n",year,month,day);
		int sum = 0;
		if(year > today[0]) {
			System.out.println("");
		}
		else if(year == today[0]) {
			if(month > today[1]) {
				for(int i=today[1]-1; i<month-1; i++) {
					sum += monthList[i];
				}
				System.out.printf("%d일 뒤 반납",sum-today[2]+day);
			}
			else if(month == today[1]) {
				if(day > today[2]) {
					System.out.printf("%d일뒤 반납",day-today[2]);
				}
				else if(day == today[2]) {
					System.out.println("반납일");
				}
				else if(day < today[2]) {
					System.out.printf("%d일 연체", today[2]-day);
				}
			}
			else {
			}
		}
		else {
			
		}
	}
}