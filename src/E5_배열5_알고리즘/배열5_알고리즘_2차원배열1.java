package E5_�迭5_�˰���;

public class �迭5_�˰���_2�����迭1 {
	public static void main(String[] args) {

		int[][] arr = new int[3][3];

		int k = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		// ���� 1) ��ü �� ���
		// ���� 1) 450
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println(sum);
		// ���� 2) 4�� ����� ���
		// ���� 2) 20 40 60 80
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%4 == 0) {
					System.out.print(arr[i][j] + " ");
				}
			}
		}
		System.out.println();
		// ���� 3) 4�� ����� �� ���
		// ���� 3) 200
		sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%4 == 0) {
					sum += arr[i][j];
				}
			}
		}
		System.out.println(sum);
		// ���� 4) 4�� ����� ���� ���
		// ���� 4) 4
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(arr[i][j]%4 == 0) {
					count++;
				}
			}
		}
		System.out.println(count);
	}

}