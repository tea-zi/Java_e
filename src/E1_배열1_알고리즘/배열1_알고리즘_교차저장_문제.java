package E1_�迭1_�˰���;

public class �迭1_�˰���_��������_���� {
	/*
	 * [����1] a�� ���� b�� ���� �����ư��鼭 c�� �����Ѵ�.
	 * [��] 
	 * 	c = {10,40,20,50,30,60}
	 * 
	 * 
	 * [����2] d�� ���� �����ư��鼭 e, f �� ���� ���� 
	 * [��]
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