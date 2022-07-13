package E5_배열5_프로젝트;

import java.util.Scanner;

public class 배열5_프로젝트_그래프세로 {
	/*  
	    scoreList[] = {31, 76, 54, 2, 100, 23};
	    위 데이터는 학생 6명의 점수이다.		
		위 데이터를 그래프로 표현해볼려고한다.
	 	표시는 10의 자리숫자로 표현해서 개수만큼  * 로 출력할려고한다.
	 	전에는 왼쪽에서 오른쪽으로 표현했지만 이번엔 아래서 위로 표현할려고한다.		
		  
		---------------------------------		                
		                 *
		                 *
		                 *
		        *        *
		 	    *        *
		  	    *  *     *
		        *  *     *
		     *  *  *     *
		     *  *  *     *  *
		  	 *  *  *     *  *
		    31 76 54 2 100 23
		---------------------------------	
		    
	*/

	public static void main(String[] args) {
		int scoreList[] = {31, 76, 54, 2, 100, 23};
				           
		int count = 0;
		for(int i=0; i<=10; i++) {
			for(int j=0; j<scoreList.length; j++) {
				count = scoreList[j]/10;
				if(i == 10) {
					System.out.printf("%2d ",scoreList[j]);
				}
				else {
					if(9-count < i) {
						System.out.print(" * ");
					}
					else {
						System.out.print("   ");
					}
				}
			}
			System.out.println();

		}
		int [][] temp = new int[10][scoreList.length];
		int y = temp.length;
		int x = temp[0].length;
		//System.out.println(y);
		for(int i = 0; i < x; i++) {
			int score = scoreList[i]/10; // 3;			
			for(int j = 0; j < y - score; j++) {
				temp[j][i] = 1;
			}
		}
		for(int i = 0; i < temp.length; i++) {
			for(int j = 0; j < temp[i].length; j++) {
				if(temp[i][j] == 1) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
	//			System.out.print(temp[i][j]);
			}
			System.out.println();
		}	
	}
}