package E1_배열1_알고리즘;

public class 배열1_알고리즘_교차저장_문제 {
	/*
	 * [문제1] a의 값과 b의 값을 번갈아가면서 c에 저장한다.
	 * [예] 
	 * 	c = {10,40,20,50,30,60}
	 * 
	 * 
	 * [문제2] d의 값을 번갈아가면서 e, f 에 각각 저장 
	 * [예]
	 * 	e = {10,30,50}
	 * 	f = {20,40,60};
	 * 
	 */
	public static void main(String[] args) {
	
		int a[] = {10,20,30};
		int b[] = {40,50,60};
		int c[] = {0,0,0,0,0,0};
			
		int d[] = {10,20,30,40,50,60};
		int e[] = {0,0,0};
		int f[] = {0,0,0};
		int j = 0;
		for(int i=0; i<6; i++) {
			if(i%2 == 0) {
				c[i] = a[j];
			}
			else {
				c[i] = b[j];
				j++;
			}
			System.out.print(c[i] + " ");
		}
		System.out.println();
		j = 0;
		for(int i=0; i<6; i++) {
			if(i%2 == 0) {
				e[j] = d[i];
			}
			else {
				f[j] = d[i];
				j++;
			}
		}
		for(int i=0; i<3; i++) {
			System.out.println(e[i] + " " + f[i]);
		}
	}
}