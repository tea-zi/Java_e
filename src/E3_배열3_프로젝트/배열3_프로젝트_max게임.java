package E3_�迭3_������Ʈ;

import java.util.Arrays;
import java.util.Scanner;

public class �迭3_������Ʈ_max���� {
	/*
	 * [max����]
	 * 
	 * 1. ���� ū ���� ã�� �Է��Ѵ�.
	 * 2. �����̸� �ش� ���� 0���� �����Ѵ�.
	 * 3. arr�迭�� ��� ���� 0���� ����Ǹ� ���α׷��� ����ȴ�.
	 * ��)
	 * 11, 87, 42, 100, 24
	 * �Է� : 100
	 * 
	 * 11, 87, 42, 0, 24
	 * �Է� : 87
	 * 
	 * 11, 0, 42, 0, 24
	 * �Է� : 24 ==> �ִ밪�� �ƴϹǷ� �ƹ��ϾȻ���
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = {11, 87, 42, 100, 24};
		int count = 0;
		int max = 0;
		int index = 0;
		for(int i=0; i<arr.length;) {
			System.out.println(Arrays.toString(arr));
			System.out.print("�Է� : ");
			int me = scan.nextInt();
			for(int j=0; j<arr.length; j++) {
				if(max < arr[j]) {
					index = j;
					max = arr[j];
				}
			}
			System.out.println(max + " " + index);
			if(me == max) {
				arr[index] = 0;
				i++;
				max = 0;
				index = 0;
			}
		}
		
	}
}