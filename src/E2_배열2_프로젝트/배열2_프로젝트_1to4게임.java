package E2_�迭2_������Ʈ;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class �迭2_������Ʈ_1to4���� {
	/*
	 * [����]
	 * 
	 * [1to4 ����]
	 * 
	 * [1] arr�迭�� 1~4 ������ ���ڸ� �ߺ����� �����Ѵ�.
	 * [2] ����ڴ� ����������1���� ������� �ش� ���ȣ(�ε���)�� �Է��Ѵ�.
	 * [3] ������ ���߸� �ش� ���� 9�� ����Ǿ� ��� ���� 9�� �Ǹ� ������ ����ȴ�.
	 * 
	 * [��]
	 * 
	 * ���� : { 4 2 3 1 }
	 * 
	 * �ε��� �Է� : 3  ==> { 4 2 3 9 } ==> 1�� �����������̹Ƿ� 9�� �����Ѵ�.
	 * 
	 * �ε��� �Է� : 0 ==>  { 4 2 3 9 }  ==> 4�� �������������ƴϹǷ� ��ȭ������.
     *
     * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		int[] arr = new int[4];
		boolean[] check = new boolean[4];
		for(int i=0; i<arr.length;) {
			int num = ran.nextInt(4);
			if(check[num] == false) {
				check[num] = true;
				arr[i] = num+1;
				i++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=1; i<=arr.length;) {
			System.out.println(Arrays.toString(arr));
			System.out.print("�ε��� �Է� : ");
			int sel = scan.nextInt();
			if(arr[sel] == i) {
				arr[sel] = 9;
				i++;
				if(i == 5) {
					System.out.println("��������");
				}
			}
		}
	}
}