package E3_�迭3_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭3_�˰���_���ʿ����� {
	/*
	 * [���ʿ�����]
	 * 
	 *   �Ʒ� ��ȣ�� �Է¹ް� ������ ���� 0 �̾ƴѼ��ڸ� �����ÿ�.
		 1)left 2)right 	
		 ��) 1) left ==> arr = {2,3,4,5,0,0,0,0,0};
		 ��) 1) right ==> arr = {0,0,0,0,0,2,3,4,5};
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {0,2,0,3,4,0,0,5,0};	
		System.out.println("[1.left][2.right]");
		int sel = scan.nextInt();
		if(sel == 1) { // ��������
			int index = 0;
			int index2 = 0;
			for(int i=0; i<arr.length; i++) {
				if(arr[index] != 0) {
					int temp = arr[index];
					arr[index] = arr[index2];
					arr[index2] = temp;
					index2++;
				}
				index++;
			}
			System.out.println(Arrays.toString(arr));
		}
		else if(sel == 2) { // ������ ����
			int index = arr.length-1;
			int index2 = arr.length-1;
			for(int i=0; i<arr.length; i++) {
				if(arr[index] != 0) {
					int temp = arr[index];
					arr[index] = arr[index2];
					arr[index2] = temp;
					index2--;
				}
				index--;
			}
			System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println("����");
		}
	}
}