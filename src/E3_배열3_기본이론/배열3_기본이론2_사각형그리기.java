package E3_배열3_기본이론;
public class 배열3_기본이론2_사각형그리기 {
	
	/*
	 * [사각형그리기]
	 *  
	 *  아래와같은 사각형을 출력하시오.
	 * 
	 * ###
	 * ###
	 * ###
	 */
	
	public static void main(String[] args) {
	
		for(int i=0; i<9; i++) {
			System.out.print("#");
			if(i % 3 == 2) {
				System.out.println();
			}
		}
		System.out.println();

		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		
	}
		
}