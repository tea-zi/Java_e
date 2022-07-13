package E6_배열6_알고리즘;

public class 배열6_알고리즘_세로출력 {
	/*
		yList 의 값들은 data 의 세로 인덱스를 뜻한다. 
		yList의 값들이 가르키는 세로줄을 출력 
		
		예) yList[0] = 1 ==> 0,0,2,1,4,1,1
		예) yList[1] = 3 ==> 0,0,0,0,0,0,3
		예) yList[2] = 2 ==> 0,0,0,3,2,4,4
		....
	 */
	public static void main(String[] args) {		
		int data[][] = {
			    {0,0,0,0,0},
				{0,0,0,0,3},
				{0,2,0,0,3},
				{3,1,3,0,1},
				{1,4,2,0,2},
				{4,1,4,0,4},
				{2,1,4,3,3},
		};		
		int[] yList = {1,3,2,2,0,1};
		
		for(int i=0; i<yList.length; i++) {
			System.out.printf("yList[%d] = %d ==> ",i,yList[i]);
			for(int j=0; j<data.length; j++) {
				System.out.print(data[j][yList[i]] + " ");
			}
			System.out.println();
		}
	}
}