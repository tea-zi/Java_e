package E5_�迭5_�˰���;


public class �迭5_�˰���_��������� {
	
	/* 
	 * �Ʒ��Ͱ��� �������� ������ ����غ�����.
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