package E5_배열5_알고리즘;


public class 배열5_알고리즘_옆으로출력 {
	
	/* 
	 * 아래와같이 구구단을 옆으로 출력해보세요.
	 * 
	 * 2*1 = 2		3*1 = 3  .....  	9*1 = 9
	 * 2*2 = 4  	3*2 = 6	 .....		9*2 = 18
	 * 2*3 = 6  	3*3 = 9	 .....		9*3 = 27
	 * ...      	...					...
	 * ...      	...					...
	 * 2*9 = 18		3*9 = 27 .....		9*9 = 81
	 */
	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			for(int j = 2; j<10; j++) {
				System.out.printf("%2d * %2d = %2d ",j,i,i*j);
			}
			System.out.println();
		}

	}
}