package E7_�迭7_�⺻�̷�;

public class �迭7_�⺻�̷�3_�迭���ּҰ���3 {
	public static void main(String[] args) {

		int[][] darr = new int[3][];
		
		int arr1[] = {10,20,30,40,50};
		int arr2[] = {1,2,3,4};
		int arr3[] = {5,4,3,2,1};
		
		darr[0] = arr1;
		darr[1] = arr2;
		darr[2] = arr3;
		System.out.println(arr1);
		System.out.println(darr[0]);
		System.out.println(arr2);
		System.out.println(darr[1]);
		for(int i = 0; i < darr.length; i++) {
			for(int j = 0; j < darr[i].length; j++) {
				System.out.print(darr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}