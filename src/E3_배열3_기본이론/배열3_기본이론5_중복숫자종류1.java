package E3_�迭3_�⺻�̷�;

import java.util.Arrays;
import java.util.Random;

public class �迭3_�⺻�̷�5_�ߺ���������1 {
	public static void main(String[] args) {
		
		// �ߺ����ڱ��� ==> 1~4�� �迭�� �����ϴµ� ��� �ߺ����� �����Ѵ�. 
		// �ߺ����� �ذ��� 3���� 
		// 
		// [1] ���� 		
		Random ran = new Random();
		
		int arr1[] = new int[4]; // ���� 0 ���� 
		
		for(int i = 0; i < 4; i++) {
			arr1[i] = i + 1;
		}
		System.out.println(Arrays.toString(arr1));
	
		for(int i = 0; i < 100; i++) {
			int r1 = ran.nextInt(4);
			int r2 = ran.nextInt(4);
			int temp = arr1[r1];
			arr1[r1] = arr1[r2];
			arr1[r2] = temp;		
		}
		System.out.println(Arrays.toString(arr1));	
		
	}
}