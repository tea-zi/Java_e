package E3_�迭3_�˰���;

public class �迭3_�˰���_��������� {
	// ����) ������ ��� �Ʒ��Ͱ��� 9�ܱ�������غ�����.
	/*
	 * === 2�� ===
	 * 2 X 1 = 2
	 * 2 X 2 = 4
	 * 2 X 3 = 6
	 * 2 X 4 = 8
	 * 2 X 5 = 10
	 * 2 X 6 = 12
	 * 2 X 7 = 14
	 * 2 X 8 = 16
	 * 2 X 9 = 18
	 * === 3�� ===
	 * 3 X 1 = 3
	 * 3 X 2 = 6
	 * ...
	 * ...
	 */
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			System.out.println("=== " + i + "�� ===");
			for(int j=0; j<10; j++) {
				System.out.println(i + " * " + j + " = " + (i*j));
			}
		}
	}
		

}