package E5_�迭5_�˰���;

import java.util.Arrays;
import java.util.Scanner;

public class �迭5_�˰���_2�����迭2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[][] arr = new int[3][3];
		
		int k = 1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				arr[i][j] = 10 * k;
				k += 1;
			}
		}
		
		// ����1) �ε��� 2���� �Է¹޾� �� ���
		// ��1) �ε���1 �Է� : 1	�ε���2 �Է� : 2
		//		   �� ��� : 60 
		System.out.print("�ε���1 �Է� : ");
		int index1 = scan.nextInt();
		System.out.print("�ε���2 �Է� : ");
		int index2 = scan.nextInt();
		System.out.print("arr[" + index1 + "][" + index2 + "] �� �� : ");
		System.out.println(arr[index1][index2]);
		// ����2) ���� �Է¹޾� �ε��� 2�� ���
		// ��2) �� �Է� : 60
		//		   �ε���1 ��� : 1	�ε���2 ��� : 2
		System.out.print("�� : ");
		int num = scan.nextInt();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(num == arr[i][j]) {
					System.out.println("�ε��� 1 : " + i + " �ε���2 : " + j);
				}
			}
		}
		// ����3) ���� ū ���� �ε��� 2�� ���
		// ����3) 2 2
		int max = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(max < arr[i][j]) {
					max = arr[i][j];
					index1 = i;
					index2 = j;
				}
			}
		}
		System.out.println("max�� : " + max + " , �ε���1 : " + index1 + " , �ε���2 : " + index2);
		// ����4) �� 2���� �Է¹޾� �� ��ü
		System.out.print("��1 : ");
		num = scan.nextInt();
		System.out.print("��2 : ");
		int num1 = scan.nextInt();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				if(num == arr[i][j]) {
					arr[i][j] = num1;
				}
				else if(num1 == arr[i][j]) {
					arr[i][j] = num;
				}
			}
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
	}
}