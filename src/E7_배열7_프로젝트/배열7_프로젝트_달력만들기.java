package E7_�迭7_������Ʈ;

import java.util.Scanner;

public class �迭7_������Ʈ_�޷¸���� {
	/*
	 	[�޷¸����]
	  	�⵵�� ���� �Է¹ް� �޷��� ����ÿ�.
	  	
	  	[�������] �Ʒ��� ���� ���� �̴�. 
	  	
	  	1. ��(year)�� 4�� �������� ����.
	  	2. 1�� ������ �´��� 100���� �������� ������ �ƴϴ�.  
		3. 2�� ������ �´��� 400���� �������� �����̴�.
	  	
	  	[���ϰ���]
	  	1��1��1�� �� �������̴�. 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int year = 2021;//scan.nextInt();
		int month = 9;//scan.nextInt();
		int monthList[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int total = (year-1)*365;
		total += (year-1)/4;
		total -= (year-1)/100;
		total += (year-1)/400;
		System.out.println(total);
		for(int i=0; i<month-1; i++) {
			if(i == 1) {
				if(year%400 == 0 || (year%4 == 0 && year%100 == 0)) {
					total++;
				}
			}
			total += monthList[i];
		}
		System.out.println(total);
		// 2021�� 1�� 1�Ϻ��� 8��31�ϱ��� ��� 		
				System.out.println("=======���=======");
				String week = "�Ͽ�ȭ�������";	;
				int weekIndex = total % 7;
				System.out.println(week.charAt(weekIndex + 1)); // 2021�� 9��1�� ������ 		
				System.out.println("---------------------------------------------------");
				for(int i = 0; i < week.length(); i++) {
					System.out.print(week.charAt(i) + "\t" );
				}
				System.out.println();
				for(int i = 0; i <= monthList[month-1] + weekIndex; i++) {
					if(i > weekIndex) {
						System.out.print((i - weekIndex) + "\t");
					}else {
						System.out.print("\t");
					}
					if(i % 7 == 6) {
						System.out.println();
					}
				}	
	}
}