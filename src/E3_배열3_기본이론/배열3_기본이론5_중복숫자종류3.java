package E3_�迭3_�⺻�̷�;

import java.util.Arrays;
import java.util.Random;

public class �迭3_�⺻�̷�5_�ߺ���������3 {
	public static void main(String[] args) {
		
		// �ߺ����ڱ��� ==> 1~4�� �迭�� �����ϴµ� ��� �ߺ����� �����Ѵ�. 
		// �ߺ����� �ذ��� 3���� 
		// 
		// [3] ��ü �˻�
		Random ran = new Random();
		int arr1[] = new int[4]; // ���� 0 ���� 
		
		for(int i = 0; i < 4;) {
			int r = ran.nextInt(4) + 1;
			boolean check = false;
			for(int j = 0; j < i; j++) {
				if(arr1[j] == r) {
					check = true;
					break;
				}
			}
			if(check == false) {
				arr1[i] = r;
				i += 1;
			}
		}
		System.out.println(Arrays.toString(arr1));
		
	}
}