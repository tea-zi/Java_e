package E5_배열5_알고리즘;

import java.util.Scanner;

public class 배열5_알고리즘_그래프 {
	/*
	  	scoreList[] = {31, 76, 54, 2, 100, 23};
	  
		위 데이터는 학생 6명의 점수이다.	
		위 데이터를 그래프로 표현해볼려고한다.		
		 표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.		
		예)
		 31  ==> ***
		 76  ==> *******
		 54  ==> *****
		 2   ==> 
		 100 ==> **********
		 23  ==> **
	*/

	public static void main(String[] args) {
		int scoreList[] = {31, 76, 54, 2, 100, 23};
		
		for(int i=0; i<scoreList.length; i++) {
			int count = 0;
			System.out.printf("%3d  ==>  ",scoreList[i]);
			count = scoreList[i]/10;
			for(int j=0; j<count; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}