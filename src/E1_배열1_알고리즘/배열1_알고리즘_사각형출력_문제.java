package E1_�迭1_�˰���;

public class �迭1_�˰���_�簢�����_���� {
	/*
	 * [����] b �迭�� �Ʒ��Ͱ��� �簢�������������Ѵ�. [��Ʈ] 3ĭ���� ���� �ٲ��ش�.
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