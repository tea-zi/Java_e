package E5_�迭5_������Ʈ;

import java.util.Scanner;

public class �迭5_������Ʈ_�׷������� {
	/*  
	    scoreList[] = {31, 76, 54, 2, 100, 23};
	    �� �����ʹ� �л� 6���� �����̴�.		
		�� �����͸� �׷����� ǥ���غ������Ѵ�.
	 	ǥ�ô� 10�� �ڸ����ڷ� ǥ���ؼ� ������ŭ  * �� ����ҷ����Ѵ�.
	 	������ ���ʿ��� ���������� ǥ�������� �̹��� �Ʒ��� ���� ǥ���ҷ����Ѵ�.		
		  
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