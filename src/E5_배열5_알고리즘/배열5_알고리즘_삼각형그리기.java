package E5_�迭5_�˰���;
public class �迭5_�˰���_�ﰢ���׸��� {
	public static void main(String[] args) {
		/*
		 * ���� 1)
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
		 * ���� 2)
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
		 * ���� 3)
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
		 * ���� 4)
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
		 * ���� 5)
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