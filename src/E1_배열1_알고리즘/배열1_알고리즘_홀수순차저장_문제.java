package E1_�迭1_�˰���;

public class �迭1_�˰���_Ȧ����������_���� {
	/*
	 * [����1] ���� ����Ʈ�� �̿��ؼ� arr1 �� ���� Ȧ���� b �� ����(��ġ�� ��������ġ�� ����)
	 * [��]   b = { 0, 49, 51, 0, 17 }
	 * 
	 * [����2] ���� ����Ʈ�� �̿��ؼ� a �� ���� Ȧ���� c �� ����
	 * [����] ��ġ�� �տ��� ���� �����Ѵ�. 
	 * [��]   c = { 49, 51, 17, 0, 0 }
	 */
		
	public static void main(String[] args) {
		int arr1[] = { 10, 49, 51, 36, 17 };	
		int b[] = { 0,0,0,0,0 };	
		int c[] = { 0,0,0,0,0 };
		for(int i=0; i<5; i++) {
			if(arr1[i]%2 != 0) {
				b[i] = arr1[i];
			}
		}
		for(int i=0; i<5; i++) {
			System.out.print(b[i] + " ");
		}
		System.out.println();
		int j = 0;
		for(int i=0; i<5; i++) {
			if(arr1[i]%2 != 0) {
				c[j] = arr1[i];
				j++;
			}
		}
		for(int i=0; i<5; i++) {
			System.out.print(c[i] + " ");
		}
	}
}