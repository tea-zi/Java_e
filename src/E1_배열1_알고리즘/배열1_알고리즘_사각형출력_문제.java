package E1_배열1_알고리즘;

public class 배열1_알고리즘_사각형출력_문제 {
	/*
	 * [문제] b 배열을 아래와같이 사각형모양으로출력한다. [힌트] 3칸마다 줄을 바꿔준다.
	 * 
	 * 1 2 3 4 5 6 7 8 9
	 * 
	 */

	public static void main(String[] args) {

		int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		for (int i = 0; i < 9; i++) {
			if (i % 3 == 0) {
				System.out.println();
			}
			System.out.print(b[i] + " ");
		}

		System.out.println();
		for (int i = 0; i < 9; i++) {
			System.out.print(b[i] + " ");
			if (i % 3 == 2) {
				System.out.println();
			}
		}
	}
}