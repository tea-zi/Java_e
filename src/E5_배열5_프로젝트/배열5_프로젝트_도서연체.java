package E5_�迭5_������Ʈ;

public class �迭5_������Ʈ_������ü {
	/*
	 *  �Ʒ� �� �����������϶� ���� ��ü���� ���(��, ������ ��������ʴ´�)
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
		System.out.printf("%d�� %d�� %d��\n",year,month,day);
		int sum = 0;
		if(year > today[0]) {
			System.out.println("");
		}
		else if(year == today[0]) {
			if(month > today[1]) {
				for(int i=today[1]-1; i<month-1; i++) {
					sum += monthList[i];
				}
				System.out.printf("%d�� �� �ݳ�",sum-today[2]+day);
			}
			else if(month == today[1]) {
				if(day > today[2]) {
					System.out.printf("%d�ϵ� �ݳ�",day-today[2]);
				}
				else if(day == today[2]) {
					System.out.println("�ݳ���");
				}
				else if(day < today[2]) {
					System.out.printf("%d�� ��ü", today[2]-day);
				}
			}
			else {
			}
		}
		else {
			
		}
	}
}