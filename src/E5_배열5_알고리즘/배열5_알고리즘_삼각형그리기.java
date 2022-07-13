package E5_배열5_알고리즘;
public class 배열5_알고리즘_삼각형그리기 {
	public static void main(String[] args) {
		/*
		 * 문제 1)
		 * #
		 * ##
		 * ###
		 */
		for(int i=0; i<3; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 2)
		 * ###
		 * ##
		 * #
		 */
		for(int i=0; i<3; i++) {
			for(int j=i; j<3; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 3)
		 * @##
		 * @@#
		 * @@@
		 */
		for(int i=0; i<3; i++) {
			int count = i;
			for(int j=0; j<3; j++) {
				if(count >= j) {
					System.out.print("@");
				}
				else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 4)
		 *   #
		 *  ###
		 * #####
		 */
		int count = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<i+3; j++) {
				if(count >= j) {
					System.out.print(" ");
				}
				else {
					System.out.print("#");
				}
			}
			count--;
			System.out.println();
		}
		System.out.println();
		/*
		 * 문제 5)
		 * #####
		 *  ###
		 *   #
		 */
		count = 0;
		for(int i=0; i<3; i++) {
			for(int j=0; j<5-i; j++) {
				if(count > j) {
					System.out.print(" ");
				}
				else {
					System.out.print("#");
				}
			}
			count++;
			System.out.println();
		}
	}
		
}