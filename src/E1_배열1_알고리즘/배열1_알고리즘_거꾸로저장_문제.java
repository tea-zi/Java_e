package E1_�迭1_�˰���;

public class �迭1_�˰���_�Ųٷ�����_���� {
	/*
	 * a = { 1,2,3,4,5 };
	 * 
	 * [����] a �迭�� ���� b �迭�� �ϳ��� �����ϴµ� ������ �Ųٷ� ���� 
	 * [��]   b = {5,4,3,2,1};
	 */
	
	public static void main(String[] args) {
		
		int a[] = { 1,2,3,4,5 };
		int b[] = { 0,0,0,0,0 };
		int j = 4;
		for(int i=0; i<5; i++) {
			b[i] = a[j];
			System.out.print(b[i] + " ");
			j--;
		}
	
	}
}