package E6_�迭6_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭6_�˰���_���Ӻ�ĭã�� {
	/*

	 [1] �迭 arr �� 1�� 0���� �Ǿ��ִ�.
	 [2] ����1 �� �̹� ä���� �ڸ��̰� 0�� ����ִ��ڸ��̴�.
	 [3] input ������ ���� �Է¹ް� �Ʒ� ������ ���� 
	  	��) input => 3 ==> �ε��� 2���� �������� 3ĭ�� ��������Ƿ�, 
	 		{0,1,1,1,1,1,0,0};	
	 		
	 	��) input => 4 ==> ��������4ĭ ����ִ��ڸ��� �����Ƿ� "x"
	 		{0,1,0,0,0,1,0,0};
	 		
	 	��) input => 1 ==> �ε��� 0�� �ڸ��� ��������Ƿ� 
	 		{1,1,0,0,0,1,0,0};	
	*/
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {0,1,0,0,0,1,0,0};
		System.out.print("���� �Է� : ");
		int input = scan.nextInt();
		int count = 0;
		int index = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 0) {
				count++;
				if(input == count) {
					index = i;
					break;
				}
			}
			else {
				count=0;
			}
		}
		if(count == input) {
			while(true) {
				if(arr[index] == 0) {
					arr[index] = 1;
					if(index != 0) {											
						index--;
					}
				}
				else {
					break;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		else {
			System.out.println(input + "ĭ �������� ���ڸ��� �����ϴ�.");
			System.out.println("x");
		}
		System.out.println(Arrays.toString(arr));
	}
}