package E2_�迭2_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭2_�˰���_����ü {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50 };

		// ���� 1) �ε��� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 1) �ε���1 �Է� : 1  , �ε���2 �Է� : 3
		// {10, 40, 30, 20, 50}
		System.out.print("�ε���1 �Է� : ");
		int index1 = scan.nextInt();
		System.out.print("�ε���2 �Է� : ");
		int index2 = scan.nextInt();
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		System.out.println(Arrays.toString(arr));
		// ���� 2) �� 2���� �Է¹޾� �� ��ü�ϱ�
		// �� 2) ��1 �Է� : 40 , ��2 �Է� : 20
		// {10, 20, 30, 40, 50}
		System.out.print("��1 �Է� : ");
		int num1 = scan.nextInt();
		System.out.print("��2 �Է� : ");
		int num2 = scan.nextInt();
		int temp2 = 0;
		for(int i=0; i<arr.length; i++) {
			if(num1 == arr[i]) {
				index1 = i;
			}
			if(num2 == arr[i]) {
				index2 = i;
			}
		}
		temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
		System.out.println(Arrays.toString(arr));	
		
	}

}